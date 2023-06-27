DROP TABLE IF EXISTS 'authorities';
DROP TABLE IF EXISTS 'users';

CREATE TABLE users
(
    id_u            BIGINT(20) NOT NULL,
    username        VARCHAR(50)  NOT NULL,
    password        VARCHAR(255) NOT NULL,
    enable          TINYINT      NOT NULL DEFAULT 1,
    PRIMARY KEY (id_u),
);

CREATE TABLE user_profile
(
    id_up BIGINT(20) NOT NULL,
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    date_of_birth DATE NOT NULL,
    phone VARCHAR(255) NOT NULL,
    formula VARCHAR(255) ,
    FOREIGN KEY (username) REFERENCES users(username)

);

CREATE TABLE authorities
(
    id_a      BIGINT(20) NOT NULL,
    username  VARCHAR(50) NOT NULL,
    authority VARCHAR(50) NOT NULL,
    id_users  BIGINT (20) NOT NULL,
    PRIMARY KEY (id_a),
    FOREIGN KEY (username) REFERENCES users(username)
);