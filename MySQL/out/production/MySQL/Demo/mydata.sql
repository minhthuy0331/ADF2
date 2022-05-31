create database classroom;
use classroom;

create table class(
                      classID int primary key ,
                      name nvarchar(50),
                      siso int
);

create table student(
                        studentID int primary key,
                        name nvarchar(50),
                        date date,
                        gender varchar(50),
                        address nvarchar(50)


);
drop  table student;
insert into student values (1, 'Alert', '1997/05/14', 'Male', 'America');
insert into student values (2, 'Blert', '2000/06/12', 'Male', 'France');
insert into student values (3, 'Bob', '2001/05/20', 'Male', 'England');
insert into student values (4, 'Lilian', '2002/11/12', 'Female', 'England');
insert into student values (5, 'Timmer', '2003/07/4', 'Female', 'USA');
drop database classroom;
select * from student ;

update student set name = 'Alert' where studentID = 1;