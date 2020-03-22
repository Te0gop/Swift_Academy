create table school.teachers (
teachers_id int,
teachers_name varchar(256),
teachers_email varchar(256),
teachers_salary double
);

create table school.students (
students_id int,
students_name varchar(256),
students_enrollment_date date
);

create table school.disciplines (
disciplines_id int,
disciplines_name varchar(256)
);

insert into school.teachers (teachers_id, teachers_name, teachers_email, teachers_salary)
values(1, "Peter Ivanov", "pivanov@gmail.com", 1921.50);

insert into school.teachers (teachers_id, teachers_name, teachers_email, teachers_salary)
values(2, "Georgi Stoimenov", "stoimenov@gmail.com", 1787.25);

insert into school.teachers (teachers_id, teachers_name, teachers_email, teachers_salary)
values(3, "Nataliya Yordanova", "nyyoo@abv.bg", 1888.21);

insert into school.teachers (teachers_id, teachers_name, teachers_email, teachers_salary)
values(4, "Simeon Prodanov", "sprod@yahoo.com", 1341.60);

select * from school.teachers;

insert into school.students (students_id, students_name, students_enrollment_date)
values(1, "Georgi Georgiev", '2000/10/22');

insert into school.students (students_id, students_name, students_enrollment_date)
values(2, "Stoyan Ivanov", '2010/11/18');

insert into school.students (students_id, students_name, students_enrollment_date)
values(3, "Mariya Grozdanova", '2008/05/27');

insert into school.students (students_id, students_name, students_enrollment_date)
values(4, "Stefaniya Petkova", '2007/01/12');

alter table school.students
add constraint student_PK primary key(students_id);

alter table school.teachers
add constraint teachers_PK primary key(teachers_id);

select * from students;
select * from teachers;

alter table school.disciplines
add constraint disciplines_PK primary key(disciplines_id);

insert into school.disciplines(disciplines_id, disciplines_name)
values(1, "Mathematics");

insert into school.disciplines(disciplines_id, disciplines_name)
values(2, "Geography");

insert into school.disciplines(disciplines_id, disciplines_name)
values(3, "Physics");

insert into school.disciplines(disciplines_id, disciplines_name)
values(4, "Informatics");

create table school.addresses (
addresses_id int not null primary key,
addresses_country varchar(256),
addresses_city varchar(256),
addresses_street varchar(256),
addresses_number varchar(256),
students_floor int,
students_apartment_no int,
FOREIGN KEY (addresses_id) references students(students_id),
FOREIGN KEY (addresses_id) references teachers(teachers_id)
);


select * from addresses
join students
on addresses.addresses_id = students.students_id;

select * from addresses
join teachers
on addresses.addresses_id = teachers.teachers_id;


