#Project
Forest survey.

## Description
This application allows rangers to input and record details of animals.


## Project setup instructions
* Make sure you have all the Requirements of running Java apps installed such as JUnit, intellij, SDK, JDK.

* Clone the project into your machine from https://github.com/lydia-254/Forest-survey.git

* Gradle run javac Forest-Survey2.java to compile and java forest survey to run the program


## Technologies used
* JAVA
* GRADLE (for unit testing)
* BOOTSTRAP
* SPARK
* HTML

## Set up
* CREATE DATABASE forest_survey;
*\c forest_survey;
* CREATE TABLE animals (id serial PRIMARY KEY, name varchar,type VARCHAR,health VARCHAR,age VARCHAR);
* CREATE TABLE locations (id serial PRIMARY KEY,name VARCHAR);
* CREATE TABLE locations_sightings (id serial PRIMARY KEY,location_id INT,sighting_id INT);
* CREATE TABLE rangers (id serial PRIMARY KEY,name VARCHAR,badge_number VARCHAR, phone_number VARCHAR);
* CREATE TABLE rangers_sightings (id serial PRIMARY KEY,ranger_id INT,sighting_id INT);
* CREATE TABLE sightings (id serial PRIMARY KEY,animal_id INT,ranger_id INT,location_id INT,time TIMESTAMP);
* CREATE DATABASE forest_survey_test WITH TEMPLATE forest_survey;

## Specs
 Rangers can add their names so that they can be identified.
 Ranger adds a zone where the sighting was made.
 Ranger adds the name of the animal they sighted.
 Ranger adds the suspected age of the animal.
 
## Support and contact details
contact me kangerilydia@gmail.com
Tel +254719781523.
Tel +254795491486.

## Live Site
You can view this by following up this link( )
### License
The project is under[MIT license]
Copyright &copy; 2021.All right reserved.