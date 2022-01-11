package org.kosta.myapp;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.kosta.myapp.repository.ProductRepository;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootJpa2ApplicationTests {
	@Resource
	ProductRepository productRepository;

	@Test
	void contextLoads() {

		// 상품 등록 -> 상품아이디 ( sequence ) 는 자동생성되는 지 확인
		// productRepository.save(new Product("비빔면","팔도",1100));
		// productRepository.save(new Product("진라면","오뚜기",1300));
		// System.out.println(productRepository.findAll());
		// 상품수 조회
		// System.out.println(productRepository.count());

		// 상품아이디로 조회
		// System.out.println(productRepository.findById(1));
		// 상품 아이디 내림차순 정렬
		/*
		List<Product> list = productRepository.findAllByOrderByIdDesc();
		for (Product p : list)
			System.out.println(p);
		*/
		// 여러 데이터를 저장한다
		/*
		 for(int i=0;i<20;i++)
		 productRepository.save(new Product("갤럭시"+i,"삼성",10*i));
		*/
		// 람다식으로 리스트 출력해본다 ( java-lambda-study 프로젝트 예제를 참고하면 됨 )
		// productRepository.findAllByOrderByIdDesc().forEach((p)->System.out.println(p));
		// 람다식으로 리스트 출력(줄여서 표현)
		// productRepository.findAllByOrderByIdDesc().forEach(System.out::println);

		// 페이징 테스트 1 페이지(페이지는 0부터 시작) , 페이지당 상품 5개 , id 내림차순 정렬
		//0은 1page , 1은 2page에 해당하는 상품 5개 이하의 id 내림차순으로 정렬된 리스트를 반환한다 
		/*
		 Page<Product>
		 page=productRepository.findAll(PageRequest.of(1,5,Sort.by("id").descending()));		
		 page.forEach((product)->System.out.println(product));	
		 */	
	}
}
