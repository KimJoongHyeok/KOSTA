package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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

	public int findBalanceByAccountNo(String accountNo, String password)
			throws SQLException, AccountNotFoundException, NotMatchedPasswordException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int balance = 0;
		try {
			con = getConnection();
			String sql = "select balance from account where account_no = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, accountNo);
			rs = pstmt.executeQuery();
			if (rs.next() == false) {
				throw new AccountNotFoundException("미등록 계좌번호 입니다.");
			}
			pstmt.close();
			rs.close();

			String sql2 = "select balance from account where password = ?";
			pstmt = con.prepareStatement(sql2);
			pstmt.setString(1, password);
			rs = pstmt.executeQuery();
			if (rs.next() == false) {
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
				balance = rs.getInt(1);
			}
		} finally {
			closeAll(rs, pstmt, con);
		}
		return balance;
	}

	public void checkAccountNoAndPassword(String accountNo, String password)
			throws SQLException, NotMatchedPasswordException, AccountNotFoundException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			String sql = "select password from account where account_no = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, accountNo);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				if (rs.getString(1).equals(password) == false) {
					throw new NotMatchedPasswordException("비밀번호가 일치하지 않습니다.");
				}
			} else {
				throw new AccountNotFoundException(accountNo + "계좌번호가 일치하지 않습니다.");
			}

		} finally {
			closeAll(rs, pstmt, con);
		}
	}

