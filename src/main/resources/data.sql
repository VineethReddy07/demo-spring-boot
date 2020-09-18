create table person(id int not null, name varchar(255) not null,
                    location varchar(255), birth_date timestamp, primary key(id));

insert into person(ID,NAME,LOCATION,BIRTH_DATE)
VALUES(07,'M.S.DHONI','RANCHI',sysdate());
insert into person(ID,NAME,LOCATION,BIRTH_DATE)
VALUES(41,'VINEETH','HYDERABAD',sysdate());

insert into student(STUDENTID,NAME,MARKS,GENDER)
VALUES(41,'VINEETH',97,'MALE');
insert into student(STUDENTID,NAME,MARKS,GENDER)
VALUES(14,'DEVARAJ',95,'MALE');
insert into student(STUDENTID,NAME,MARKS,GENDER)
VALUES(48,'SRIKANTH',0,'MALE');

