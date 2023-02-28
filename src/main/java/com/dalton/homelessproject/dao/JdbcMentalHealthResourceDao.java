package com.dalton.homelessproject.dao;

import com.dalton.homelessproject.model.MentalHealthResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class JdbcMentalHealthResourceDao implements MentalHealthResourceDao{
    private final JdbcTemplate jdbcTemplate;

    public JdbcMentalHealthResourceDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<MentalHealthResource> getAllMentalHealthResources() {
        List<MentalHealthResource> mentalHealthResources = new ArrayList<>();
        String sqlMentalHealthResource = "SELECT * FROM mental_health_resources";
        SqlRowSet mentalHealthResourcesResults = jdbcTemplate.queryForRowSet(sqlMentalHealthResource);
        while (mentalHealthResourcesResults.next()){
            MentalHealthResource mentalHealthResource = mapRowToMentalHealthResource(mentalHealthResourcesResults);
            mentalHealthResources.add(mentalHealthResource);
        }
        return mentalHealthResources;
    }

   public MentalHealthResource mapRowToMentalHealthResource(SqlRowSet rowSet){
        MentalHealthResource mentalHealthResource = new MentalHealthResource();
        mentalHealthResource.setHealthId(rowSet.getInt("id"));
        mentalHealthResource.setHealthName(rowSet.getString("name"));
        mentalHealthResource.setHealthAddress(rowSet.getString("address"));
        mentalHealthResource.setHealthWebsite(rowSet.getString("website"));
        mentalHealthResource.setHealthPhone(rowSet.getString("phone"));
        return mentalHealthResource;
    }
}
