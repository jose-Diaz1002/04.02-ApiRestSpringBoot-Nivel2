# 🍓 S04T02N02 - Fruit CRUD Application with Spring Boot & MySQL

Welcome to the **Fruit CRUD API**, a Spring Boot-based backend application that allows you to manage a simple list of fruits in a MySQL database! This project demonstrates the use of the **MVC pattern**, **Spring Data JPA**, and a real **MySQL** persistence layer.

> ✨ _Level 2 Project from IT Academy's Java backend curriculum_

---

## 🔧 Project Setup

This project was generated using [Spring Initializr](https://start.spring.io/) with the following configuration:

| Setting              | Value                             |
|----------------------|-----------------------------------|
| Project              | Maven                             |
| Language             | Java                              |
| Spring Boot Version  | ✅ Latest stable release           |
| Group                | `cat.itacademy.s04.t02.n02`       |
| Artifact             | `S04T02N02`                       |
| Name                 | `S04T02N02`                       |
| Description          | `S04T02N02`                       |
| Packaging            | Jar                               |
| Java Version         | 11 or higher                      |

### 📦 Dependencies

- ✅ Spring Boot DevTools  
- 🌐 Spring Web  
- 🧬 Spring Data JPA  
- 🐬 MySQL Driver  

---

## 🗂️ Project Structure

```plaintext
└── src
    └── main
        └── java
            └── cat
                └── itacademy
                    └── s04
                        └── t02
                            └── n02
                                ├── controllers     # 🍽️ Handles HTTP requests
                                ├── model           # 🍏 Contains the Fruit entity
                                ├── repository      # 💾 JPA Repository interfaces
                                ├── services        # 🧠 Business logic layer
                                └── exception       # 🚨 Custom exception handling
