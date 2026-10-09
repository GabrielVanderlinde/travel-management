# Travel Management API

RESTful API for managing travel records and related operations. The project focuses on backend design, data persistence, and clean service-layer architecture.

## Overview

This project implements a complete travel management flow with CRUD operations. It is built to practice Java 21, Spring Boot, JPA, and good API design patterns in a realistic business domain.

## Tech Stack

- Java 21
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven

## Features

- Create travel records
- Read all or specific travel records
- Update existing travel data
- Delete records
- Validation and error handling
- Database persistence

## Getting Started

### Prerequisites

- Java 21+
- Maven
- MySQL

### Installation

```bash
git clone https://github.com/GabrielVanderlinde/travel-management.git
cd travel-management
```

### Database configuration

Edit `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost/travel_db
spring.datasource.username=root
spring.datasource.password=root
```

### Run the application

```bash
mvn clean install
mvn spring-boot:run
```

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/travels` | Create travel |
| GET | `/travels` | List travels |
| GET | `/travels/{id}` | Get travel by ID |
| PUT | `/travels/{id}` | Update travel |
| DELETE | `/travels/{id}` | Delete travel |

## Notes

This project is intended as a backend study and portfolio project focused on Java and Spring Boot best practices.

## License

MIT

## Author

Gabriel Vanderlinde
