###Notes:

1. There is no @GetMapping annotation here, actually there is not even a controller. The GraphQL API is driven by the resources/graphql/*.graphqls which is the schema.
   The name of this schema must match the entity (aka resource) it is exposing.
   The variable names inside must match those in the entity.
   The method names need to match the corresponding resolver class, i.e., query or mutator.
   
2. There is a lot of magic that spring boot injects into the project. There is almost nothing in repository, particularly if the repository method is one of the standard ones provide for by spring.

###How to run this project:
Navigate to the root directory and execute:
"rm -rf target; mvn spring-boot:run"

###What you can do:
1) Lookup: http://localhost:8080/graphql/schema.json
   
    




