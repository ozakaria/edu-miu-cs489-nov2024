# Fitness Tracker - Backend API

This repository contains the backend services for a fitness tracker application, implemented as a RESTful API. The application enables users to track workouts, diet, and fitness goals.

**GitHub Repository**: [https://github.com/ozakaria/edu-miu-cs489-nov2024/tree/project](https://github.com/ozakaria/edu-miu-cs489-nov2024/tree/project)

---

## Table of Contents
- [Objectives](#objectives)
- [Architecture](#architecture)
- [Technologies](#technologies)
- [Problem Statement](#problem-statement)
- [Getting Started](#getting-started)
- [License](#license)

---

## Objectives

1. **Implement RESTful Services**: Expose endpoints for user workout, diet, and goal tracking.
2. **Ensure Data Persistence**: Use SQL database with Spring Data JPA for managing fitness data.
3. **Secure the API**: Use Spring Security to handle authentication and authorization.
4. **Containerize**: Containerize the application using Docker.
5. **Deploy**: Deploy the application on Microsoft Azure.
6. **Implement CI/CD**: Automate testing and deployment with GitHub Actions.
7. **Implement Unit Tests**: Ensure code quality with Java-based unit testing.

---

## Architecture

### High-Level Architecture Diagram

[To be done later]

---

## Technologies

- **Java 23**: Primary programming language.
- **Spring Boot**: Framework for developing RESTful APIs and microservices.
- **Spring Data JPA**: ORM framework for database interactions.
- **Spring Security**: Secures the API with authentication and authorization.
- **SQL Database**: Relational database for data persistence.
- **Docker**: Containerization of the application.
- **Microsoft Azure**: Cloud platform for deployment.
- **GitHub Actions**: CI/CD pipeline for automated testing and deployment.
- **Postman**: API testing tool.

---

## Problem Statement

The Fitness Tracker API allows users to track workouts, diet, and fitness goals by providing endpoints for managing exercise records, diet logs, and setting fitness targets. This project focuses on the backend functionalities, integrating various software development concepts such as data persistence, API security, containerization, and deployment, along with a CI/CD pipeline for efficient development and deployment.

---

## Getting Started

### Prerequisites

- Java 23
- Docker
- Microsoft Azure account
- Postman (optional, for testing)

### Installation

1. Clone the repository and switch to the `project` branch:
   ```bash
   git clone -b project https://github.com/ozakaria/edu-miu-cs489-nov2024.git
   cd edu-miu-cs489-nov2024

#### Build the application using Maven:

mvn clean install

#### Run the application:

mvn spring-boot:run

#### To containerize the application, build and run the Docker image:

docker build -t fitness-tracker-api .
docker run -p 8080:8080 fitness-tracker-api

---

## License

This project is free to use and distribute.
