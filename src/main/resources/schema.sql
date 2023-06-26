DROP TABLE IF EXISTS 'authorities';
DROP TABLE IF EXISTS 'users';

CREATE TABLE users
(
    id_u     BIGINT(20) NOT NULL,
    username VARCHAR(50)  NOT NULL,
    password VARCHAR(100) NOT NULL,
    enable   TINYINT      NOT NULL DEFAULT 1,
    PRIMARY KEY (id_u)
);

CREATE TABLE authorities
(
    id_a      BIGINT(20) NOT NULL,
    username  VARCHAR(50) NOT NULL,
    authority VARCHAR(50) NOT NULL,
    id_users BIGINT (20) NOT NULL,
    PRIMARY KEY (id_a)
    FOREIGN KEY (id_users) REFERENCES users (id_u)
);