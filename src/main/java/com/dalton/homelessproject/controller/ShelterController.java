package com.dalton.homelessproject.controller;

import com.dalton.homelessproject.dao.JdbcShelterDao;
import com.dalton.homelessproject.model.Shelter;
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
}
