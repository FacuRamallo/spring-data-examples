package com.javanibble.springdata.examples.jdbc.crud.repository;

import com.javanibble.springdata.examples.jdbc.crud.model.Airport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class AirportDAO {


    @Autowired
    private JdbcTemplate jdbcTemplate;


    public List<Airport> findAllAirports() {
        return jdbcTemplate.query("select * from airport", new AirportDAO.AirportRowMapper());
    }


    public Airport findAirportById(int id) {
        return jdbcTemplate.queryForObject("select * from airport where id=?", new Object[] { id }, new AirportDAO.AirportRowMapper());
    }


    public int deleteAirportById(int id) {
        return jdbcTemplate.update("delete from airport where id=?", new Object[] { id });
    }


    public int insertAirport(Airport airport) {
        return jdbcTemplate.update("insert into airport (id, name_airport, code_iata_airport, code_icao_irport, latitude_airport, longitude_airport, geoname_id, timezone, gmt, phone, name_country, code_iso2_country, code_iata_city) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)",
                new Object[] { airport.getAirportId(), airport.getNameAirport(), airport.getCodeIataAirport(), airport.getCodeIcaoAirport(), airport.getLatitudeAirport(), airport.getLongitudeAirport(), airport.getGeonameId(), airport.getTimezone(), airport.getGMT(), airport.getPhone(), airport.getNameCountry(), airport.getCodeIso2Country(), airport.getCodeIataCity()});
    }



    public int updateAirport(Airport airport) {
        return jdbcTemplate.update("update airport " + " set name_airport = ?, code_iata_airport = ?, code_icao_irport = ?, latitude_airport = ?, longitude_airport = ?, geoname_id = ?, timezone = ?,  gmt = ?,  phone = ?, name_country = ?,  code_iso2_country = ?,  code_iata_city = ?"+ " where id = ?",
                new Object[] {airport.getNameAirport(), airport.getCodeIataAirport(), airport.getCodeIcaoAirport(), airport.getLatitudeAirport(), airport.getLongitudeAirport(), airport.getGeonameId(), airport.getTimezone(), airport.getGMT(), airport.getPhone(), airport.getNameCountry(), airport.getCodeIso2Country(), airport.getCodeIataCity(), airport.getAirportId()});
    }


    class AirportRowMapper implements RowMapper<Airport> {
        @Override
        public Airport mapRow(ResultSet rs, int rowNum) throws SQLException {
            Airport airport = new Airport();
            airport.setAirportId(rs.getInt("id"));
            airport.setNameAirport(rs.getString("name_airport"));
            airport.setCodeIataAirport(rs.getString("code_iata_airport"));
            airport.setCodeIcaoAirport(rs.getString("code_icao_irport"));
            airport.setLatitudeAirport(rs.getDouble("latitude_airport"));
            airport.setLongitudeAirport(rs.getDouble("longitude_airport"));
            airport.setGeonameId(rs.getInt("geoname_id"));
            airport.setTimezone(rs.getString("timezone"));
            airport.setGMT(rs.getString("gmt"));
            airport.setPhone(rs.getString("phone"));
            airport.setNameCountry(rs.getString("name_country"));
            airport.setCodeIso2Country(rs.getString("code_iso2_country"));
            airport.setCodeIataCity(rs.getString("code_iata_city"));

            return airport;
        }
    }

}
