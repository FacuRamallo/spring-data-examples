CREATE TABLE airport (
    id                      INT             NOT NULL,
    name_airport            VARCHAR(20)     NOT NULL,
    code_iata_airport       VARCHAR(10)     NOT NULL,
    code_icao_irport        VARCHAR(10)     NOT NULL,
    latitude_airport        DECIMAL         NOT NULL,
    longitude_airport       DECIMAL         NOT NULL,
    geoname_id              INT             NOT NULL,
    timezone                VARCHAR(25)     NOT NULL,
    gmt                     VARCHAR(25)     NOT NULL,
    phone                   VARCHAR(25)     NOT NULL,
    name_country            VARCHAR(25)     NOT NULL,
    code_iso2_country       VARCHAR(25)     NOT NULL,
    code_iata_city          VARCHAR(25)     NOT NULL,
    PRIMARY KEY (id)
);


