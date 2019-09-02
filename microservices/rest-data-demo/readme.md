#What's in this project?
This is a demo of the API using Spring Boot Data Rest.  This has even more magic in exposing a REST endpoints given just the entity. There is no need to create a controller or service, perfect for a simple microservice.

This project is paired with a eureka-demo project so that this microservice will be registered. An API documentation is also available.

The service is also secured with basic authentication.


#Optional Pre-requisites:
(Optional)
If Eureka service registry is desired, set to `eureka.client.enabled` to `true` .Then before 
running this server, open and run the eureka-demo project before 
this one.


#Authentication
Basic Auth: 
Username: admin
Password: password

#What to when this runs:
1. Try `http://localhost:8762`
2. Try `http://localhost:8762/dogs` - which should provide you all the data from data.sql. 
3. Try POST `http://localhost:8762/dogs`.
4. (Optional, see pre-requisite)You should be able to see the 'DOG-SERVICE' registed in the eureka server `http://localhost:8761`
5. You can also see the Swagger documentation through `http://localhost:8762/swagger-ui.html#`