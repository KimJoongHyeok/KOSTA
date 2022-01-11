package org.kosta.myapp.controller;

import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;

import org.kosta.myapp.entity.Product;
import org.kosta.myapp.repository.ProductRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@SuppressWarnings({ "unchecked", "rawtypes" })
@RestController // @Controller + @ResponseBody
public class ProductController {
	@Resource
	private ProductRepository productRepository;

	@GetMapping("/products")
	public List getAllProductList() {
		return productRepository.findAllByOrderByIdDesc();
	}

	/*
	 * @PathVariable : url 정보를 변수로 할당받기 위한 어노테이션 {id} 자리에 해당 어노테이션이 선언된 변수로 데이터가
	 * 할당된다
	 */

	@GetMapping("/products/{id}")
	public ResponseEntity findProductById(@PathVariable("id") int id) {
		Optional<Product> product = productRepository.findById(id);
		if (product.isPresent()) {
			return new ResponseEntity(product, HttpStatus.OK);
		}
		return new ResponseEntity("상품이 존재하지 않습니다", HttpStatus.NOT_FOUND);
	}

	@PostMapping(value = "/products")
	public ResponseEntity registerProduct(Product product) {
		System.out.println("Request Method : POST");
		if (productRepository.existsById(product.getId())) {
			return new ResponseEntity("상품 아이디가 중복됩니다", HttpStatus.CONFLICT);
		} else {
			productRepository.save(product);
			return new ResponseEntity(product.getId() + " " + product.getName() + " 상품등록완료", HttpStatus.OK);
		}
	}

	@DeleteMapping("/products/{id}")
	public ResponseEntity deleteProduct(@PathVariable int id) {
		System.out.println("Request Method : DELETE");
		if (productRepository.existsById(id)) {
			productRepository.deleteById(id);
			return new ResponseEntity(id + " id 상품정보삭제완료", HttpStatus.OK);
		} else {
			return new ResponseEntity(id + "상품 아이디에 대한 상품이 없어 삭제 불가", HttpStatus.NOT_FOUND);
		}
	}

	@PutMapping("/products")
	public ResponseEntity updateProduct(Product product) {
		System.out.println("Request Method : PUT " + product);
		if (productRepository.existsById(product.getId())) {
			productRepository.save(product);
			return new ResponseEntity(product.getId() + " id 상품정보수정완료", HttpStatus.OK);
		} else {
			return new ResponseEntity(product.getId() + "번 상품 아이디에 대한 상품이 없어 수정불가", HttpStatus.NOT_FOUND);
		}
	}
	// 페이지별 상품리스트를 조회하기 위한 메서드 
	// src/test/java 의 unitTest 마지막 부분에서 상품데이터를 저장한 후 테스트해본다 
	@GetMapping("/products/page/{pageNo}")
	public List<Product> getAllProductList(@PathVariable int pageNo) {
		// 0이 첫페이지이므로 pageNo-1을 한다 
		 Page<Product> page=productRepository.findAll(PageRequest.of(pageNo-1,5,Sort.by("id").descending()));		
		return page.toList();
	}
}