//	public void deposit(String accountNo, String password, int balance)
//			throws SQLException, AccountNotFoundException, NotMoneyException, NotMatchedPasswordException {
//		Connection con = null;
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//		int result = 0;
//		try {
//			con = getConnection();
//			String sql = "select balance from account where account_no = ?";
//			pstmt = con.prepareStatement(sql);
//			pstmt.setString(1, accountNo);
//			rs = pstmt.executeQuery();
//			if (rs.next() == false) {
//				throw new AccountNotFoundException("미등록 계좌번호 입니다.");
//			}
//			pstmt.close();
//			rs.close();
//
//			String sql2 = "select balance from account where password = ?";
//			pstmt = con.prepareStatement(sql2);
//			pstmt.setString(1, password);
//			rs = pstmt.executeQuery();
//			if (rs.next() == false) {
//				throw new NotMatchedPasswordException("비밀번호가 일치하지 않습니다.");
//			}
//			int originalbalance = rs.getInt(1);
//			pstmt.close();
//			rs.close();
//
//			String sql3 = "update account set balance = ? where account_No = ? and password = ?";
//			pstmt = con.prepareStatement(sql3);
//			pstmt.setInt(1, originalbalance + balance);
//			if (balance < 0) {
//				throw new NotMoneyException("입금액은 0원을 넘어야 입금할 수 있습니다.");
//			}
//			pstmt.setString(2, accountNo);
//			pstmt.setString(3, password);
//			result = pstmt.executeUpdate();
//			if (result == 1) {
//				System.out.println("입금 완료");
//			}
//		} finally {
//			closeAll(rs, pstmt, con);
//		}
//	}
	public void deposit(String accountNo, String password, int money)
			throws SQLException, AccountNotFoundException, NotMoneyException, NotMatchedPasswordException {
		if(money<=0) {
			throw new NotMoneyException("입금액은 0원을 초과해야 합니다.");
		}
		//int balance = findBalanceByAccountNo(accountNo, password);
		checkAccountNoAndPassword(accountNo, password);
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = getConnection();
			String sql = "update account set balance = balance + ? where account_no = ?";
			pstmt = con.prepareStatement(sql);
			//pstmt.setInt(1, balance + money);
			pstmt.setInt(1, money);
			pstmt.setString(2, accountNo);
			pstmt.executeUpdate();
		} finally {
			closeAll(pstmt, con);
		}
	}

	public void depositMyver(String accountNo, String password, int balance)
			throws SQLException, AccountNotFoundException, NotMoneyException, NotMatchedPasswordException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int originbalance = 0;
		try {
			con = getConnection();
			String sql = "select password,balance from account where account_no = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, accountNo);
			rs = pstmt.executeQuery();
			if (rs.next()) { // 계좌번호에 해당하는 계과가 있으면
				if (rs.getString(1).equals(password)) { // 매개변수 password 와 db의 password 가 일치하면
					originbalance = rs.getInt(2);
				} else { // 매개변수 password 와 db의 password 가 일치하지 않으면
					throw new NotMatchedPasswordException("계좌의 패스워드가 일치하지 않습니다");
				}
			} else { // 계좌번호에 해당하는 계좌가 존재하지 않으면
				throw new AccountNotFoundException(accountNo + "계좌번호에 해당하는 계좌가 존재하지 않습니다");
			}
			pstmt.close();
			// rs.close();

			String sql3 = "update account set balance = ? where account_No = ? and password = ?";
			pstmt = con.prepareStatement(sql3);
			pstmt.setInt(1, originbalance + balance);
			if (balance <= 0) {
				throw new NotMoneyException("입금액은 0원을 넘어야 입금할 수 있습니다.");
			}
			pstmt.setString(2, accountNo);
			pstmt.setString(3, password);
			pstmt.executeUpdate();
		} finally {
			closeAll(rs, pstmt, con);
		}
	}

	public void withdraw(String accountNo, String password, int money) throws SQLException, AccountNotFoundException,
			NotMatchedPasswordException, InsufficientBlanceException, NotMoneyException {
		Connection con = null;
		PreparedStatement pstmt = null;
		int balance = findBalanceByAccountNo(accountNo, password);
		if (balance < money) {
			throw new InsufficientBlanceException("계좌에 잔액이 충분하지 않습니다.");
		}
		if (money <= 0) {
			throw new NotMoneyException("출금액은 0원을 넘어야 출금할 수 있습니다.");
		}
		try {
			con = getConnection();
			String sql = "update account set balance = balance - ? where account_no = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, money);
			pstmt.setString(2, accountNo);
			pstmt.executeUpdate();

		} finally {
			closeAll(pstmt, con);
		}
	}

	public boolean existsAccountNo(String accountNo) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		boolean flag = false;
		try {
			con = getConnection();
			String sql = "select count(*) from account where account_no = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, accountNo);
			rs = pstmt.executeQuery();
			if (rs.next() && rs.getInt(1) == 1)
				flag = true;
		} finally {
			closeAll(rs, pstmt, con);
		}
		return flag;
	}

	/**
	 * 계좌 이체메서드 이체액이 0원 초과인지 확인 
	 * 수금자 계좌번호 확인 
	 * 송금좌 계좌번호,비밀번호 확인 
	 * 송금자 계좌잔액을 확인 (이체액보다 잔액이작으면 에외 발생)
	 * 
	 * @param senderAccouneNo
	 * @param password
	 * @param money
	 * @param receiverAccountNo
	 * @throws NotMatchedPasswordException 
	 * @throws AccountNotFoundException 
	 * @throws SQLException 
	 * @throws InsufficientBlanceException 
	 * @throws NotMoneyException 
	 */
	public void transfer(String senderAccountNo, String password, int money, String receiverAccountNo) throws SQLException, AccountNotFoundException, NotMatchedPasswordException, InsufficientBlanceException, NotMoneyException {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		int senederbalance = findBalanceByAccountNo(senderAccountNo, password);
		checkAccountNoAndPassword(senderAccountNo, password);
		
		if(existsAccountNo(receiverAccountNo)==false) {
			throw new AccountNotFoundException("이체받을 계좌가 존재하지 않습니다.");
		} 
		if(money <= 0) {
			throw new NotMoneyException("이체액은 0원을 초과해야 합니다.");
		}
		if(senederbalance < money) {
			throw new InsufficientBlanceException("잔액 부족으로 이체할 수 없습니다.");
		}
		try {
			con = getConnection();
			con.setAutoCommit(false);
			String sql = "update account set balance = balance - ? where account_no = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, money);
			pstmt.setString(2, senderAccountNo);
			pstmt.executeUpdate();
			pstmt.close();
			
			String sql2 = "update account set balance = balance + ? where account_no = ?";
			pstmt = con.prepareStatement(sql2);
			pstmt.setInt(1, money);
			pstmt.setString(2, receiverAccountNo);
			pstmt.executeUpdate();
			con.commit();
		} catch(Exception e) {
			con.rollback();
			throw e;
		}
		finally {
			closeAll(pstmt,con);
		}
	}

	public ArrayList<AccountVO> findHighestAccount() throws SQLException {
		ArrayList<AccountVO> list = new ArrayList<AccountVO>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			String sql = "select account_no,name,balance from account where balance = (select max(balance) from account)";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				//list.add(new AccountVO(rs.getString(1),rs.getString(2),null,rs.getInt(3)));
				list.add(new AccountVO(rs.getString("account_no"),rs.getString("name"),null,rs.getInt("balance")));
			}
		}finally {
			closeAll(rs,pstmt,con);
		}
		return list;
	}

}
