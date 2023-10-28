INSERT INTO csbe.person (id, first_name, last_name, password, user_name, is_admin, city)
VALUES (1, 'Stefano', 'Mavilio', 'stefano_pw', 'stefano_un', 0, null);
INSERT INTO csbe.person (id, first_name, last_name, password, user_name, is_admin, city)
VALUES (2, 'John', 'Doe', null, null, 0, null);
INSERT INTO csbe.person (id, first_name, last_name, password, user_name, is_admin, city)
VALUES (82, 'Doe', 'Jane', '$2a$10$vT45CNoT.ePr9CPQ6IgbkuJ86J0nvwPMK/UFHeYMQUXJzR/Y/u946', 'jane_doe', 1, null);
INSERT INTO csbe.person (id, first_name, last_name, password, user_name, is_admin, city)
VALUES (87, 'Doe', 'John', '$2a$10$TUCal0A3sO6HeptHc1ulxe/HaC4pbckJLKsL7pUjTxeGl0eOsk1oS', 'john_doe', 0, null);
INSERT INTO csbe.person (id, first_name, last_name, password, user_name, is_admin, city)
VALUES (88, 'Naruto', 'Uzumaki', 'uzumaki', 'stefano_un', 0, null);

INSERT INTO csbe.animal (id, name, person_id)
VALUES (1, 'Michelangelo', 1);
INSERT INTO csbe.animal (id, name, person_id)
VALUES (2, 'Donatello', 1);
