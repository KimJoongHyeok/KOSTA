/*
	group by ~ having
	
	group by : 테이블에서 특정컬럼을 기준으로 그룹화하여 검색할 때 사용
			   데이터를 원하는 그룹으로 나눌수 있다
	having : group by 와 함게 사용하는 조건절 (그룹에 대한 조건을 지정)
	
	
	
*/

select * from PRODUCT

--maker 별 상품수 조회하되 상품수가 1개를 초과하는 maker
select maker,count(*) as 상품수 from product group by maker having count(*) > 1 order by 상품수 desc

--maker 별 상품 평균가(avg)를 조회하되 평균가 내림차순으로 정렬
select maker,avg(price) from product group by maker order by  avg(price) desc;
select maker,avg(price) as 평균가 from product group by maker order by  평균가 desc;
select maker,round(avg(price)) as 평균가 from product group by maker order by  평균가 desc;

--maker 별 상품 평균가(소수점이하 반올림) 1540을 초과하는 제조사 maker를 조회하되 maker별 상품수,평균가를 조회한다
select maker,count(*) as 상품수 ,round(avg(price)) as 평균가 from product group by maker having round(avg(price)) > 1540 order by 상품수 asc;

select * from s_employee
insert into s_employee values(employeeno_seq,)

--job 별 사원수 (job,사원수) 를 조회하되 사원수 내림차순
select job,count(*) as 사원수 from s_employee group by job order by 사원수 desc;

--job 별 평균 월급(avg(salary)) 을 조회하되 평균월급 내림차순 정렬
-- 평균월급이 700을 초과하는 job 에 한ㅎ해서 조회
select job,avg(salary) as 평균월급 from s_employee group by job having avg(salary) > 700 order by 평균월급 desc;

select job,count(*) as 사원명,max(salary) as highestsal from s_employee group by job order by highestsal desc;

--전체사원의 평균월급보다 job 그룹별 평균월급액이 작은job그룹의 job,평균월급,사원수를 조회
select job,avg(salary),count(*) from s_employee group by job having avg(salary) < (select avg(salary) from s_employee)

select * from PRODUCT
select maker,avg(price) from product group by maker having avg(price) < (select avg(price) from product) order by avg(price) desc;



