# Task Tracker API  

## 📌 Overview
This project is a **back-end RESTful API** for managing tasks. It was built as a learning project to migrate **command-line application logic** into a more **robust, enterprise-style system**, with a focus on:

- Database persistence
- RESTful API design
- Clean architecture using Spring Boot

---

## 🛠 Tech Stack

- **Language:** Java 25  
- **Framework:** Spring Boot
- **Database:** PostgreSQL 14.20  
- **Build Tool:** Maven  
- **Dependencies:**
  - Spring Web
  - Spring Data JPA
  - PostgreSQL Driver  
- **Testing Tool:** Postman  

---

## ✨ Features

- **Full CRUD Operations**
  - Create, Read, Update, and Delete tasks
- **Persistent Storage**
  - Data is stored in a PostgreSQL database (not in-memory)
- **RESTful API Design**
  - Clean, predictable endpoints using standard HTTP methods

---

## 🔗 API Endpoints

| HTTP Method | Endpoint              | Description                    | JSON Body Example |
|------------|-----------------------|--------------------------------|-------------------|
| GET        | `/api/tasks`          | Retrieve all tasks             | `[]` |
| POST       | `/api/tasks`          | Create a new task              | `{ "description": "New Task", "status": "to-do" }` |
| PUT        | `/api/tasks/{id}`     | Update an existing task        | `{ "id": 1, "description": "Updated Desc", "status": "complete" }` |
| DELETE     | `/api/tasks/{id}`     | Delete a task by ID            | N/A |

---
