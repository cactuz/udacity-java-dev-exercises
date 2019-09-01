#What's in this project?
This is a demo of the API using Spring Boot Data Rest.  This has even more magic in exposing a REST endpoints given just the entity. There is no need to create a controller or service, perfect fora simple microservice.

This project is paired with a eureka-demo project so that this microservice will be registered.

#Pre-requisites:
Open up the eureka-demo projet and run it, before this one.

#What to when this runs:
1. Try `http://localhost:8080`
2. Try `http://localhost:8080/dogs` - which should provide you all the data from data.sql. 
3. Try POST `http://localhost:8080/dogs`.
4. If you completed the pre-requisite before running this server, you should be able to see the 'DOG-SERVICE' registed in the eureka server `http://localhost:8761`