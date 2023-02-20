package com.dalton.homelessproject.dao;

import com.dalton.homelessproject.model.Shelter;

import java.util.List;

public interface ShelterDao {

    List<Shelter> getAllShelters();

    Shelter getShelterByName(String shelterName);

}
