create table person
(
    id         int auto_increment
        primary key,
    first_name varchar(255) null,
    last_name  varchar(255) null,
    password   varchar(255) null,
    user_name  varchar(255) null
);

create table animal
(
    id        int auto_increment
        primary key,
    name      varchar(255) null,
    person_id int          not null,
    constraint foreign key (person_id) references person (id)
);

