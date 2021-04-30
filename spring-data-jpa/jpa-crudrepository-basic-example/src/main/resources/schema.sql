CREATE TABLE film (
    film_id SMALLINT UNSIGNED NOT NULL,
    title VARCHAR(128) NOT NULL,
    description TEXT DEFAULT NULL,
    release_year YEAR DEFAULT NULL,
    rental_duration TINYINT UNSIGNED NOT NULL DEFAULT 3,
    rental_rate DECIMAL(4,2) NOT NULL DEFAULT 4.99,
    length SMALLINT UNSIGNED DEFAULT NULL,
    replacement_cost DECIMAL(5,2) NOT NULL DEFAULT 19.99,
    rating ENUM('G','PG','PG13','R','NC17') DEFAULT 'G',
    special_features VARCHAR(100)  DEFAULT NULL,
    last_update TIMESTAMP NOT NULL,
    PRIMARY KEY  (film_id)
);