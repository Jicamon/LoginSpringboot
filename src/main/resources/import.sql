--insert into _user (email, firstname, lastname, password, role, id) values ('user@gmail.com','user','resu','$2a$12$UoqHskbHLoXguSySAJke8.mjTmQKj1Zz93R.fgwzibh6HDaHo5oBe','USER',1);
--insert into _user (email, firstname, lastname, password, role, id) values ('admin@gmail.com','admin','nimda','$2a$12$UoqHskbHLoXguSySAJke8.mjTmQKj1Zz93R.fgwzibh6HDaHo5oBe','ADMIN',2);
--insert into _user (email, firstname, lastname, password, role, id) values ('mod@gmail.com','mod','dom','$2a$12$UoqHskbHLoXguSySAJke8.mjTmQKj1Zz93R.fgwzibh6HDaHo5oBe','MODERATOR',3);
--insert into _user(email, firstname, lastname, password, date_joined, last_login, is_active, role, id) values ('user@gmail.com', 'User', 'Resu', '$2a$10$UiYNO2nXyyQ0Awxb2CCzMeI9BaMEKQ2gq2GkjO3FkR8QeSo6KJEFK', '2023-01-16 10:38:01.383', '2023-01-16 10:38:01.383', true, 'USER', 1);
--insert into _user(email, firstname, lastname, password, date_joined, last_login, is_active, role, id) values ('mod@gmail.com', 'Mod', 'Dom', '$2a$10$UiYNO2nXyyQ0Awxb2CCzMeI9BaMEKQ2gq2GkjO3FkR8QeSo6KJEFK', '2023-01-16 10:38:01.383', '2023-01-16 10:38:01.383', true, 'MODERATOR', 2);
--insert into _user(email, firstname, lastname, password, date_joined, last_login, is_active, role, id) values ('admin@gmail.com', 'Admin', 'Nimda', '$2a$10$UiYNO2nXyyQ0Awxb2CCzMeI9BaMEKQ2gq2GkjO3FkR8QeSo6KJEFK', '2023-01-16 10:38:01.383', '2023-01-16 10:38:01.383', true, 'ADMIN', 3);

Insert Into _roles(id, name, description) values (1, 'ADMIN', 'Admin User');
Insert Into _roles(id, name, description) values (2, 'MODERATOR', 'Moderator User');
Insert Into _roles(id, name, description) values (3, 'USER', 'Basic User');

Insert Into _permissions (id, name, description) VALUES (1, 'edit_all_users', 'Allows the user to edit all users');
Insert Into _permissions (id, name, description) VALUES (2, 'create_all_users', 'Allows the user to create another users with any type of role');
Insert Into _permissions (id, name, description) VALUES (3, 'read_all_users', 'Allows the user to read all the others users data');
Insert Into _permissions (id, name, description) VALUES (4, 'disable_all_users', 'Allows the user to disable all users');
Insert Into _permissions (id, name, description) VALUES (5, 'delete_all_users', 'Allows the user to delete all the others users data and account');
Insert Into _permissions (id, name, description) VALUES (6, 'read_all_users', 'Allows the user to read all the others users data');

Insert Into roles_permissions (role_id, course_id) VALUES (1, 1);
Insert Into roles_permissions (role_id, course_id) VALUES (1, 2);
Insert Into roles_permissions (role_id, course_id) VALUES (1, 3);
Insert Into roles_permissions (role_id, course_id) VALUES (1, 4);
Insert Into roles_permissions (role_id, course_id) VALUES (1, 5);
Insert Into roles_permissions (role_id, course_id) VALUES (1, 6);
Insert Into roles_permissions (role_id, course_id) VALUES (2, 1);
Insert Into roles_permissions (role_id, course_id) VALUES (2, 2);
Insert Into roles_permissions (role_id, course_id) VALUES (2, 3);
Insert Into roles_permissions (role_id, course_id) VALUES (2, 4);
Insert Into roles_permissions (role_id, course_id) VALUES (2, 6);

Insert Into _users(id, creation_date, email, first_name, is_active, last_login, last_name, password, phone, role, username) Values (1, '2023-03-08 10:07:38.681', 'Jarce@gmail.com', 'Jesus', true, '2023-03-08 10:07:38.681', 'Arce', '$2a$10$Jz0uEc179uZWWhCdOdyZ4OHMevRRxGuAws2R7azg9VWNmnFmHQq1u', '6674791275', 1, 'Jicamon');