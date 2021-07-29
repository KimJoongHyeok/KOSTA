# KOSTA
 KOSTA 교육 정리
 
**1일차 주요 목차**

<전체 과정 커리큘럼 소개>

	- Java SE (1개월) 
	- Database(Oracle) JDBC 2주
	- Web 기초(HTML,CSS,JavaScript 기초)
	- Java Web Programming (총 4주)
	- Ajax, jQuery (JavaScript 심화)
	- DB Modeling, OOAD(객체지향분석&설계)
	- Design Pattern(Singleton, Template Method, MVC, Front Controller 등)
	- 소프트웨어 개발방법론 - 애자일
	- 형상관리 (git)
	- Semi Project (총 3주) -> final project를 위한 프로젝트
	- Framework(총 4주) -> Spring (IOC, DI, DL, AOP, MVC, Maven, jUnit, Log4, REST,
						  SpringBoot, Security, MSA(Spring Cloud)는 특강, 
						  MyBatis, Tiles Framework)
	- Final Project (총 4주)


Java SE(총 4주) <세부 커리큘럼소개>
	- Java 기본소개
	- 환경설정
	- 객체지향 (Object Oriented) - 캡슐화
	- 자바기본문법 (변수, 메서드, 생성자)
	- 데이터 타입, 객체
	- UML - 객체(or 클래스) 관계
	- 변수 범위
	- 배열
	- 상속
	- 다형성
	- String/ StringBuilder/ StringBuffer
	- Exception Handling
	- IO(File IO, Object Serialization)
	- Thread (기본 개념, Multi Threading, syncronized)
	- Network
	- 수업진행중 mini Project 할 예정
 
 **2일차 주요 목차(내일 할 수업 목차)**
	- Java SE 개발 환경설정
	- Java 기본 소개
	- Java 기본 프로그램 작성 및 실행
	- 객체 지향 개념(객체, 클래스 , 객체와 클래스의 관계, 객체의 구성요소)
	- Java 기본 문법(클래스 ,객체, 변수, 메서드, 생성자)
	
---------------------------------------------------------------------

-Java SE 개발 환경 설정 : 1day 프로젝트의 Java SE-환경설정.txt에 정리되어있음
 	요약하면 jdk설치 ,ide인 eclipse 를 설치 후 각각 설정
 	jdk -> java development kit(자바 개발 도구)중 Java SE jdk를 설치 후 설정
 	ide -> 통합 개발 환경(Integrated Development Environment,IDE)인 eclipse를 설치 후 설정
 	
 
 -Java 기본 소개
 1.객체 지향 언어(이후 소개 예정) : Objected Oriented Concept이 적용된 프로그래밍 언어
 2.네트워킹을 위해 고안된 언어: 홈네트워크(스마트홈)을 위해 1990년대 초반에 oak라는 이름의 언어로 탄생
 						  이후 라이센스 관련해 java라는 이름으로 개명
 3.플랫폼 독립적 -> OS별로 프로그램을 만들지 않아도 된다(OS 별로 jdk를 제공)
 				한번 작성한 프로그램은 어떤 환경에서도 동일하게 동작한다
 				"Write Once, Run Anywhere"
 				
 	JDK : Java Development Kit 자바 개발 도구
 	JRE : Java Runtime Environment 자바 개발 환경
 	JVM : Java Virtual Machine 자바 가상 기계 (OS와 Java Program과 의 통역자 역할)
 	
 	JDK > JRE > RVM
 	
 -Java 기본 프로그램 작성 및 실행
 개발자는 Hello.java라는 프로그램을 작성
 command line상에서 javac  Hello.java 명령어를 입력하면 java파일을 이용해 컴파일된 class파일이 생성됨
 (컴파일은 jvm이 해성하기 위한 bytecode 즉 기계어로 만드는 작업)
 java Hello 라는 명령어로 class파일을 실행하면 실행결과가 출력됨
 (위 과정을 ide통합개발환경인 eclipse에서는 저장시에 컴파일되고 실행 단축기 ctlr + f11로 class를 실행한다)
 
 -객체지향개념(객체, 클래스, 객체와 클래스의 관계, 객체의 구성요소)
 객체지향 (Object-Oriented) 
 		분석 설계 기법 중 하나
 		시스템의 기본 단위를 객체로 상정하고
 		객체와 객체의 관계를 중심으로 분석 설계하는 기법을 말한다.
 		
 객체(Object) -> 시스템의 기본 단위, 시스템을 구성하는 주요 사물이나 개념을 객체로 상정
 				객체는 속성과 기능으로 구성된다
 				속성 : variable(변수), attribute
 				기능 : method, operation
 클래스(Class) -> 객체를 위한 틀 or 설계도
 				ex) 붕어빵틀(class)로부터 붕어빵(object)가 생성된다
 					설계도(class)로부터 건물(object)가 생성된다.
 					
 변수(Variable) -> 정보를 저장하는 공간(정보는 변경될 수 있다.)
 				  변수는 클래스 내부에서 정의되고 인스턴스 변수,지역변수,클래스변수 등이 있다
 
 메서드(method) -> 객체의 기능을 정의
 				
 		
 "낯설음으로부터 시작해서 익숙해지는 과정"
 
 소프트웨어 개발 수명주기(Software Development Life Cycle : SDLC) or 소프트웨어 개발 단계
 	요구사항 분석 -> 설계 -> 개발 -> 테스트 -> 운영(유지보수)단계로 구성
 	
 소프트웨어 개발 방법론
 :폭포수 모델 -> 단계별 완료 후 다음 단계 수행, 애자일 모델 -> 반복,점증
 
 UML -> (통합 모델링 언어 , Unified Modeling Language)
 		분석 단계 Usecase Diagram
 		설계 단계 Class Diagram
 UML은 OOAD(Object Oriented Analysis & Design 객체지향 분석 설계)를 위한 표기 언어
 		
 
 
 
 
