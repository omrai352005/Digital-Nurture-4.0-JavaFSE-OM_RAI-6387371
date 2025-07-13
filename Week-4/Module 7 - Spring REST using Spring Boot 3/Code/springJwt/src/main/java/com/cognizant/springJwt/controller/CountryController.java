package com.cognizant.springJwt.controller;

import com.cognizant.springJwt.model.Country;
import com.cognizant.springJwt.service.CountryService;
import com.cognizant.springJwt.service.exception.CountryNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController
public class CountryController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);

    //Handson 4 part

    @GetMapping("/country")
    public Country getCountry() {
        LOGGER.info("START /country endpoint");

        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country country = context.getBean("country", Country.class);
        LOGGER.debug("Returning Country: {}", country);

        LOGGER.info("END /country endpoint");
        return country;
    }
    //Handson 6 part
    @GetMapping("/Countries")

    public ArrayList<Country> getallCountries(){
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        ArrayList<Country> countries = (ArrayList<Country>) context.getBean("countryList");
        return countries;
    }


    //Rest get country based on country code

    @Autowired
    private CountryService countryService;

    @GetMapping("/Countries/{code}")
    public Country getCountry(@PathVariable String code) throws CountryNotFoundException {
        return countryService.getCountry(code);
    }


}
