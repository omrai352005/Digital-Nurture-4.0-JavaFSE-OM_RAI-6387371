package org.example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class Parameterized_Logging {

    private static final Logger logger = LoggerFactory.getLogger(Parameterized_Logging.class);

    public static void main(String[] args) {
        String username = "rahul123";
        int loginAttempts = 3;

        logger.info("User {} attempted to log in {} times", username, loginAttempts);

        double price = 499.99;
        int quantity = 2;
        logger.debug("Total cost for {} items at ₹{} each is ₹{}", quantity, price, price * quantity);
    }
}
