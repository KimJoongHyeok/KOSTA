drop table spring_department;
create table spring_department(
	deptno number primary key,
	dname varchar2(100) not null,
	loc varchar2(100) not null
)
create table spring_employment(
	empno number primary key,
	ename varchar2(100) not null,
	sal number not null,
	deptno number not null,
	constraint fk_spring_deptno foreign key(deptno) references spring_department(deptno)
)
-- 부서 테이블에는 40번 부서가 없으므로 error , 참조 무결성 제약조건 위배 
-- insert into spring_employment values(1,'아이유',300,40);
insert into spring_employment values(1,'아이유',300,10);
insert into spring_employment values(2,'조승우',500,10);
insert into spring_employment values(3,'배두나',400,20);

insert into spring_department values(10,'전략기획','판교');
insert into spring_department values(20,'해양수산','부산');
insert into spring_department values(30,'공공사업','판교');
commit
select * from spring_employment;
select * from spring_department;

select e.ename,d.dname,d.loc
from spring_employment e inner join spring_department d
on e.deptno = d.deptno and e.empno = '1';

select e.ename,d.dname,d.loc
from spring_employment e ,spring_department d
where e.deptno = d.deptno 
and e.empno = '1';

select e.empno,e.ename,d.deptno,d.dname
from spring_employment e full outer join spring_department d
on e.deptno = d.deptno; 

select e.empno,e.ename,d.deptno,d.dname
			from spring_employment e ,spring_department d
			group by deptno having e.deptno(+) = d.deptno;



select deptno,count(*) as emp_count
from spring_employment
group by deptno

select d.deptno,d.dname,nvl(e.emp_count,0)
from (select deptno,count(*) as emp_count
		from spring_employment
		group by deptno) e ,spring_department d
where e.deptno(+) = d.deptno
order by d.deptno;

-- Join SQL : 하나 이상의 테이블을 결합하여 조회
-- Inner Join : 조인 조건에 부합되는 정보를 조회
-- Outer Join : 조인 조건에 부합되지 않는 정보까지 모두 조회
-- Self Join : 하나의 테이블 자체에서 조인












