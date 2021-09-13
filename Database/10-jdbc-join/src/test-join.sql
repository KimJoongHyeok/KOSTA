create table department(
	deptno Number primary key,
	dname varchar2(100) not null,
	loc varchar2(100) not null,
	tel varchar2(100) not null
)

create table k_employee(
	empno number primary key,
	ename varchar2(100) not null,
	sal number not null,
	deptno number not null,
	constraint fk_deptno foreign key(deptno) references department(deptno)
)

select e.ename,e.sal,d.deptno,d.dname,d.loc,d.tel 
from k_employee e,department d
where d.deptno = e.deptno and e.empno = 1;