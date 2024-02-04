# Project Documentation

## Backend

### Technologies Used
- Spring Boot
- Java
- MySQL
- Hibernate
- Maven

### Local Setup
1. **Clone Repository:**
   ```bash
   git clone https://github.com/your-username/your-repo.git
   cd your-repo/backend

2. **Configure Database:**
   Set up a MySQL database.
   Update application.properties with your database configuration.
   ```bash
   spring.datasource.url=jdbc:mysql://localhost:3306/todo_db
   spring.datasource.username=user
   spring.datasource.password=your-password

3. **Run Backend:**
   ```bash
   mvn spring-boot:run
The backend should now be running on http://localhost:8080.
