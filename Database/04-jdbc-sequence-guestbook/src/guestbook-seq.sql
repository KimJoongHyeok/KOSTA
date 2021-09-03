--guestbook table에 sequence 를 이용
create table guestbook(
	guestbook_no number primary key,
	title varchar2(100) not null,
	content varchar2(1000) not null
)
create sequence guestbook_seq;

select * from guestbook;

insert into guestbook values(guestbook_seq.nextval,'불금','잘놀자');
delete guestbook where title = '불금';
drop table guestbook;
drop sequence guestbook_seq;