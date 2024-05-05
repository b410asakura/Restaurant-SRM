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

1. Clone the repository: `git clone https://github.com/your-username/data-analytics-platform.git`
2. Install dependencies: `pip install -r requirements.txt`
3. Apply database migrations: `python manage.py migrate`
4. Run the development server: `python manage.py runserver`

## Usage

- Access the Django admin panel at `http://localhost:8000/admin/` to manage users, events, and data.
- Use API endpoints to interact with the system programmatically.
- Analyze text data by sending a POST request to `http://localhost:8000/analytics/analysis/` with the data ID.

## Contributors

- John Doe <john@example.com>
- Jane Smith <jane@example.com>

## API Endpoints

### Users

- **List Users:** `GET /users/`
- **Retrieve User:** `GET /users/{id}/`
- **Create User:** `POST /users/`
- **Update User:** `PUT /users/{id}/`
- **Delete User:** `DELETE /users/{id}/`

### Events

- **List Events:** `GET /events/`
- **Retrieve Event:** `GET /events/{id}/`
- **Create Event:** `POST /events/`
- **Update Event:** `PUT /events/{id}/`
- **Delete Event:** `DELETE /events/{id}/`

### Data

- **List Data:** `GET /data/`
- **Retrieve Data:** `GET /data/{id}/`
- **Create Data:** `POST /data/`
- **Update Data:** `PUT /data/{id}/`
- **Delete Data:** `DELETE /data/{id}/`

### Analysis

- **Analyze Text Data:** `POST /analysis/`

   *Body Parameters:*
   ```json
   {
       "data_id": 1
   }
