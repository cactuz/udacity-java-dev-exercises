###Required for set-up:
1) Need the view (html or ftl) in the /src/main/resources/templates folder
2) The view name must match the String return by the controller
3) Set the application.properties required freemarker configuration settings, this is very important!
4) Use the correct signature in the controller, see the example.
6) Do not use @ResponseBody in the controller.
5) In the view add model[] specification, see example.

There are guide notes in the code.

###Running the application:
To get the view use: localhost:8080/students