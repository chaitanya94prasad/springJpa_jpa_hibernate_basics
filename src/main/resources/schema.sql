--NOTE: this file is created to generate tables in h2 database which is an in memory database
--it is important to have this file if we want to create proper tables that will be visible in h2 database ui
--sprind jpa fetches schema.sql and creates tables accordingly
--this file must be in resources directory
--the below sql command helps to create a table called course
create table course
(
    id bigint not null,
    name varchar(255) not null,
    author varchar(255) not null,
    primary key(id)
);