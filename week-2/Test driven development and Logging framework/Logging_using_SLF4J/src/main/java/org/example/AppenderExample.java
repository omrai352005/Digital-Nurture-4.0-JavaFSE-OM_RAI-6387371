package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppenderExample {

    private static final Logger logger = LoggerFactory.getLogger(AppenderExample.class);

    public static void main(String[] args) {
        logger.debug("Debug message - shown in console and saved to file");
        logger.info("Info message - application started");
        logger.warn("Warning message - potential issue detected");
        logger.error("Error message - something went wrong");
    }
}
