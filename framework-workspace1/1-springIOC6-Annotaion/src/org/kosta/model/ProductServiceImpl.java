package org.kosta.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//Component 계열 어노테이션
@Service
public class ProductServiceImpl implements ProductService {
	private ProductDAO productDAO;
	@Autowired //DI 계열 어노테이션 -> spring container
	public ProductServiceImpl(ProductDAO productDAO) {
		super();
		this.productDAO = productDAO;
	}
	
	@Override
	public void register(String productInfo) {
		productDAO.register(productInfo);
	}
}
