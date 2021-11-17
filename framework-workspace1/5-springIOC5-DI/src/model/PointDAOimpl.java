package model;

import java.sql.SQLException;

import javax.sql.DataSource;

public class PointDAOimpl implements PointDAO {
	
	private DataSource dataSource;
	//dbcp를 DI 즉 컨테이너로부터 주입
	public PointDAOimpl(DataSource dataSource) {
		super();
		this.dataSource = dataSource;
	}

	@Override
	public void register(String pointInfo) {
		try {
			System.out.println(pointInfo + " 포인트 정보를 db에 등록 " + dataSource.getConnection());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
