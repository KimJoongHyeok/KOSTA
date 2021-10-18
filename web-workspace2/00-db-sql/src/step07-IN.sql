/*
 * IN 연산자
 * 특정값이 포함되는 데이터를 조회하고자 할 때 사용하는 연산자
 * 
 * select 컬럼,컬럼
 * from 테이블명
 * where 컬럼 in('또래오래','대한곱창')
 * 
 * NOT IN 연산자
 * 
 * 
 */

create table food(
	id number primary key,
	name varchar2(100) not null,
	maker varchar2(100) not null,
	price number not null
)

create sequence food_seq;

insert into food(id,name,maker,price) values(food_seq.nextval,'후라이드','또래오래',15000);
insert into food(id,name,maker,price) values(food_seq.nextval,'소곱창','대한곱창',20000);
insert into food(id,name,maker,price) values(food_seq.nextval,'양념치킨','또래오래',16000);
insert into food(id,name,maker,price) values(food_seq.nextval,'참치회','이춘복참치',35000);
insert into food(id,name,maker,price) values(food_seq.nextval,'파닭','또래오래',17000);
insert into food(id,name,maker,price) values(food_seq.nextval,'미니전골','대한곱창',18000);

update food set price = 17000 where name = '파닭';

commit

select * from food;
select round(avg(price)) from food;
--maker 별 평균가
select maker, round(avg(price)) from food group by maker order by round(avg(price)) desc;


select * from food where maker NOT in('이춘복참치','대한곱창');

select maker,price from food where maker in('또래오래','대한곱창');

--위와 같은거
select maker,price from food where maker = '대한곱창' or maker = '이춘복참치';

--전체 음식의 평균가보다 maker별 음식 평균가가 낮은 maker 의 음식정보를 조회하고자 한다 price 내림차순
select maker from food group by maker having avg(price) < (select avg(price) from food) order by avg(price) desc;

having avg(price) < (select avg(price) from food) order by price desc;


select maker,name,price from food where maker in(
select maker from food group by maker having avg(price) < (select avg(price) from food)) order by price desc;

select * from s_employee
-- job 별 사원수가 3명 이상인 job에 해당하는 사원의 name과 job을 조회
select job as 사원수 from s_employee group by job having count(*) >= 3;
select name,job from s_employee where job in(select job as 사원수 from s_employee group by job having count(*) >= 3);

select * from s_employee where job in
(select job from s_employee group by job having avg(salary) < (select avg(salary) from s_employee))


select job from s_employee group by job having avg(salary) < (select avg(salary) from s_employee)














