package model;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository //컴포넌트 계열
public class MemberDAOimpl implements MemberDAO {
	private DataSource dataSource;
	@Autowired //DI 계열 
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
