# Singleton Pattern Example

This project demonstrates the implementation of the Singleton design pattern using a Logger utility class.

## Files

- `Logger.java` - The singleton Logger class implementation
- `LoggerTest.java` - Test class to verify the singleton pattern works correctly

## Singleton Pattern Implementation

The `Logger` class implements the Singleton pattern with the following key characteristics:

1. **Private Constructor**: The constructor is private to prevent direct instantiation
2. **Private Static Instance**: A private static variable holds the single instance
3. **Public Static Getter**: The `getInstance()` method provides access to the single instance
4. **Lazy Initialization**: The instance is created only when first requested

## Key Features

- **Thread Safety**: This implementation is not thread-safe. For production use, consider using double-checked locking or enum-based singleton
- **Lazy Loading**: The instance is created only when `getInstance()` is first called
- **Global Access**: The single instance can be accessed from anywhere in the application

## How to Run

1. Compile the Java files:
   ```bash
   javac *.java
   ```

2. Run the test:
   ```bash
   java LoggerTest
   ```

## Expected Output

The test will verify that:
- Multiple calls to `getInstance()` return the same object reference
- All logger instances are identical (same memory address)
- The logging functionality works correctly

## Singleton Pattern Benefits

- **Resource Management**: Ensures only one instance exists, saving memory
- **Consistent State**: All parts of the application use the same logger instance
- **Centralized Control**: Easy to manage and configure logging behavior
- **Global Access**: Can be accessed from anywhere without passing references 