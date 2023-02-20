package com.dalton.homelessproject.controller;

import com.dalton.homelessproject.dao.JdbcShelterDao;
import com.dalton.homelessproject.model.Shelter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/shelter")
public class ShelterController {

    private final JdbcShelterDao shelterDao;


    public ShelterController(JdbcShelterDao shelterDao) {
        this.shelterDao = shelterDao;
    }
    @RequestMapping(path = "", method = RequestMethod.GET)
    public List<Shelter> getAllShelters(){
       return shelterDao.getAllShelters();
    }

    @RequestMapping(path = "/name/{shelterName}", method = RequestMethod.GET)
    public Shelter getShelterByName(@PathVariable String shelterName){
        return shelterDao.getShelterByName(shelterName);
    }
    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Shelter createNewShelter(@RequestBody Shelter shelter){
        return shelterDao.createNewShelter(shelter);
    }
}
