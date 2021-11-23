package org.kosta.model;

import org.springframework.stereotype.Repository;

@Repository
public class ProductDAOImpl implements ProductDAO {
	
	@Override
	public void register(String ProductInfo) {
		System.out.println(getClass().getName() + " register " + ProductInfo);
	}
}
