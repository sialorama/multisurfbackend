# Multi-Surface App with Spring Boot (JPA, MySQL) and React

This is a full-stack web application built with a Spring Boot backend and a React frontend. The backend is powered by Spring Data JPA with MySQL, and the frontend is built using React. The app is designed to be multi-surface, meaning it is responsive and works well on different screen sizes.

## Table of Contents

- [Features](#features)
- [Prerequisites](#prerequisites)
- [Backend Setup (Spring Boot)](#backend-setup-spring-boot)
- [Frontend Setup (React)](#frontend-setup-react)
- [Running the Application](#running-the-application)
- [Technology Stack](#technology-stack)
- [Project Structure](#project-structure)
- [Multi-Surface Considerations](#multi-surface-considerations)

## Features

- **Product Management:** Create and list products with name and price.
- **Spring Boot Backend:** REST API using Spring Boot with Spring Data JPA and MySQL.
- **React Frontend:** Responsive UI using React, featuring a product list and form to add new products.
- **Multi-Surface Compatibility:** Designed to work across desktop and mobile devices.

## Prerequisites

Before running the project, make sure you have the following installed:

- **Java 17+**
- **Maven**
- **Node.js (v14+) and npm**
- **MySQL**

## Backend Setup (Spring Boot)

1. **Clone the repository:**
   ```bash
   git clone https://github.com/your-username/multi-surface-app.git
   cd multi-surface-app
   ```

2. **Configure MySQL:**
    - Create a MySQL database (e.g., `multi_surface_db`).
    - Open `src/main/resources/application.properties` and update the database connection details:
      ```properties
      spring.datasource.url=jdbc:mysql://localhost:3306/multi_surface_db
      spring.datasource.username=root
      spring.datasource.password=your_password
      ```

3. **Run the Spring Boot application:**
   ```bash
   mvn spring-boot:run
   ```

   The backend API will be available at `http://localhost:8080`.

## Frontend Setup (React)

1. **Navigate to the frontend directory:**
   ```bash
   cd frontend
   ```

2. **Install dependencies:**
   ```bash
   npm install
   ```

3. **Start the React development server:**
   ```bash
   npm start
   ```

   The React app will be running at `http://localhost:3000`.

## Running the Application

1. **Start the Spring Boot backend:**
    - Run `mvn spring-boot:run` from the root directory.

2. **Start the React frontend:**
    - Run `npm start` from the `frontend` directory.

3. **Access the application:**
    - Visit `http://localhost:3000` in your web browser to interact with the frontend.
    - The frontend will make API calls to the backend at `http://localhost:8080`.

## Technology Stack

### Backend
- **Spring Boot**: Backend framework for building REST APIs.
- **Spring Data JPA**: ORM layer for interacting with MySQL.
- **MySQL**: Relational database for storing product data.
- **Hibernate**: JPA implementation used by Spring Data JPA.

### Frontend
- **React**: Frontend library for building user interfaces.
- **Axios**: HTTP client for making API requests to the backend.
- **CSS**: For responsive design and styling.

## Project Structure

```
multi-surface-app
│
├── backend (Spring Boot Project)
│   ├── src/main/java/com/example/multisurfaceapp
│   │   ├── controller
│   │   ├── entity
│   │   ├── repository
│   │   ├── service
│   │   └── MultiSurfaceAppApplication.java
│   └── src/main/resources
│       └── application.properties
│
└── frontend (React Project)
    ├── public
    ├── src
    │   ├── components
    │   │   ├── ProductForm.js
    │   │   └── ProductList.js
    │   └── App.js
    └── package.json
```

### Backend Files
- **Entity (Product.java):** Represents the `Product` entity.
- **Repository (ProductRepository.java):** Data access layer using Spring Data JPA.
- **Service (ProductService.java):** Business logic for handling products.
- **Controller (ProductController.java):** REST API endpoints for managing products.

### Frontend Files
- **ProductForm.js:** React component for adding new products.
- **ProductList.js:** React component for displaying a list of products.
- **App.js:** Main component that combines the form and list.

## Multi-Surface Considerations

This application is designed to work across multiple devices (desktop, tablet, mobile). We have utilized basic CSS for responsive design.

- **CSS Media Queries:** Adjusts layout based on screen size.
- **React Components:** The components are designed to be responsive by default.
- **Flexbox/Grid:** Used for flexible layouts.

## Future Enhancements

- **Add Authentication:** Implement user login and authentication.
- **Advanced Product Management:** Include features like updating and deleting products.
- **Deploy the App:** Deploy both backend and frontend to cloud platforms like Heroku, AWS, or Netlify.
- **React Native Support:** Adapt the React components for use in a React Native mobile app.

## License

This project is open-source and available under the [MIT License](LICENSE).  

### How to Use
1. Replace the `git clone` URL with your own repository URL.
2. Replace MySQL database credentials with your setup.
3. Add more information specific to your implementation (e.g., deployment instructions) if needed.

This README serves as a guide for setting up and running the project, and provides context on how the system works, making it easy for collaborators or users to contribute or deploy the application.
