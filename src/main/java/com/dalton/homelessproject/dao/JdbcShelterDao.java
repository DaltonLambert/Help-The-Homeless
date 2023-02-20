package com.dalton.homelessproject.dao;

import com.dalton.homelessproject.model.Shelter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcShelterDao implements ShelterDao{

    private final JdbcTemplate jdbcTemplate;

    public JdbcShelterDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Shelter> getAllShelters() {
        List<Shelter> shelters = new ArrayList<>();
        String sqlAllShelters = "SELECT * FROM shelters";
        SqlRowSet shelterResults = jdbcTemplate.queryForRowSet(sqlAllShelters);
        while(shelterResults.next()){
            Shelter shelter = mapRowToShelter(shelterResults);
            shelters.add(shelter);
        }
        return shelters;
    }

    public Shelter mapRowToShelter(SqlRowSet rowSet){
        Shelter shelter = new Shelter();
        shelter.setShelterId(rowSet.getInt("id"));
        shelter.setShelterName(rowSet.getString("name"));
        shelter.setShelterAddress(rowSet.getString("address"));
        shelter.setShelterCapacity(rowSet.getInt("capacity"));
        shelter.setShelterPhone(rowSet.getString("phone"));
        shelter.setShelterEmail(rowSet.getString("email"));
        return shelter;
    }
}
