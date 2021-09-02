package test;

import java.sql.SQLException;

import model.ProductDAO;

public class TestProductDAO2 {
	public static void main(String[] args) {
		try {
			ProductDAO dao =  new ProductDAO();
			int productID = 7;
			boolean result = dao.existsById(productID);
			if(result)
				System.out.println(productID + " 아이디 상품이 존재합니다.");
			else 
				System.out.println(productID + " 아이디 상품이 존재하지 않습니다.");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
