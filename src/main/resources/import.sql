Insert Into _roles(id, name, description) values (1, 'ADMIN', 'Admin User');
Insert Into _roles(id, name, description) values (2, 'MODERATOR', 'Moderator User');
Insert Into _roles(id, name, description) values (3, 'USER', 'Basic User');

Insert Into _permissions (id, name, description) VALUES (1, 'edit_all_users', 'Allows the user to edit all users');
Insert Into _permissions (id, name, description) VALUES (2, 'create_all_users', 'Allows the user to create another users with any type of role');
Insert Into _permissions (id, name, description) VALUES (3, 'read_all_users', 'Allows the user to read all the others users data');
Insert Into _permissions (id, name, description) VALUES (4, 'disable_all_users', 'Allows the user to disable all users');
Insert Into _permissions (id, name, description) VALUES (5, 'delete_all_users', 'Allows the user to delete all the others users data and account');
Insert Into _permissions (id, name, description) VALUES (6, 'create_roles', 'Allows the user to create roles');
Insert Into _permissions (id, name, description) VALUES (7, 'read_role', 'Allows the user to read roles');
Insert Into _permissions (id, name, description) VALUES (8, 'edit_roles', 'Allows the user to edit roles');
Insert Into _permissions (id, name, description) VALUES (9, 'delete_roles', 'Allows the user to edit roles');
Insert Into _permissions (id, name, description) VALUES (10, 'admin_roles', 'Allows the user all actions over the roles');
Insert Into _permissions (id, name, description) VALUES (11, 'create_permissions', 'Allows the user to create permissions');
Insert Into _permissions (id, name, description) VALUES (12, 'read_permissions', 'Allows the user to create permissions');
Insert Into _permissions (id, name, description) VALUES (13, 'update_permissions', 'Allows the user to create permissions');
Insert Into _permissions (id, name, description) VALUES (14, 'delete_permissions', 'Allows the user to create permissions');
Insert Into _permissions (id, name, description) VALUES (15, 'admin_permissions', 'Allows the user all actions over the permissions');

Insert Into roles_permissions (role_id, permission_id) VALUES (1, 1);
Insert Into roles_permissions (role_id, permission_id) VALUES (1, 2);
Insert Into roles_permissions (role_id, permission_id) VALUES (1, 3);
Insert Into roles_permissions (role_id, permission_id) VALUES (1, 4);
Insert Into roles_permissions (role_id, permission_id) VALUES (1, 5);
Insert Into roles_permissions (role_id, permission_id) VALUES (2, 1);
Insert Into roles_permissions (role_id, permission_id) VALUES (2, 2);
Insert Into roles_permissions (role_id, permission_id) VALUES (2, 3);
Insert Into roles_permissions (role_id, permission_id) VALUES (2, 4);

Insert Into _users(id, creation_date, email, first_name, is_active, last_login, last_name, password, phone, role, username) Values (1, '2023-03-08 10:07:38.681', 'Jarce@gmail.com', 'Jesus', true, '2023-03-08 10:07:38.681', 'Arce', '$2a$10$Jz0uEc179uZWWhCdOdyZ4OHMevRRxGuAws2R7azg9VWNmnFmHQq1u', '6674791275', 1, 'Jicamon');
Insert Into _users(id, creation_date, email, first_name, is_active, last_login, last_name, password, phone, role, username) Values (2, '2023-03-08 10:07:38.681', 'Jarce2@gmail.com', 'Jesus', true, '2023-03-08 10:07:38.681', 'Arce', '$2a$10$Jz0uEc179uZWWhCdOdyZ4OHMevRRxGuAws2R7azg9VWNmnFmHQq1u', '6674791276', 2, 'Jicamon2');
Insert Into _users(id, creation_date, email, first_name, is_active, last_login, last_name, password, phone, role, username) Values (3, '2023-03-08 10:07:38.681', 'Jarce3@gmail.com', 'Jesus', true, '2023-03-08 10:07:38.681', 'Arce', '$2a$10$Jz0uEc179uZWWhCdOdyZ4OHMevRRxGuAws2R7azg9VWNmnFmHQq1u', '6674791277', 3, 'Jicamon3');