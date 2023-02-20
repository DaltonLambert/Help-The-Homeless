package com.dalton.homelessproject.controller;

import com.dalton.homelessproject.dao.JdbcShelterDao;
import com.dalton.homelessproject.model.Shelter;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
}
