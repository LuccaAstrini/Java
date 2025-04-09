create database POO3;
use POO3;

create table Conta(
    idConta int primary key,
    saldo double
);

insert into conta values(1, 2000);
insert into conta values(2, 5000);

select * from conta;