select * from MEMBER
select count(*) from member where id = 'java' and password = 'a'
update member set id = 'java' where id = 'java12'

update member set password = ? , name = ? , address = ? where id = ?;
update member set password = 'b' , name = '강하늘' , address = '오리' where id = 'servlet';