create table mvc_member(
	id varchar2(100) primary key,
	password varchar2(100) not null,
	name varchar2(100) not null,
	address varchar2(100) not null,
	birthday date not null,
	regdate date not null
)

select * from mvc_member;
select id,name,maker,price,to_char(regdate,'yyyy-mm-dd HH24:MI:SS') from mvc_product where id = '1';
insert into mvc_member values('java','1','아이유','오리','1996.04.27',sysdate);
insert into mvc_member values('java2','2','김중혁','오리','1996.04.27',sysdate);
select id,password,name,address,to_char(birthday,'yyyy.mm.dd'),to_char(regdate,'yyyy-mm-dd HH24:MI:SS') from mvc_member where id = 'java';

select count(*) from mvc_member where id = 'java' and password = '1';
select id,name,address,birthday from mvc_member where address = '오리'










