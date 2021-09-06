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





