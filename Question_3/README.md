# Question 3

Persistence is Spring Data JPA over MySQL, requests are validated with Jakarta Bean
Validation, and `GlobalExceptionHandler` turns exceptions into a single JSON error shape
(`ApiError`) instead of the default Spring error page.

The three cases it covers:

- `StudentNotFoundException` -> 404
- `MethodArgumentNotValidException` -> 400, with a map of field name to message
- `DataIntegrityViolationException` -> 409, which in practice means a duplicate email

Database settings are in `application.properties`. Defaults point at
`jdbc:mysql://localhost:3306/student_management` as `root` with no password; the URL,
username and password can be overridden with `DB_URL`, `DB_USERNAME` and `DB_PASSWORD`.
`createDatabaseIfNotExist=true` means the schema is created on first run as long as the
MySQL user is allowed to do that.

`spring.jpa.hibernate.ddl-auto=update` is on so the table is created and kept in sync
without a migration tool - fine for an assignment, not what I'd ship for anything real.
