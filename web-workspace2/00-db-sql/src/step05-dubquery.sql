/*
	subquery : 서브 쿼리 , 부쿼리, 하위쿼리
			   SQL 내의 SQL
*/
SELECT * FROM PRODUCT;

-- 상품정보중 가장 비싼 가격의 상품명은 ?
SELECT NAME FROM PRODUCT WHERE PRICE = (SELECT MAX(PRICE) FROM PRODUCT);

--전체 상품의 평균가격보다 높은 가격의 상품들 중 가장 낮은 가격의 name,maker.,price를 조회
select name,maker,price from product where MIN(price) >= (select avg(price) from product)

----1 전체 상품 평균가
select avg(price) from product
----2 상품 평균가보다 높은 가격의 상품들 중 가장 낮은 가격
select min(price) from product where price > 1600
----3상품 평균가보다 높은 가격의 상품들중 가장 낮은 가격의 상품정보를 조회
select name,maker,price from product where price = 1700

select name,maker,price from product where price = (select min(price)from product where price > (select avg(price) from product))

--가장낮은 가격의 제조사
select maker from product where price = (select min(price) from product)

--사원 테이블
create table s_employee(
	empno number primary key,
	name varchar2(100) not null,
	job varchar2(100) not null,
	salary number not null
)
create sequence s_employee_seq;
insert into s_employee values(s_employee_seq.nextval,'아이유','개발',700);
insert into s_employee values(s_employee_seq.nextval,'강하늘','개발',900);
insert into s_employee values(s_employee_seq.nextval,'유재석','총무',600);
insert into s_employee values(s_employee_seq.nextval,'박보검','개발',900);
insert into s_employee values(s_employee_seq.nextval,'이상순','총무',600);

select * from s_employee





