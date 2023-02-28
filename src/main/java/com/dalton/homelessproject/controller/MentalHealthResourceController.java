package com.dalton.homelessproject.controller;

import com.dalton.homelessproject.dao.JdbcMentalHealthResourceDao;
import com.dalton.homelessproject.model.MentalHealthResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/resource")
public class MentalHealthResourceController {
    private final JdbcMentalHealthResourceDao mentalHealthResourceDao;

    public MentalHealthResourceController(JdbcMentalHealthResourceDao mentalHealthResourceDao) {
        this.mentalHealthResourceDao = mentalHealthResourceDao;
    }

    @RequestMapping(path = "", method = RequestMethod.GET)
    public List<MentalHealthResource> getAllMentalHealthResources(){
        return mentalHealthResourceDao.getAllMentalHealthResources();
    }
}
