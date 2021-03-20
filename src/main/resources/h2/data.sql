INSERT INTO USER_COMMENT(NAME, MAILADDRESS, TEXT) VALUES
('nameA', 'example1@example.com', 'aaaa'),
('nameB', 'example2@example.com', 'bbbb');

INSERT INTO USERS (USERNAME, PASSWORD, ENABLED) VALUES
('admin', '{bcrypt}$2a$10$vC.r53zKYPwEXplBYH3mxuZP52r2u3udRcEg9yTUmwYE5yjmoUXyG', true);
INSERT INTO AUTHORITIES (USERNAME, AUTHORITY) VALUES ('admin', 'ROLE_ADMIN');
