create table addressdb.countries (
id int not null primary key,
name varchar(256)
);

create table addressdb.region (
id int not null primary key,
name varchar(256),
country_id int
);

create table addressdb.populated_area_types (
id int not null primary key,
name varchar(256)
);

create table addressdb.populated_areas (
id int not null primary key,
name varchar(256),
type_id int,
region_id int
);

create table addressdb.municipalities (
id int not null primary key,
name varchar(256),
postal_code int,
populated_area_id int
);

create table addressdb.streets (
id int not null primary key,
name varchar(256),
municipality_id int
);

create table addressdb.addresses (
id int not null primary key,
street_id int,
number int,
apartmentNo int
);

insert into addressdb.countries(id, name)
values(1, "Bulgaria");

insert into addressdb.countries(id, name)
values(2, "Serbia");

insert into addressdb.countries(id, name)
values(3, "Greece");

insert into addressdb.region(id, name, country_id)
values(1, "Trakia", 1);

insert into addressdb.region(id, name, country_id)
values(2, "Vojvodina", 2);

insert into addressdb.region(id, name, country_id)
values(3, "Attica", 3);

insert into addressdb.populated_area_types(id, name)
values(1, "CentralBul");

insert into addressdb.populated_area_types(id, name)
values(2, "WesternSer");

insert into addressdb.populated_area_types(id, name)
values(3, "NorthGr");

insert into addressdb.populated_areas(id, name, type_id, region_id)
values(1, "Sofia", 1, 1);

insert into addressdb.populated_areas(id, name, type_id, region_id)
values(2, "Belgrade", 2, 2);

insert into addressdb.populated_areas(id, name, type_id, region_id)
values(3, "Atthens", 3, 3);

insert into addressdb.municipalities(id, name, postal_code, populated_area_id)
values(1, "SofiaManicipality", 1000, 1);

insert into addressdb.municipalities(id, name, postal_code, populated_area_id)
values(2, "BelgradeManicipality", 2000, 2);

insert into addressdb.municipalities(id, name, postal_code, populated_area_id)
values(3, "AtthensManiciplaity", 3000, 3);

insert into addressdb.streets(id, name, municipality_id)
values(1, "TotlebenStr", 1);

insert into addressdb.streets(id, name, municipality_id)
values(2, "KosovoStr", 2);

insert into addressdb.streets(id, name, municipality_id)
values(3, "MacedoniaStr", 3);

insert into addressdb.addresses(id, street_id, number, apartmentNo)
values(1, 1, 1, 43);

insert into addressdb.addresses(id, street_id, number, apartmentNo)
values(2, 2, 2, 23);

insert into addressdb.addresses(id, street_id, number, apartmentNo)
values(3, 3, 3, 13);

select * from countries
join region
on countries.id = region.id
join populated_area_types
on countries.id = populated_area_types.id
join populated_areas
on countries.id = populated_areas.id
join municipalities
on countries.id = municipalities.id
join streets
on countries.id = streets.id
join addresses
on countries.id = addresses.id;
