create table animal
(
    id        int auto_increment
        primary key,
    name      varchar(255) null,
    person_id int not null,
    constraint animal_ibfk_1
        foreign key (person_id) references person (id)
);
