/*
 * MVC + Front Controller 상에서 date 형을 이용해 프로그래밍 연습을 위한 테이블
 */

create table mvc_product(
	id number primary key,
	name varchar2(100) not null,
	maker varchar2(100) not null,
	price number not null,
	regdate date not null
)
create sequence mvc_product_seq;
insert into mvc_product values(mvc_product_seq.nextval,'갤럭시21','삼성',100,sysdate);
commit

select * from mvc_product
delete from mvc_product where maker = '나이키';

select id,name,maker,price,to_char(regdate,'yyyy-mm-dd HH24:MI:SS') from mvc_product where id = '1';

select name,maker,to_char(regDate,'yyyy-mm-dd') from mvc_product order by name desc











