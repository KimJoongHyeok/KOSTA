package model;

import java.sql.SQLException;

import javax.sql.DataSource;

public class MemberDAOimpl implements MemberDAO {
	private DataSource dataSource;
	
	public MemberDAOimpl(DataSource dataSource) {
		super();
		this.dataSource = dataSource;
	}

	@Override
	public void register(String memberInfo) {
		try {
			System.out.println(memberInfo + " 회원정보를 db에 등록 " + dataSource.getConnection());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
