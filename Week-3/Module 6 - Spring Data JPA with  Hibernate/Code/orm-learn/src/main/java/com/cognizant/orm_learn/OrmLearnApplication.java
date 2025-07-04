package com.cognizant.orm_learn;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.service.CountryService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class OrmLearnApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
	private static CountryService countryService;
	public static void main(String[] args) {


	   ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
		countryService = context.getBean(CountryService.class);

		testGetAllCountries();
//		testAddCountry();
//		testUpdateCountry();
		testDeleteCountry();

	}

	private static void testGetAllCountries() {
		LOGGER.info("Start");
		List<Country> countries = countryService.getAllCountries();
		LOGGER.debug("countries={}", countries);

		LOGGER.info("End");


	}
	private static void testAddCountry() {
		LOGGER.info("Start addCountry");
		Country newCountry = new Country("ZZ", "Testland");
		countryService.addCountry(newCountry);
		LOGGER.debug("Added country: {}", newCountry);
		LOGGER.info("End addCountry");
	}

	private static void testUpdateCountry() {
		LOGGER.info("Start updateCountry");
		try {
			countryService.updateCountry("ZZ", "New Tesstland");
			Country updated = countryService.getCountry("ZZ");
			LOGGER.debug("Updated country: {}", updated);
		} catch (Exception e) {
			LOGGER.error("Error updating country", e);
		}
		LOGGER.info("End updateCountry");
	}

	private static void testDeleteCountry() {
		LOGGER.info("Start deleteCountry");
		countryService.deleteCountry("ZZ");
		LOGGER.debug("Deleted country with code ZZ");
		LOGGER.info("End deleteCountry");
	}



}
