create database POO3;
use POO3;

create table produto(
codigo varchar(255),
descricao varchar(255),
valor double,
quantEstoque int,
codProd int primary key auto_increment);

select * from produto;