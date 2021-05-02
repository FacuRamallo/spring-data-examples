CREATE TABLE city (
    id BIGINT PRIMARY KEY,
    name VARCHAR(255),
    country VARCHAR(255),
    longitude VARCHAR(255),
    latitude VARCHAR(255)
);

CREATE TABLE country (
    id BINARY PRIMARY KEY,
    name VARCHAR(255),
    population BIGINT,
    currency VARCHAR(255)
);

CREATE TABLE address (
    id            BIGINT PRIMARY KEY AUTO_INCREMENT,
    street_name   VARCHAR(255),
    street_number VARCHAR(255),
    city          VARCHAR(255),
    country       VARCHAR(255),
    postalCode    VARCHAR(255)
);

CREATE TABLE customer (
    id          BIGINT PRIMARY KEY,
    first_name  VARCHAR(255),
    last_number VARCHAR(255)
);

CREATE TABLE staff (
    id          BIGINT PRIMARY KEY,
    first_name  VARCHAR(255),
    last_number VARCHAR(255)
);

CREATE TABLE inventory (
    inventory_id    BIGINT,
    secondary_id    BIGINT,
    name            VARCHAR(255),
    PRIMARY KEY (inventory_id, secondary_id)
);

CREATE TABLE rental (
    rental_id       BIGINT,
    secondary_id    BIGINT,
    name            VARCHAR(255),
    PRIMARY KEY (rental_id, secondary_id)
);


CREATE TABLE id_gen (
    gen_name VARCHAR(60) PRIMARY KEY,
    gen_val BIGINT(20)
);