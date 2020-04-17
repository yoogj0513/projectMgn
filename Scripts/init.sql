select user(), database();

create database jin_project;
use jin_project;


create table tbl_pmgn(
	pno int not null auto_increment,
	pname varchar(200) not null,
	pcontent text null,
	pstartdate timestamp not null,
	penddate timestamp not null,
	pcdt int default 0,
	primary key (pno)
);

desc tbl_pmgn;
select * from tbl_pmgn;
