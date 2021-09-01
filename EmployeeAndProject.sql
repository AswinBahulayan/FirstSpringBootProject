create database employee;
use employee;
create table employeeData(
id int NOT NULL AUTO_INCREMENT,
firstname varchar(255) NOT NULL,
lastname varchar(255),
company varchar(255),
PRIMARY KEY (id)
);

show tables;
insert into employeeData values(101,'Aswin','Bahuleyan','google');
insert into employeeData values(102,'Raj','DOg','ABC');
insert into employeeData values(103,'Taj','cat','CBE');
insert into employeeData values(104,'mahal','lion','Ayaa');
insert into employeeData values(104,'mahal','lion','Ayaa');

desc employeeData;

delete from emplyeeData;
ALTER TABLE employeeData
ADD PRIMARY KEY (id);
ALTER TABLE employeeData MODIFY COLUMN id int NOT NULL AUTO_INCREMENT;

select * from employeedata;

delete from empleyeedata where id=101;

DROP DATABASE employee;

CREATE TABLE ProjectDetails (
    ProjectID int NOT NULL,
    ProjectName varchar(255) NOT NULL,
    id int,
    PRIMARY KEY (ProjectID),
    FOREIGN KEY (id) REFERENCES employeeData(id)
);

ALTER TABLE ProjectDetails
RENAME COLUMN id TO employeeId;

ALTER TABLE ProjectDetails MODIFY COLUMN ProjectID int NOT NULL AUTO_INCREMENT;

desc ProjectDetails;
