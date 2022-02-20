create database Mydatabase;
use Mydatabase;
create table emp (empid int,empname varchar(20),age int);
insert into emp (empid,empname,age) values (25,'Aby',23);
select * from emp;
update emp set empname ='Rex' where age= '18';
delete from emp where age=23;
alter table emp  add salary int;
alter table emp drop column salary;




