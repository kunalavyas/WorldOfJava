package com.selflearning.controller;

import com.selflearning.model.City;
import com.selflearning.service.ICityService;
import com.selflearning.util.WriteCsvToResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
public class MyCityController {

    @Autowired
    ICityService cityService;

    @RequestMapping(value="/cities", produces="text/csv")
    public void findCities (HttpServletResponse response) throws IOException{
        response.setContentType("text/csv");
        response.addHeader("Content-Disposition", "attachment;filename=Download.csv");
        List<City> cities= (List<City>) cityService.findAll();
        WriteCsvToResponse.writeCities(response.getWriter(),cities);
    }

    @RequestMapping(value="/cities/{cityId}", produces="text/csv")
    public void findCity(@PathVariable Long cityId, HttpServletResponse response) throws IOException{
        response.setContentType("text/csv");
        response.addHeader("Content-Disposition", "attachment;filename=Download.csv");
        City city= cityService.findById(cityId);
        WriteCsvToResponse.writeCity(response.getWriter(),city);
    }


}
