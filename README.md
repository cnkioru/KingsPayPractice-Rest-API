# KingsPay Practice – Payment REST API

## Project Overview

KingsPay Practice is a Java Spring Boot backend application developed to demonstrate RESTful API development and simulate payment transaction responses.

The project provides a payment endpoint that returns structured JSON data representing a successful payment transaction.

This is an independent educational project inspired by payment processing systems.

## Technologies Used

* Java
* Spring Boot
* RESTful APIs
* Maven
* JSON
* IntelliJ IDEA
* Git and GitHub

## Features

* RESTful GET endpoint for retrieving a sample payment response
* JSON-formatted transaction information
* Simulated payment status and confirmation message
* Local backend server powered by Spring Boot

## API Endpoint

**HTTP Method:** GET

**Endpoint:** `/api/payments`

**Local URL:** `http://localhost:8080/api/payments`

### Example JSON Response

```json
{
  "paymentId": "KP1001",
  "amount": 250.00,
  "currency": "USD",
  "status": "SUCCESS",
  "message": "Payment processed successfully"
}
```

*Note: This is a simulated payment response. No real financial transactions are processed.*

## How to Run the Project

1. Clone this GitHub repository.
2. Open the project in IntelliJ IDEA or another Java IDE.
3. Configure a compatible Java JDK.
4. Allow Maven to download the required dependencies.
5. Run `KingspaypracticeApplication.java`.
6. Open a browser and navigate to `http://localhost:8080/api/payments`.

## Skills Demonstrated

* Backend development using Java and Spring Boot
* REST API design and implementation
* HTTP GET request handling
* JSON response generation
* Maven dependency management
* Git version control and GitHub repository management
* API testing using a web browser

## Future Improvements

* Implement POST requests for creating simulated payments
* Add request validation and error handling
* Integrate a database for transaction records
* Add authentication and API security
* Implement automated API tests

## Project Purpose

This project was created to strengthen practical knowledge of Java backend development, RESTful services, and financial technology applications.
