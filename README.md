# Travel Management API

RESTful API for comprehensive travel management with full CRUD operations. Built with Java 21 and Spring Boot following professional backend development practices.

## Overview

Complete travel management system providing endpoints for creating, reading, updating, and deleting travel records. The API implements clean architecture principles with proper separation of concerns and data validation.

## Technology Stack

- **Java 21** - Programming language
- **Spring Boot** - Framework
- **Spring Data JPA** - Data access layer
- **Hibernate** - ORM
- **MySQL** - Database
- **Maven** - Build automation
- **Postman** - API testing

## Features

- Travel record management (create, read, update, delete)
- Full data validation and error handling
- RESTful endpoint design
- Database persistence
- Clean code architecture
- Professional error responses

## Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── travel/api/
│   │       ├── controller/
│   │       ├── service/
│   │       ├── entity/
│   │       ├── repository/
│   │       └── dto/
│   └── resources/
│       └── application.properties
└── test/
```

## API Flow

```
HTTP Request
    ↓
Controller
    ↓
Service Layer
    ↓
DTO to Entity
    ↓
Repository
    ↓
Database (MySQL)
```

## Getting Started

### Prerequisites

- Java 21+
- Maven 3.6+
- MySQL 8.0+
- Docker (optional)

### Installation

1. Clone the repository
```bash
git clone https://github.com/GabrielVanderlinde/travel-management.git
cd travel-management
```

2. Configure database connection
Edit `src/main/resources/application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost/travel_db
spring.datasource.username=root
spring.datasource.password=root
spring.jpa.hibernate.ddl-auto=update
```

3. Build the project
```bash
mvn clean install
```

4. Run the application
```bash
mvn spring-boot:run
```

The API will start on `http://localhost:8080`

## API Endpoints

### Travels

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/travels` | Create a new travel record |
| GET | `/travels` | List all travels |
| GET | `/travels/{id}` | Get specific travel details |
| PUT | `/travels/{id}` | Update travel information |
| DELETE | `/travels/{id}` | Delete travel record |

### Example Request

```http
POST /travels
Content-Type: application/json

{
  "destination": "Paris, France",
  "departureDate": "2024-06-15",
  "returnDate": "2024-06-22",
  "budget": 5000.00,
  "status": "planned"
}
```

## Database Design

Travel table structure with fields for:
- Travel ID (Primary Key)
- Destination
- Departure and return dates
- Budget allocation
- Status tracking
- Creation and modification timestamps

## Best Practices Implemented

- RESTful API design principles
- Proper HTTP status codes
- Data validation on requests
- Exception handling
- Clean code structure
- Separation of concerns
- Database transactions

## Testing

Test the API using Postman or curl:

```bash
# Get all travels
curl http://localhost:8080/travels

# Create new travel
curl -X POST http://localhost:8080/travels \
  -H "Content-Type: application/json" \
  -d '{"destination":"Barcelona","departureDate":"2024-07-01"}'
```

## Development

This project serves as a foundation for learning:
- Spring Boot REST API development
- JPA/Hibernate for database operations
- Professional API design patterns
- Error handling and validation
- Clean code architecture

## License

This project is open source and available under the MIT License.

## Author

Gabriel Vanderlinde - [GitHub](https://github.com/GabrielVanderlinde)
