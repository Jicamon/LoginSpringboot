--insert into _user (email, firstname, lastname, password, role, id) values ('user@gmail.com','user','resu','$2a$12$UoqHskbHLoXguSySAJke8.mjTmQKj1Zz93R.fgwzibh6HDaHo5oBe','USER',1);
--insert into _user (email, firstname, lastname, password, role, id) values ('admin@gmail.com','admin','nimda','$2a$12$UoqHskbHLoXguSySAJke8.mjTmQKj1Zz93R.fgwzibh6HDaHo5oBe','ADMIN',2);
--insert into _user (email, firstname, lastname, password, role, id) values ('mod@gmail.com','mod','dom','$2a$12$UoqHskbHLoXguSySAJke8.mjTmQKj1Zz93R.fgwzibh6HDaHo5oBe','MODERATOR',3);
--insert into _user(email, firstname, lastname, password, date_joined, last_login, is_active, role, id) values ('user@gmail.com', 'User', 'Resu', '$2a$10$UiYNO2nXyyQ0Awxb2CCzMeI9BaMEKQ2gq2GkjO3FkR8QeSo6KJEFK', '2023-01-16 10:38:01.383', '2023-01-16 10:38:01.383', true, 'USER', 1);
--insert into _user(email, firstname, lastname, password, date_joined, last_login, is_active, role, id) values ('mod@gmail.com', 'Mod', 'Dom', '$2a$10$UiYNO2nXyyQ0Awxb2CCzMeI9BaMEKQ2gq2GkjO3FkR8QeSo6KJEFK', '2023-01-16 10:38:01.383', '2023-01-16 10:38:01.383', true, 'MODERATOR', 2);
--insert into _user(email, firstname, lastname, password, date_joined, last_login, is_active, role, id) values ('admin@gmail.com', 'Admin', 'Nimda', '$2a$10$UiYNO2nXyyQ0Awxb2CCzMeI9BaMEKQ2gq2GkjO3FkR8QeSo6KJEFK', '2023-01-16 10:38:01.383', '2023-01-16 10:38:01.383', true, 'ADMIN', 3);

Insert Into _roles(id, description, name) values (1, 'Jefe', 'ADMIN');
Insert Into _roles(id, description, name) values (2, 'Subjefe', 'MODERADOR');
Insert Into _roles(id, description, name) values (3, 'Cliente', 'USER');

Insert Into _users(id, creation_date, email, first_name, is_active, last_login, last_name, password, phone, role, username) Values (1, '2023-03-08 10:07:38.681', 'Jarce@gmail.com', 'Jesus', true, '2023-03-08 10:07:38.681', 'Arce', '$2a$10$Jz0uEc179uZWWhCdOdyZ4OHMevRRxGuAws2R7azg9VWNmnFmHQq1u', '6674791275', 1, 'Jicamon');