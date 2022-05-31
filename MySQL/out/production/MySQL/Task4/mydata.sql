create database if not exists ebookshop;

use ebookshop;

drop table if exists books;
create table books (
                       id int,
                       title varchar(50),
                       author varchar(50),
                       price float,
                       qty int,
                       primary key (id)
);

insert into books values (1001, 'Java for dummies', 'Author 1', 11.11, 11);
insert into books values (1002, 'More Java for dummies', 'CodeLean VN', 22.22, 22);
insert into books values (1003, 'More Java for more dummies', 'Mohammad Ali', 33.33, 33);
insert into books values (1004, 'A Cup of Java', 'Kumar', 44.44, 44);
insert into books values (1005, 'A Teaspoon of Java', 'Kevin Jones', 55.55, 55);

select * from books;

-- ex1:
select * from books;
select title, price from books where author = 'CodeLean VN';
select title, author, price, qty from books where author = 'CodeLean VN' or price >= 30 order by price desc , id asc ;


# 1. Hiện thị danh sách khách hàng

select * from exercise2.customers;

# 3. Hiện thị danh sách sản phẩm
select * from exercise2.products;

# 4. Tìm sản phẩm thoe giá bán trong khoảng do người dùng nhập vào
select * from exercise2.products where UnitPrice > 50;
