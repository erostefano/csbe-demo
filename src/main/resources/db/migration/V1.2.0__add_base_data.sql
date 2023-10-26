INSERT INTO person (id, first_name, last_name, password, user_name, is_admin)
VALUES (1, 'Stefano', 'Mavilio', 'stefano_pw', 'stefano_un', false);
INSERT INTO person (id, first_name, last_name, password, user_name, is_admin)
VALUES (2, 'John', 'Doe', null, null, false);
INSERT INTO person (id, first_name, last_name, password, user_name, is_admin)
VALUES (82, 'Doe', 'Jane', '$2a$10$vT45CNoT.ePr9CPQ6IgbkuJ86J0nvwPMK/UFHeYMQUXJzR/Y/u946', 'jane_doe', true);
INSERT INTO person (id, first_name, last_name, password, user_name, is_admin)
VALUES (87, 'Doe', 'John', '$2a$10$TUCal0A3sO6HeptHc1ulxe/HaC4pbckJLKsL7pUjTxeGl0eOsk1oS', 'john_doe', false);

INSERT INTO animal (id, name, person_id)
VALUES (1, 'Michelangelo', 1);
INSERT INTO animal (id, name, person_id)
VALUES (2, 'Donatello', 1);
