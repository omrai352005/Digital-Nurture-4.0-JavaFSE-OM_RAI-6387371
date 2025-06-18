package SingletonPatternExample;

public class LoggerTest {
    public static void main(String[] args) {
        System.out.println("Testing Singleton Pattern Implementation");
        System.out.println("=====================================");
        
        // Get first instance
        Logger logger1 = Logger.getInstance();
        System.out.println("First instance: " + logger1);
        
        // Get second instance
        Logger logger2 = Logger.getInstance();
        System.out.println("Second instance: " + logger2);
        
        // Get third instance
        Logger logger3 = Logger.getInstance();
        System.out.println("Third instance: " + logger3);
        
        // Test if all instances are the same
        System.out.println("\nVerification:");
        System.out.println("logger1 == logger2: " + (logger1 == logger2));
        System.out.println("logger2 == logger3: " + (logger2 == logger3));
        System.out.println("logger1 == logger3: " + (logger1 == logger3));
        
        // Test logging functionality
        System.out.println("\nTesting logging functionality:");
        logger1.log("This is a test message from logger1");
        logger2.log("This is a test message from logger2");
        logger3.log("This is a test message from logger3");
        
        // Verify singleton behavior
        if (logger1 == logger2 && logger2 == logger3) {
            System.out.println("\n✅ SUCCESS: Singleton pattern is working correctly!");
            System.out.println("All instances are the same object - only one Logger instance exists.");
        } else {
            System.out.println("\n❌ FAILURE: Singleton pattern is not working correctly!");
            System.out.println("Multiple instances were created.");
        }
    }
} 