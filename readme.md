# Student Management System
This project is a simple student management system that allows you to perform basic CRUD (Create, Read, Update, and Delete) operations on students, courses, and users.

## Prerequisites
- Java 8 or later
- MySQL
- Maven

## Getting Started
1. Clone the repository
2. Import the project into your favorite IDE
3. Create a new MySQL schema named StudentManagement
4. Run the SQL commands in the data.sql file to create and insert data into the required tables
5. Update the MySQL username and password in the src/main/resources/application.properties file
6. Run the project through your IDE or by using the command `mvn spring-boot:run` in the root directory of the project

## Using the Project
The project includes a simple menu system that allows you to navigate through the different functionality. The menu options are:
- Students
- Courses
- Users

Each option allows you to perform basic CRUD operations on the corresponding entities. The exceptions handling will show the error message if there is any issue while performing the operation. The project also includes some use cases to check the functionality of the project.

## Built With
- Spring Boot
- Maven
- MySQL

## SQL commands to create and use Database

```sql
CREATE DATABASE StudentManagement;

USE StudentManagement;

CREATE TABLE students (
  student_id INT PRIMARY KEY,
  first_name VARCHAR(255) NOT NULL,
  last_name VARCHAR(255) NOT NULL,
  city VARCHAR(255) NOT NULL
);

CREATE TABLE course (
  cid INT PRIMARY KEY,
  cname VARCHAR(255) NOT NULL,
  fee INT NOT NULL
);

CREATE TABLE student_course (
  student_id INT,
  course_id INT,
  PRIMARY KEY (student_id, course_id),
  FOREIGN KEY (student_id) REFERENCES students(student_id),
  FOREIGN KEY (course_id) REFERENCES course(cid)
);

CREATE TABLE users (
  username VARCHAR(255) PRIMARY KEY,
  password VARCHAR(255) NOT NULL
);

INSERT INTO students (student_id, first_name, last_name, city) VALUES (1, 'John', 'Doe', 'New York');
INSERT INTO students (student_id, first_name, last_name, city) VALUES (2, 'Jane', 'Doe', 'Chicago');
INSERT INTO students (student_id, first_name, last_name, city) VALUES (3, 'Bob', 'Smith', 'Los Angeles');

INSERT INTO course (cid, cname, fee) VALUES (1, 'Java', 3000);
INSERT INTO course (cid, cname, fee) VALUES (2, 'Python', 2500);

INSERT INTO student_course (student_id, course_id) VALUES (1, 1);
INSERT INTO student_course (student_id, course_id) VALUES (1, 2);
INSERT INTO student_course (student_id, course_id) VALUES (2, 2);
INSERT INTO student_course (student_id, course_id) VALUES (3, 3);

INSERT INTO users (username, password) VALUES ('admin', 'password');
INSERT INTO users (username, password) VALUES ('user', 'password');


```

## Authors
- Jiyauddin 


