create table web_product(
	id number primary key,
	maker varchar2(100) not null,
	name varchar2(100) not null,
	price number not null
)
create sequence web_product_seq;

insert into web_product(id,name,maker,price) values(web_product_seq.nextval,'카스','두산',1500)
insert into web_product(id,name,maker,price) values(web_product_seq.nextval,'테라','진로',1500)
insert into web_product(id,name,maker,price) values(web_product_seq.nextval,'참이슬','진로',1300)

update web_product set price = 1700 where name = '테라'

select * from WEB_PRODUCT
delete WEB_PRODUCT where price = 15000;

commit

















