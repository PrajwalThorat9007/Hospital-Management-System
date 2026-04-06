# 🏥 Hospital Management System (Spring Boot + JWT)

## 📌 Project Overview

This is a **backend Hospital Management System** built using **Spring Boot, Spring Security, JWT, and MySQL**.
The project is designed for learning and demonstrates how to build **secure REST APIs with authentication and CRUD operations**.

---

## 🎯 Key Features

* ✅ User Registration & Login
* ✅ JWT Authentication
* ✅ Secured APIs using Spring Security
* ✅ Patient CRUD Operations
* ✅ Layered Architecture (Controller → Service → Repository)
* ✅ DTO-based clean structure

---

## 🛠️ Tech Stack

* **Java 17**
* **Spring Boot**
* **Spring Security**
* **JWT (JJWT 0.12.x)**
* **Spring Data JPA**
* **MySQL**
* **Maven**
* **Postman**

---

## 📂 Project Structure

```
com.spring.hospitalmanagementsystem
│
├── config
│   ├── JwtService
│   ├── JwtAuthenticationFilter
│   └── SecurityConfig
│
├── controller
│   ├── AuthController
│   └── PatientController
│
├── dto
│   ├── AuthRequest
│   ├── AuthResponse
│   └── PatientDto
│
├── entity
│   ├── User
│   ├── Role
│   └── Patient
│
├── repository
│   ├── UserRepository
│   └── PatientRepository
│
├── service
│   ├── AuthService
│   └── PatientService
│
└── HospitalManagementSystemApplication
```

---

## 🔐 Authentication Flow

### 🔑 Register

1. User sends name, email, password
2. Data saved in database
3. Response returned

### 🔑 Login

1. User sends email + password
2. Credentials verified
3. JWT token generated
4. Token returned

---

## 🔐 JWT Flow

1. User logs in → gets token
2. Sends token in header:

```
Authorization: Bearer <token>
```

3. JWT Filter validates token
4. Request allowed if valid

---

## 🧑‍⚕️ Patient API (Secured)

| Method | Endpoint           | Description      |
| ------ | ------------------ | ---------------- |
| POST   | /api/patients      | Add patient      |
| GET    | /api/patients      | Get all patients |
| GET    | /api/patients/{id} | Get by ID        |
| PUT    | /api/patients/{id} | Update           |
| DELETE | /api/patients/{id} | Delete           |

---

## 🔓 Auth API (Public)

| Method | Endpoint           | Description   |
| ------ | ------------------ | ------------- |
| POST   | /api/auth/register | Register user |
| POST   | /api/auth/login    | Login user    |

---

## 🧪 Sample Requests

### Register

```json
{
  "name": "Admin",
  "email": "admin@gmail.com",
  "password": "1234"
}
```

### Login

```json
{
  "email": "admin@gmail.com",
  "password": "1234"
}
```

---

## ⚙️ Configuration

### application.properties

```
spring.datasource.url=jdbc:mysql://localhost:3306/hospital_db
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

jwt.secret=your_secret_key_here
```

---

## 🧠 Concepts Covered

* Spring Boot Architecture
* REST API Development
* DTO Pattern
* Dependency Injection
* JPA & Hibernate
* Authentication & Authorization
* JWT Token Handling
* Filter-based Security

---

## 🚀 How to Run

1. Clone the repository
2. Create MySQL database:

```sql
CREATE DATABASE hospital_db;
```

3. Update credentials in `application.properties`
4. Run the application
5. Test APIs using Postman

---

## 🎯 Future Improvements

* 🔐 Password encryption (BCrypt)
* 👥 Role-based access (ADMIN/USER)
* 📄 Swagger API documentation
* ⚠️ Global Exception Handling
* 🌐 Frontend integration (React/Angular)

---

## 🏁 Conclusion

This project demonstrates how to build a **secure backend system using Spring Boot and JWT**.
It is simple, practical, and suitable for **learning, interviews, and project submission**.

---
