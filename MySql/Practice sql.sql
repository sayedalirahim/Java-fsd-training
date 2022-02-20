use Mydatabase;
create table student (adm_no int not null, name varchar(20), dob date, gender char,course varchar(20));
insert into student (adm_no , name, dob, gender,course) values (1253,'Alex ','1998/11/01', 'M', 'Engineering');
insert into student (adm_no , name, dob, gender,course) values (1263,'Frida','1999/11/12', 'F', 'Artist'),(1258,'Riya ','2000/04/11', 'F', 'UI Designer'),(1258,'Roy  ','1995/1/30', 'M', 'Draftman'),(1353,'Rima ','1993/05/08', 'F', 'Accounting');
select * from student;
update student set adm_no=2020 where name= 'Alex';
select course from student;
select * from student where gender='f';
select name,course from student where gender='m';
alter table student add income int;
update student set income=23000 where name='Alex';
update student set income=25000 where name='Frida';
update student set income=27000 where name='Riya';
update student set income=21000 where name='Roy';
update student set income=29000 where name='Rima';
select name, course from student where gender='f' and income>25000;
select name,dob from student where income between 20000 and 25000;
select * from student where course in('engineering','artist');
select * from student order by course;
select * from student order by income desc;
select max(income), min(income),avg(income) from student;
update student set income=income+5000 where adm_no=1263;
alter table student add marks int after dob;
select * from student;
alter table student drop marks;




