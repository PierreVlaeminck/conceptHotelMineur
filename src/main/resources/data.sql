INSERT INTO users (username, password, enabled)
VALUES ('admin', '{bcrypt}$2a$10$FBkFTXS5pFvN6V.jys5N7OYYBWZwHgkK/snfPG32GvUu1hCmBn/Fi', 1);
INSERT INTO authorities (username, authority)
VALUES ('admin', 'ROLE_ADMIN');