# Question 2

The six endpoints from the question, all under `/api/students`:

| Method | Path | What it does |
| --- | --- | --- |
| POST | `/api/students` | Adds a student, returns 201 and a Location header |
| GET | `/api/students` | Returns every student |
| GET | `/api/students/{id}` | One student, 404 if the id doesn't exist |
| PUT | `/api/students/{id}` | Overwrites name, email, course and age, 404 if missing |
| DELETE | `/api/students/{id}` | Deletes and returns 204, 404 if missing |
| GET | `/api/students/course/{course}` | Students on a course, matching case-insensitively |

The controller only handles HTTP. Lookups and the "not found" check live in
`StudentService`, and the course search is a derived query method
(`findByCourseIgnoreCase`) on `StudentRepository`.
