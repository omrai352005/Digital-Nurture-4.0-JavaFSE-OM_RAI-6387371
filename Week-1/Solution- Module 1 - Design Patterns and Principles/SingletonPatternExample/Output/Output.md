# Terminal 

1. javac * .java  //compile files 
2. java SingletonPatternExample.LoggerTest //run file


# Output

C:\Users\omrai\Desktop\cognizent\Digital-Nurture-4.0-JavaFSE-OM_RAI-6387371\Week-1\Solution- Module 1 - Design Patterns and Principles>java SingletonPatternExample.LoggerTest

Testing Singleton Pattern Implementation
First instance: SingletonPatternExample.Logger@28a418fc
Second instance: SingletonPatternExample.Logger@28a418fc
Third instance: SingletonPatternExample.Logger@28a418fc

Verification:
logger1 == logger2: true
logger2 == logger3: true
logger1 == logger3: true
Testing logging functionality:
LOG: This is a test message from logger1
LOG: This is a test message from logger2
LOG: This is a test message from logger3

? SUCCESS: Singleton pattern is working correctly!
All instances are the same object - only one Logger instance exists.