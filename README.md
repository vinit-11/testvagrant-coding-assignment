# testvagrant-coding-assignment
A brief description of what this project does and who it's for 

##Description 
In this project we verify the release date and country from two sources i.e (IMDB and Wiki).

##Acknowledgements 
In this project we have two package one is for Pages and Tests. all the web page related classes comes under the Pages package and all test related classes comes under Test package. In Pages package we have Test Base class deals with all the common functions used by all the Pages.

Also we have config.properties file in that store the information remains static throught the framework such as url,login crediential.

Test class in that using TestNg we run it also using TestNg we verify ,grouping and assertion is done.

##Features
Light/dark mode toggle Live previews Fullscreen mode Cross platform ##Prerequisite 1 : Java 2 : Eclipse is install in system 3 : Selenium 4 : TestNg is required 5 : Maven

##Installation 
First of all I assume you already have eclipse installed on your machine so you can follow the step.

Step 1: install maven in your local machine Step 2: install maven in your eclipse Step 3: create maven project Step 4: adding maven dependency in pom.xml file Step 5: Check everything has working fine and relax. 

##Dependencies 
Add following Dependency in pom.xml

	<dependency>
		<groupId>org.seleniumhq.selenium</groupId>
		<artifactId>selenium-java</artifactId>
		<version>4.1.2</version>
	</dependency>


	<!-- https://mvnrepository.com/artifact/org.testng/testng -->
	<dependency>
		<groupId>org.testng</groupId>
		<artifactId>testng</artifactId>
		<version>7.5</version>
		<scope>test</scope>
	</dependency>

	<!-- https://mvnrepository.com/artifact/com.aventstack/extentreports -->
	<dependency>
		<groupId>com.aventstack</groupId>
		<artifactId>extentreports</artifactId>
		<version>5.0.9</version>
	</dependency>

	<!-- https://mvnrepository.com/artifact/org.apache.poi/poi -->
	<dependency>
		<groupId>org.apache.poi</groupId>
		<artifactId>poi</artifactId>
		<version>5.2.1</version>
	</dependency>

	<!-- https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml -->
	<dependency>
		<groupId>org.apache.poi</groupId>
		<artifactId>poi-ooxml</artifactId>
		<version>5.2.1</version>
	</dependency>
	
	<!-- https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager -->
	<dependency>
		 <groupId>io.github.bonigarcia</groupId>
		 <artifactId>webdrivermanager</artifactId>
 		 <version>5.1.0</version>
	</dependency>
##Running Tests 
To run tests, run the following command
cd "path of the project"

mvn clean install 
##Authors 
@vinit-11
