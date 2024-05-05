# Restaurant Supplier Relationship Management (SRM) System

Welcome to the Restaurant Supplier Relationship Management (SRM) System! This project aims to design and implement a comprehensive SRM system tailored for restaurants. The system facilitates efficient procurement processes, supplier management, and inventory control, enhancing the overall efficiency and performance of restaurant operations.

## Project Overview

This project aims to design and implement a comprehensive Supplier Relationship Management (SRM) system for optimizing procurement processes, managing supplier relationships, and streamlining operations within the restaurant industry. The system will facilitate efficient order processing, vendor management, and inventory control, enhancing the overall efficiency and performance of restaurant operations.

## Features

- **Order Processing**: Efficiently manage orders from suppliers, including placing orders, tracking deliveries, and managing invoices.
  
- **Supplier Management**: Maintain a database of suppliers, track supplier performance, and manage relationships to ensure quality and reliability of deliveries.
  
- **Inventory Control**: Monitor inventory levels, track stock movements, and optimize inventory management to prevent stockouts and reduce excess inventory.
  
- **Menu Creation**: Streamline menu creation by integrating with the inventory system to automatically update menu items based on ingredient availability.
  
- **Staff Hiring**: Facilitate staff hiring processes, including posting job openings, managing applications, and scheduling interviews.

## Technologies Used

- Java
- Spring
- Spring boot
- Spring data jpa
- Spring web services
- Spring security
- JWT
- Postgresql
- Maven

## Getting Started

1. Clone the repository: `git clone <repository-url>`
2. Build the project: `mvn clean package`
3. Go to application.properties and do some change:
4. change `spring.datasource.url=jdbc:postgresql://localhost:5432/restik` to your own database url
5. change `spring.datasource.username=postgres` to your username
6. change `.datasource.password=57206700` to your password
7. Run the application

## Usage

- Access the Django admin panel at `http://localhost:2024/swagger-ui/index.html#/` to manage all endpoints.
- authorize like admin with credentials: 'admin@gmail.com' and 'admin123' or sign up and create your own admin account
- Use API endpoints to interact with the system programmatically.


## API Endpoints

