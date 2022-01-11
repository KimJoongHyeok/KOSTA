package org.kosta.myapp.repository;

import java.util.List;

import org.kosta.myapp.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
	List<Product> findAllByOrderByIdDesc();
	
}
