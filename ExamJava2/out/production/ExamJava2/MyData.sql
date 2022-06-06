create database Cinema;
use Cinema;

create table movies(
                       id varchar(50) primary key ,
                       name varchar(50),
                       date date,
                       author varchar(50),
                       time int
);

insert into movies values ('M01', 'Superman', '2022/06/06' , 'Alex', 90);
insert into movies values ('M02', 'PIL''S ADVENTURES', '2022/06/01' , 'Julien Fournet', 120);
insert into movies values ('M03', 'Doctor Strange2', '2022/05/01' , 'Angus MacLane', 120);
