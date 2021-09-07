package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import test.AccountNotFoundException;
import test.CreateAccountException;
import test.NotMatchedPasswordException;

public class AccountDAO {
	public AccountDAO() throws ClassNotFoundException {
		Class.forName(DBinfo.DRIVER);
	}

	public void closeAll(PreparedStatement pstmt, Connection con) throws SQLException {
		if (pstmt != null)
			pstmt.close();
		if (con != null)
			con.close();
	}

	public void closeAll(ResultSet rs, PreparedStatement pstmt, Connection con) throws SQLException {
		if (rs != null)
			rs.close();
		closeAll(pstmt, con);
	}

	private Connection getConnection() throws SQLException {
		return DriverManager.getConnection(DBinfo.URL, DBinfo.USERNAME, DBinfo.PASSWORD);
	}

	public void createAccount(AccountVO vo) throws SQLException, CreateAccountException {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = getConnection();
			String sql = "insert into Account values(account_seq.nextval,?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getPassword());
			pstmt.setInt(3, vo.getBalance());
			if (vo.getBalance() < 1000) {
				throw new CreateAccountException("계좌 개설시 납입금은 1000원 이상이어야 합니다.");
			}
			pstmt.executeUpdate();
		} finally {
			closeAll(pstmt, con);
		}

	}

	public String findBalanceByAccountNo(String accountNo, String password)
			throws SQLException, AccountNotFoundException, NotMatchedPasswordException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String balance = null;
		try {
			con = getConnection();
			String sql = "select balance from account where account_no = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, accountNo);
			rs = pstmt.executeQuery();
			if(rs.next() == false) {
				throw new AccountNotFoundException("미등록 계좌번호 입니다.");
			}
			pstmt.close();
			rs.close();
			
			String sql2 = "select balance from account where password = ?";
			pstmt = con.prepareStatement(sql2);
			pstmt.setString(1, password);
			rs = pstmt.executeQuery();
			if(rs.next() == false) {
				throw new NotMatchedPasswordException("비밀번호가 일치하지 않습니다.");
			}
			pstmt.close();
			rs.close();
			
			String sql3 = "select balance from account where account_no = ? and password = ?";
			pstmt = con.prepareStatement(sql3);
			pstmt.setString(1, accountNo);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				balance = rs.getString(1);
			}
		} finally {
			closeAll(rs, pstmt, con);
		}
		return balance;
	}

}
