# Question 4

- Source for the whole assignment: this folder, including `pom.xml`.
- Postman collection: `postman/Student_Management_REST_API.postman_collection.json`.
- Screenshots: `screenshots/` - one per request, taken in Postman after running the app.
- GitHub link: _add the repo URL here once this is pushed._

## Running it

1. Need Java 17+, Maven and a local MySQL server.
2. Either create the database yourself or let the connection URL do it
   (`createDatabaseIfNotExist=true`). If root isn't the right account, export
   `DB_USERNAME` / `DB_PASSWORD` (and `DB_URL` if the server isn't on 3306).
3. `mvn spring-boot:run` from this project folder.
4. Import the Postman collection and send the requests top to bottom. The first one saves
   the new student's id into the `studentId` variable, so the get/update/delete requests
   after it work without editing anything. `baseUrl` defaults to `http://localhost:8080`.
