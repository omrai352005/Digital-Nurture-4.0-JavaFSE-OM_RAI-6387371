package com.cognizant.orm_learn.service;


import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.repository.CountryRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Transactional
    public List<Country> getAllCountries(){
        return countryRepository.findAll();
    }

    public Country getCountry(String code){
        Optional<Country> result = countryRepository.findById(code);
        return result.orElse(null);
    }

    //add country
    @Transactional
    public void addCountry(Country country) {
        countryRepository.save(country);
    }

    //  Update country
    @Transactional
    public void updateCountry(String code, String newName) throws Exception {
        Country country = getCountry(code);
        country.setName(newName);
        countryRepository.save(country);  // save will update if entity exists
    }

    //  Delete country
    @Transactional
    public void deleteCountry(String code) {
        countryRepository.deleteById(code);
    }

    public List<Country> getCountriesByPartialName(String keyword) {
        return countryRepository.findByNameContainingIgnoreCase(keyword);
    }


}
