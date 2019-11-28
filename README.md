[![Build Status](https://travis-ci.com/TulyakovYasha/contact-service.svg?branch=master)](https://travis-ci.com/TulyakovYasha/contact-service)


Запуск приложения : 
1) Открыть консоль postgreSQL базы.
2) Ввести следующие команды :

create user contact_user with superuser;

create user flyway with superuser;

create database contacts;

alter database contacts owner to contact_user;

alter user contact_user with encrypted password 'password';

alter user flyway with encrypted password 'flyway';