package test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import model.ProductDAO;

public class TestGroupBy2 {
	public static void main(String[] args) {
		try {
			ProductDAO dao = new ProductDAO();
			ArrayList<HashMap<String,Object>>list = dao.findProductMakerGroupLessThanAvgAPrice();
			for(int i = 0;i<list.size();i++) {
				HashMap<String,Object> map = list.get(i);
				System.out.println("maker : " + map.get("maker") + " avgprice : " + map.get("avgprice"));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
