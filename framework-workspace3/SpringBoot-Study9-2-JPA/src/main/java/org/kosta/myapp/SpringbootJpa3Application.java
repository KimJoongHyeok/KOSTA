package org.kosta.myapp;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootJpa3Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJpa3Application.class, args);
	}
	/*
	Entity :
	DB 테이블과 대응되는 모델링 클래스  
	테이블에 없는 필드를 가져서는 안됨 
	
	
	DTO : 
	Data Transfer Object 
    계층간 데이터 전송 역할 
	
	Entity 와 DTO로 역할을 분리하는 것이 바람직
	
	View <-> Controller  : DTO(Data Transfer Object)로 데이터 교환
	Service <--> Repository : Entity 를 이용 
	
	
	Entity가 변하면 db에 반영되고 
	다른 로직에 영향을 미침
	예를 들면 API 서버와 사용자 시스템 사이에는 약속된 구조화된 데이터가 전송됨 
	만약 컨트롤러에서 Entity로 서비스를 할 경우 DB 변경 - Entity 변경 -> API Response 또한 변경된다 
	즉 명세화된 약속이 자주 변경될 수 있다 
	또한 View와 연동하면서 데이터 변경이 필요한 경우가 있으므로 DTO로 분리하는 것이 바람직 
	( Entity 를 변경하면 DB가 바뀔 수 있기 때문에 )  
​	 
	ModelMapper : Entity 와 DTO를  변환 수행해 Mapping 하는 역할을 함   
	 */
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
