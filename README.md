# Bootcamp 2017 #3 - PostgreSQL

## RDMS - Relational Database Management System

Relation database management system itu pada dasarnya bertujuan untuk memudahkan kita untuk membuat data lebih efisient artinya ukuran file tidak membengkak karena _redudancy data_ contohnya seperti di `excel`, selain itu juga dengan database relational management system kita dapat mudah melakukan maninpulasi data, dan mencari data dengan cepat.

## Relational Database Management System

Ada beberapa RDBMS yang popular saat ini diantaranya

1. [Oracle](https://www.oracle.com/index.html)
2. [MySQL](https://www.mysql.com/)
3. [PostgreSQL](https://www.postgresql.org/)
4. [MariaDB](https://mariadb.org/)
5. [JavaDB / Apache Derby](http://www.oracle.com/technetwork/java/javadb/overview/index.html)
6. [Microsoft Access](https://products.office.com/en/access)
7. [SQLite](https://www.sqlite.org/)

## Interaksi dengan database

Untuk beriteraksi dengan database biasanya menggunakan bahasa yang disebut `query`, nah query ini dibagi menjadi beberapa type diantaranya:
- Select Query
  - ```select * from table_name```
  - ```select column_1, column_2 from table_name where column_key = param_key```
- DML (Data Manipulation Language)
  - ```insert into table_name (columns...) values (params...)```
  - ```update table_name set column_1 = param_1, column_2 = param_2, .... where column_key = param_key```
  - ```delete from table_name where column_key = param_key```
- DDL (Data Definition Language)
  - ```create```
  - ```alter```
  - ```drop```
- TCL (Trancation Control Language)
  - ```commit```
  - ```savepoint```
  - ```rollback```
  
## Object dalam database

- `primary key`
- `foreign key`
- `unique constraint`
- `sequance`
- `table`
- `view`
