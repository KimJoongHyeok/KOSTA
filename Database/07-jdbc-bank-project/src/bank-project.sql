create table account(
	account_no number primary key,
	name varchar2(100) not null,
	password varchar2(100) not null,
	balance number not null
)

create sequence account_seq;


--sql단위테스트

select * from account