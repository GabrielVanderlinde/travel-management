# Travel Management API

API REST para gerenciamento de registros de viagens, desenvolvida com Java e Spring Boot. O projeto pratica operações CRUD, persistência relacional e organização da lógica de negócio em camadas.

## Tecnologias

- Java 21
- Spring Boot
- Spring Data JPA e Hibernate
- MySQL
- Maven

## Funcionalidades

- Criar registros de viagens
- Listar registros e consultar um item específico
- Atualizar dados de viagens
- Remover registros
- Persistir informações em banco de dados

## Como executar

### Pré-requisitos

- JDK 21 ou superior
- Maven
- MySQL

Clone o repositório:

```bash
git clone https://github.com/GabrielVanderlinde/travel-management.git
cd travel-management
```

Configure a conexão com o MySQL em `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost/travel_db
spring.datasource.username=SEU_USUARIO
spring.datasource.password=SUA_SENHA
```

Compile e execute:

```bash
mvn clean install
mvn spring-boot:run
```

## Endpoints documentados

| Método | Rota | Operação |
| --- | --- | --- |
| POST | `/travels` | Criar viagem |
| GET | `/travels` | Listar viagens |
| GET | `/travels/{id}` | Consultar viagem |
| PUT | `/travels/{id}` | Atualizar viagem |
| DELETE | `/travels/{id}` | Remover viagem |

Confira os controllers do projeto para os detalhes atuais de parâmetros, validações e respostas.

## Objetivo

Projeto prático para consolidar conhecimentos de Java, Spring Boot, JPA e construção de APIs REST.

## Autor

Gabriel Vanderlinde