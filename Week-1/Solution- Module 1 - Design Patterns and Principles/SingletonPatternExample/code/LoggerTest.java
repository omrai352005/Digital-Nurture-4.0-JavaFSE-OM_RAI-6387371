package SingletonPatternExample.code;

public class LoggerTest {
     public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("First message");

        Logger logger2 = Logger.getInstance();
        logger2.log("Second message");

        if (logger1 == logger2) {
            System.out.println("Singleton works: same instance.");
        } else {
            System.out.println("Singleton failed: different instances.");
        }
    }
}
