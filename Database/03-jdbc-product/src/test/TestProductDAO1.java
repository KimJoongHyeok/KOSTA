package test;

import java.sql.SQLException;

import model.ProductDAO;

public class TestProductDAO1 {
	public static void main(String[] args) {
		// 총 상품수 조회
		try {
			ProductDAO dao = new ProductDAO();
			int totalCount = dao.getProductTotalCount();
			System.out.println("총 상품 수 : " + totalCount);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
