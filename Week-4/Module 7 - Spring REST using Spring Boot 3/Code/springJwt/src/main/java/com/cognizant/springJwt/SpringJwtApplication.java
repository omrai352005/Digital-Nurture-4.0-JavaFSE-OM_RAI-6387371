package com.cognizant.springJwt;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


import com.cognizant.springJwt.model.Country;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//handson 3 part
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class SpringJwtApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringJwtApplication.class);
	public static void main(String[] args) throws ParseException {

		SpringApplication.run(SpringJwtApplication.class, args);

		//handson 1 part
//		System.out.println("hello spring world ");

		//handson 2 part
//		displayDate();

		//handson 4 part
		displayCountry();
	}

	// Handson 2 part

//	public static void displayDate() throws ParseException {
//
//		ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
//		SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);
//
//		Date date = format.parse("31/12/2018");
//		System.out.println("Parsed Date: " + date);
//
//	}

	//Handson 3 part

//	public static void displayDate() throws ParseException {
//			LOGGER.info("START");
//
//		ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
//		SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);
//
//		Date date = format.parse("31/12/2018");
//		LOGGER.debug("Parsed Date: {}", date);
//		System.out.println("Parsed Date: " + date);
//		LOGGER.info("END");
//	}


	// handson 4 part
//	public static void displayCountry() {
//
//		LOGGER.info("START");
//
//		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
//		Country country = context.getBean("country", Country.class);
//		LOGGER.debug("Country : {}", country.toString());
//
//		LOGGER.info("END");
//	}

	//Handson 5 part

	public static void displayCountry() {
		LOGGER.info("START");

		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

		Country country = context.getBean("country", Country.class);
		Country anotherCountry = context.getBean("country", Country.class);

		LOGGER.debug("Country 1: {}", country);
		LOGGER.debug("Country 2: {}", anotherCountry);

		LOGGER.info("END");
	}




}
