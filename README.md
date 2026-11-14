# Student Management REST API

Assignment: a Spring Boot REST API that does CRUD on student records, backed by MySQL,
using Spring Data JPA for persistence and Bean Validation for the request fields.

The assignment was split into four questions, so the code lives in four folders:

- `Question_1/` - the `Student` entity and its validation rules.
- `Question_2/` - repository, service and the six endpoints.
- `Question_3/` - main class, MySQL settings and the exception handler.
- `Question_4/` - Postman collection, screenshots and the repo link.

All four folders build as one application. Maven only compiles `src/main/java` under the
project root by default, so `pom.xml` pulls the question folders in with
`build-helper-maven-plugin` instead of making me duplicate the source tree.

Setup and run steps are in `Question_4/README.md`.
