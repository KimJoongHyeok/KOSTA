-- sql 한줄 주석

/*
 * sql 여러줄주석
 * sql 은 대소문자 구별하지 않는다.
 * 
 * SQL (Structured Query Language ) : 데이터베이스를 제어하는 언어
 * 									  데이터베이스를 정의,조작,제어하는 언어
 * 
 * DDL, DML, DCL ( SQL은 다음과 같은 범주로 구분될 수 있다 )
 * 1.DDL ( Data Definition Language : 데이터 정의어 )  - create 생성, drop 삭제, alter 수정
 * 2.DML ( Data Manifulation Language : 데이터 조작어 ) - insert 삽입 ,select 조회,  update 수정, delete 삭제 ( CRUD - Create,Read,Update,Delete)
 * 3.DCL ( Data Control Language : 데어티 제어어 ) - COMMIT 실제DB에 반영, ROLLBACK 작업을 취소하고 원상태로 되돌린다.
 * 												 GRANT 권한부여,REVOKE 권한 취소
 * 
 * TABLE - 데이터를 저장하는 공간
 * COLUMN - 속성 ATTRIBUTE
 * CONSTRAINT - 제약조건	EX) PRIMARY KEY ( PK ,기본키 ) -> 중복을 허용하지 않고 NOT NULL 이어야 한다( UNIQUE + NOT NULL )
 * DATA TYPE - 문자열 VARCHAR2(100) , 숫자형 NUMBER ...
 * 
 */

-- SQL 실행 단축키 : 영역 지정 후 ALT + X

-- DDL : 테이블 생성
CREATE TABLE member(
	id VARCHAR2(100) PRIMARY KEY,
	password VARCHAR2(100) NOT NULL,
	name VARCHAR2(100) NOT NULL,
	address VARCHAR2(100) 
)

-- DML : 데이터 조회 Read
SELECT * FROM member;
-- DML : 데이터 삽입 Create
INSERT INTO member(id,password,name,address) VALUES('java','a','아이유','오리');
INSERT INTO member(id,password,name,address) VALUES('spring','s','김중혁','영통')

SELECT id,name FROM member;

-- ERROR : ID의 제약조건 : PRIMARY KEY -> UNIQUE + NOT NULL , ID가 중복되므로 ERROR
INSERT INTO member(id,password,name,address) VALUES('java','b','아이유','오리');

INSERT INTO member(id,password,name,address) VALUES('java','a','아이유','오리');

-- ERROR : password는 not null이기 때문ㅇ
INSERT INTO member(id,name,address) VALUES ('jdbc','어이유','죽전');

INSERT INTO member(id,password,name) VALUES ('jdbc','star','박보검');

select * from member;

--WHERE 조건절을 이용해 정보 조회
--id가 java인 회원의 name과 address를조회

select name,address from member where id = 'java';
-- 결과가 없으면 error 가 뜨는게 아니라 결과가 없는값으로 나옴
select name,address from member where id = 'java2';
select name,address from member where name = '아이유' and address = '오리';

select * from member;
--id가 jdbc 인 회원 주소를 제주로 업데이트
select * from member where id = 'jdbc' update address set '제주';
update member set address = '제주' where id = 'jdbc';

delete from member where id = 'jdbc';

--DML ( CRUD : CREAET -insert read - select update - update delete delete ) 연습

-- 회원 아이디 angel,패스워드 kind,이름 이상순 주소 애월읍
select * from member;
insert into member(id,password,name,address) values('angel','kind','이상순','애월읍');
insert into member values('angel2','kind','이상순','애월읍');

select id,password from member where name = '이상순' and address = '애월읍';
delete from member where id = 'angel2';
update member set address = '오리' where address = '애월읍';
select id,name from member where address = '오리';

--회원의 id가 angel 이고 password가 kind 인 회원정보를 삭제
delete from member where id = 'angel' and password = 'kind';

--회원 id가 angel인 회원의 name을 조회 (삭제했으므로 조회 결과는 없다)
select name from member where id = 'angel';

commit











