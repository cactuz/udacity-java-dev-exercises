###Spring Boot Validation demo

###Requirements, Learnings
1. The model must include All args constructor, getters, and setters

2. The Controller must have the @Valid annotation and additional argument BindingResults

3. The html template includes the th:errors tag


###Running the test
Open localhost:8080/add and a form to enter user information will open.

Try submitting no information on the user add form and the validation erros will display.