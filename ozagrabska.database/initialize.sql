create database FamilyDB;
use FamilyDB;
create table Family (familyName varchar(32), id int, nrOfAdults int, nrOfChildren int, nrOfInfants int);
create user 'familyuser'@'%' identified by 'kotki123';
grant select, insert, delete, update on FamilyDB.Family to 'familyuser'@'%';
