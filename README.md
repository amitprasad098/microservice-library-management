Overview
The Library Management System is a microservices-based console application developed using Java Spring Boot. This project demonstrates the principles of microservice architecture by breaking down the application into three separate services - Users, Books, and Library. Users can interact with the Library service to lend or return books, while Users and Books services maintain their own databases for metadata information.

Technologies Used
Java Spring Boot: The application is built using the Spring Boot framework, providing a robust and efficient platform for developing microservices.

MySQL Database: Each microservice has its own MySQL database for storing metadata information related to users and books.

Maven: Dependency management and project build are handled by Maven, ensuring a consistent and easily reproducible build process.

Mockito: Unit testing is performed using the Mockito framework to ensure the reliability and correctness of the code.

Microservices

1. Users Microservice
   Manages user-related operations.
   Interacts with the Users database for user metadata.
2. Books Microservice
   Handles book-related functionalities.
   Connects to the Books database for book metadata.
3. Library Microservice
   Core service responsible for book lending and return operations.
   Utilizes both Users and Books microservices for user and book information.
