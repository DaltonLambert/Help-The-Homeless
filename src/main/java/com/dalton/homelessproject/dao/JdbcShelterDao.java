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

    @Override
    public Shelter getShelterByName(String shelterName) {
        String sqlShelterByName = "SELECT * FROM shelters WHERE name = ?";
        SqlRowSet shelterByNameResults = jdbcTemplate.queryForRowSet(sqlShelterByName, shelterName);
        if (shelterByNameResults.next()){
            return mapRowToShelter(shelterByNameResults);
        } else {
            return null;
        }
    }

    @Override
    public Shelter createNewShelter(Shelter shelter) {
        String sqlCreateNewShelter = "INSERT INTO shelters ( name, address, capacity, phone) VALUES (?,?,?,?) returning id";
        int newShelterId = jdbcTemplate.queryForObject(sqlCreateNewShelter, int.class, shelter.getShelterName(),
                shelter.getShelterAddress(), shelter.getShelterCapacity(), shelter.getShelterPhone());
        shelter.setShelterId(newShelterId);
        return shelter;
    }


    public Shelter mapRowToShelter(SqlRowSet rowSet){
        Shelter shelter = new Shelter();
        shelter.setShelterId(rowSet.getInt("id"));
        shelter.setShelterName(rowSet.getString("name"));
        shelter.setShelterAddress(rowSet.getString("address"));
        shelter.setShelterCapacity(rowSet.getInt("capacity"));
        shelter.setShelterPhone(rowSet.getString("phone"));
        return shelter;
    }
}
