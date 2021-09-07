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

select job from s_employee where job = '개발';

select max(salary) from s_employee where job = '개발';

select * from s_employee where job = '개발'

--SQL단위 테스트