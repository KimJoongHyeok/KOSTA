/*	
 	부서테이블과 사원테이블 분리
 	부서테이블 : 부모테이블, 참조대상이 되는 테이블
 	사원테이블 : 자식테이블, 참조하는 테이블
 	
 	부서 테이블	 -------O|<- 사원 테이블
 	
 	사원 테이블에서 부서테이블을 참조할 수 있도로고 Foreign key 설정
 	사원정보가 저장될 때 부서테이블에 존재하는 부서번호로만 등록 될 수 있도록 한다( 참조 무결성 )
 	
 	
 	
 */

create table mvc_department(
	deptno number primary key,
	dname varchar2(100) not null,
	loc varchar2(100) not null,
	tel varchar2(100) not null
)

insert into MVC_DEPARTMENT(deptno,dname,loc,tel) values(10,'전략기획','오리','031')
insert into MVC_DEPARTMENT(deptno,dname,loc,tel) values(20,'공공사업','종로','02')
insert into MVC_DEPARTMENT(deptno,dname,loc,tel) values(30,'연구개발','판교','033')


select * from MVC_DEPARTMENT

create table mvc_employee(
	empno number primary key,
	ename varchar2(100) not null,
	sal number not null,
	deptno number not null,
	constraint fk_mvc_deptno foreign key(deptno) references mvc_department(deptno)
)

-- contraint (제약조건키워드) fk_mvc_deptno(제약조건명:유일해야) foreign key(현 테이블 컬럼) refernces 참조대상테이블

-- error : parent key not found 참조 무결성 제약 조건 위배 ( 부서 테이블에 존재하지 않는 부서 번호로 insert 하려 했으므로 error )

insert into mvc_employee values(1,'아이유',400,50)

insert into mvc_employee values(1,'아이유',400,20)
insert into mvc_employee values(2,'박보검',300,10)
insert into mvc_employee values(3,'강하늘',600,10)

drop table mvc_employee;
drop table mvc_department
insert into mvc_employee(empno,ename,sal,deptno) values(1,'아이유',400,10);
insert into mvc_employee(empno,ename,sal,deptno) values(2,'박보검',300,10);
insert into mvc_employee(empno,ename,sal,deptno) values(3,'강하늘',600,20);

select * from mvc_employee
select count(*) from mvc_employee

select e.empno,e.ename,e.sal,d.dname,d.loc
from mvc_department d,mvc_employee e
where e.deptno = d.deptno


commit

