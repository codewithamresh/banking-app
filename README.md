Client → Controller → Service → Repository → Database (via Entity)

- Controller: Handles HTTP requests (routes).

- Service: Contains business logic.

- Repository: Interacts with the database.

- Entity: Maps to a table in the DB using JPA annotations.

---

- User ↔ Account: One-to-Many

- Account ↔ Transaction: One-to-Many

--- 

Client Request
↓
Controller (REST API)
↓
Service (Business Logic)
↓
Repository (JPA)
↓
Database (via Entities)
