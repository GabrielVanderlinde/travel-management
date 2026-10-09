# Travel Management API

API REST para gerenciamento de registros de viagens, desenvolvida com Java e Spring Boot. O projeto demonstra operações CRUD, validação de dados e persistência relacional com JPA.

## Visão geral

O objetivo é consolidar conceitos de desenvolvimento backend em Java, organização em camadas e construção de endpoints REST para um domínio de viagens.

## Tecnologias

- Java (verifique a versão configurada no `pom.xml`)
- Spring Boot
- Spring Data JPA e Hibernate
- MariaDB JDBC Driver
- Bean Validation
- Maven

> **Banco de dados:** o projeto declara o driver JDBC do MariaDB. Ajuste a configuração de conexão ao banco efetivamente utilizado no seu ambiente.

## Pré-requisitos

- JDK compatível com a versão definida no `pom.xml`
- Maven
- Instância de MariaDB/MySQL acessível

## Instalação

```bash
git clone https://github.com/GabrielVanderlinde/travel-management.git
cd travel-management
```

Configure a conexão do banco em `src/main/resources/application.properties` ou por variáveis de ambiente, conforme a configuração adotada no projeto. Exemplo de propriedades para ambiente local:

```properties
spring.datasource.url=jdbc:mariadb://localhost:3306/travel_db
spring.datasource.username=${DB_USERNAME}
spring.datasource.password=${DB_PASSWORD}
```

Defina `DB_USERNAME` e `DB_PASSWORD` no ambiente antes de executar a aplicação. Não versionar credenciais reais.

Compile e execute:

```bash
mvn clean package
mvn spring-boot:run
```

## Funcionalidades

- Criar registros de viagens
- Listar registros
- Consultar um registro específico
- Atualizar dados de viagens
- Remover registros
- Persistir informações em banco relacional

## Endpoints

Confirme os caminhos, parâmetros e formatos de payload nos controllers do projeto antes de consumir a API. As operações CRUD documentadas para o recurso de viagens são:

| Método | Operação |
| --- | --- |
| `POST` | Criar viagem |
| `GET` | Listar viagens |
| `GET` | Consultar viagem por identificador |
| `PUT` | Atualizar viagem |
| `DELETE` | Remover viagem |

As rotas exatas dependem dos mapeamentos definidos nos controllers. Esta documentação evita assumir nomes de campos ou exemplos de payload que não tenham sido confirmados no código.

## Testes

Execute os testes automatizados com:

```bash
mvn test
```

## Estrutura e conceitos

O projeto utiliza Spring Boot para inicialização, Spring Web MVC para a camada HTTP e Spring Data JPA para acesso aos dados. A separação por camadas facilita manutenção e evolução do código.

## Autor

**Gabriel Vanderlinde** · [GitHub](https://github.com/GabrielVanderlinde)

---

Projeto de estudo para evolução em Java, Spring Boot e desenvolvimento de APIs REST.
