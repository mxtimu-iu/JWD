# JWD
This is a repository specially for my Java and web development module 

# Real Estate Web App – Backend (Spring Boot)

## Requirements

- Java 17+
- Maven
- MySQL Workbench or Server
- IntelliJ IDEA
- Postman (for API testing)

## Getting Started

1. Clone the repo
2. Set up the MySQL database:
    - Create a database called realestate
    - Update src/main/resources/application.properties with your DB credentials
3. Import project into IntelliJ as a Maven project
4. Run the project using the main class

## Endpoints (tested via Postman)

- POST /users - Register user
- GET /users - List users
- More endpoints coming soon...

# application.properties example 
in the resources folder there is an application.properties file you will need to Create a copy of application.properties.example and rename it to application.properties.
Update it with your actual database credentials.