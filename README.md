# Election Java Project

This is a simple Java-based console project that connects to a MySQL database and retrieves state names using JDBC.

## 👨‍💻 Technologies Used
- Java
- MySQL
- JDBC
- MVC Pattern

## 📁 Project Structure
- DAO Layer → Database access logic
- Service Layer → Bridge between controller and DAO
- Controller Layer → Handles client requests
- Client Layer → Main method to run the app

## 🚀 How to Run
1. Clone the repository
2. Open in any Java IDE (Eclipse, IntelliJ)
3. Make sure MySQL is running and the `election` DB exists
4. Run `ElectionClient.java`

## 📌 SQL to Create Table
```sql
CREATE DATABASE election;
USE election;

CREATE TABLE states (
    id INT PRIMARY KEY AUTO_INCREMENT,
    stnm VARCHAR(100)
);

INSERT INTO states (stnm) VALUES ('Maharashtra'), ('Gujarat'), ('Rajasthan');
