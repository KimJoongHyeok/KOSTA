
/* SPRING SECURITY 를 적용할 경우 
 * 회원 가입시 비즈니스 계층(서비스)에서  회원가입과 권한을 함께 insert하도록 처리한다 (트랜잭션 처리 필요!)
 */
drop table security_member;
create table security_member(
	id varchar2(100) primary key,
	password varchar2(100) not null,
	name varchar2(100) not null,
	address varchar2(100) not null,
	enabled number default 1 not null 
)
-- enabled : 탈퇴여부(0은 탈퇴, 1은 가입상태) 

delete from security_member;
commit



-- 비밀번호 암호화해서 등록해야 하므로 어플리케이션에서 회원가입을 이용해 등록한다 

/*  
     한명의 회원은 여러개의 권한(1:n)을 보유할 수 있어야 하므로 별도로 권한authorities 테이블을 생성한다 
 */
drop table authorities;

create table authorities(
	username varchar2(100) not null,
	authority varchar2(30) not null,
	constraint fk_authorities foreign key(username) references security_member(id),
	constraint member_authorities primary key(username,authority)
)
delete from authorities;

-- 비밀번호 암호화해서 등록해야 하므로 어플리케이션에서 회원가입을 이용해 등록한다 
-- 등록 후 확인해본다 
select * from security_member;
select * from authorities;

-- 어플리케이션에서 회원가입을 하면 ROLE_MEMBER가 등록된다 
-----------------------------------------------------------
--  인가 테스트를 위해 관리자 권한을 추가한 후
--  AdminController의 @Secured("ROLE_ADMIN") 메서드를 브라우저로 테스트 해본다 
insert into authorities(username,authority) values('king','ROLE_ADMIN');
commit


commit







