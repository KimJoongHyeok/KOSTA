/*
 * SQL : 데이터베이스를 정의 조작 제어 하기 위한 언어
 * 1.DDL : 데이터 정의어 - CREATE,DROP.ALTER
 * 2.DML : 데이터 조작어  - INSERT,SELECT,DELETE,UPDATE
 * 3.DCL : 데어티 제어어 - COMMIT,ROLLBACK
 * 
 * DATA TYPE : 문자열 - 오라클에서 권장하는 문자열 타입 VARCHAR2(10)
 * 
 * 
 * 
 * */


create table typetest(
	name varchar2(9) primary key,
	money NUMBER not null
)

select * from typetest;

insert into TYPETEST(name,money) values ('abcdefghi',100);
insert into TYPETEST(name,money) values ('abcdefghi',100);
-- 한글은 3byte  아래는 12byte 이므로 error
insert into TYPETEST(name,money) values ('아이유님',100);
insert into TYPETEST(name,money) values ('아이유',100);

-- name 이 아이유인 대상의 money를 +200 누적해본다
update typetest set money = money + 200 where name = '아이유';

--DDL : 테이블 삭제

DROP TABLE TYPETEST;

--DDL : ALTER - 테이블 정보를 변경 (TABLE 명 변경 , COLUMN 명 변경, 제약조건 및 타입 변경)

CREATE TABLE altertest(
	id varchar2(100) primary key,
	hit number default 0
)

--default 제약조건 : 별도로 insert 하지 않으면 0으로 초기값이 저장
-- dml : insert , hit는 0으로 저장한다
insert into altertest(id) values('java');

select * from altertest;
select * from altertest2;

--ddl : alter를 이용해 테이블명을 altertest2로 변경
alter table altertest rename to altertest2;

--ddel : alter를 이용해 컬럼명을 hit에서 count로 변경
alter table altertest2 rename column hit to count;

/*
 * 테이블명 : product 
 * 컬럼영 : id,name,maker, price
 * 데이터타입 : id,price 는 number 
 * 			 name, maker 는 varchar2(100)
 * 제약조건 : id 는 primary key
 * 		    name,maker 는 not null
 * 			price 는 default 는 0
 * 
 * --DDL
 * 
 * 
 * 
 * 
 * */
create table product(
	id number primary key,
	name VARCHAR2(100) NOT NULL,
	maker varchar2(100) not null,
	price NUMBER default 0
)

CREATE TABLE PRODUCT(
	ID NUMBER PRIMARY KEY,
	NAME VARCHAR2(100) NOT NULL,
	MAKER VARCHAR2(100) NOT NULL,
	PRICE NUMBER DEFAULT 0
)

--DML : INSERT
INSERT INTO PRODUCT VALUES(1,'불닭볶음면','삼양',1500);
insert into product values(2,'진라면','오뚜기',1100);
insert into product values(3,'테라','하이트진로',1800);
insert into product values(4,'참이슬','후레쉬',1300);
UPDATE PRODUCT SET MAKER = '하이트진로' WHERE MAKER = '후레쉬';
-- DCL
commit 

SELECT * FROM PRODUCT;

SELECT COUNT(*) FROM PRODUCT; --총 상품수
SELECT COUNT(*) FROM MEMBER;

-- 상품 최저가
SELECT MIN(PRICE) FROM PRODUCT;
-- 상품 최고가
SELECT MAX(PRICE) FROM PRODUCT;

SELECT ROUND(AVG(PRICE)) FROM PRODUCT;

SELECT NAME,PRICE FROM PRODUCT ORDER BY PRICE;
select * from product;
/*
 * select
 * from 
 * where
 * order by
 */

--MAKER가 하이트진로인 상품의 ID,NAME,PRICE를 조회하되 PRICE 내림차순으로 정렬
SELECT ID,NAME,PRICE FROM PRODUCT WHERE MAKER = '하이트진로' ORDER BY PRICE DESC;

select * from product;
--price 가 1300이상 , 2000이하 인 상품의 name ,price 를 조회 (price 오름차순)
select name,price from product where price >= 1300 and price <= 2000 order by price asc;
select name,price from product where price between 1300 and 2000 order by price asc;

--primary key로 검색해서 상품 존재 유무 확인

select count(*) from product where id = 1;
select count(*) from product where id = 7;

--컬럼 별칭
select min(price) as 최저가 from product;

select distinct maker from product; --중복제외


