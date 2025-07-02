# Exercise 1: Configuring a Basic Spring Application

<span style="color:#0096FF;">**Code :** </span>
        
        For code please refer to the Code folder under : 
        
        Week-3\Module 5 - Spring Core and Maven\LibraryManagement\Code


**Scenario:**

Your company is developing a web application for managing a library. You need to use the Spring Framework to handle the backend operations.
Steps:
1.	Set Up a Spring Project:

         o	Create a Maven project named LibraryManagement.

         o	Add Spring Core dependencies in the pom.xml file.

<span style="color:#0096FF;">**Output 1** </span>

![alt text](IMG/image.png)

2.	Configure the Application Context:

        o	Create an XML configuration file named applicationContext.xml in the src/main/resources directory.

        o	Define beans for BookService and BookRepository in the XML file.

<span style="color:#0096FF;">**Output 2** </span>

![alt text](IMG/image-1.png)

3.	Define Service and Repository Classes:

        o	Create a package com.library.service and add a class BookService.

        o	Create a package com.library.repository and add a class BookRepository.

<span style="color:#0096FF;">**Output 3** </span>

![alt text](IMG/image-2.png)
![alt text](IMG/image-3.png)

4.	Run the Application:

        o	Create a main class to load the Spring context and test the configuration.

<span style="color:#0096FF;">**Output 4** </span>

![alt text](IMG/image-4.png)

<span style="color:#0096FF;">**Output 5: Final ouptut on running the Program** </span>

![alt text](IMG/image-5.png)