
# E-commerce Product Management

This is a full-stack e-commerce product management system consisting of a frontend built using **React.js** and a backend powered by **Spring Boot**. The application allows users to manage products, categories, and orders with CRUD (Create, Read, Update, Delete) functionalities.

## Table of Contents

- [Features](#features)
- [Technologies Used](#technologies-used)
- [Setup Instructions](#setup-instructions)
  - [Backend Setup](#backend-setup)
  - [Frontend Setup](#frontend-setup)
- [Project Structure](#project-structure)
- [API Endpoints](#api-endpoints)
- [Images](#image)


## Features

- **Product Management**: Admins have full control over product inventory. They can easily add new products, update existing product details, delete products from the system, and view a comprehensive list of all available products. Product data includes categories, descriptions, pricing, and availability. This allows for seamless management and scalability of product listings.

- **Category Management**: Admins can efficiently organize products into categories. This feature simplifies browsing by grouping similar products together, making it easier for users to find exactly what they need. Categories can be created, renamed, or deleted as per the requirements of the business.

- **Add to Cart Functionality**: Users can add products to their shopping cart with a single click. The system dynamically updates the cart, allowing users to see the total cost and quantity of items added in real-time. This smooth process improves the overall user experience, enhancing the shopping process and facilitating easy checkouts.

- **Product Search**: Users can quickly search for products using a search bar, which provides real-time suggestions as they type. This intuitive search feature helps users find their desired products instantly, whether by name, category, or keyword. It also allows filtering based on price, ratings, and relevance.



## Technologies Used

### Frontend
- **React.js**: A JavaScript library for building user interfaces.
- **HTML5**: Markup language for structuring content.
- **CSS3**: Stylesheet language for designing the UI.
- **Axios**: For making HTTP requests from the frontend.
  
### Backend
- **Spring Boot**: Java-based framework for building the backend REST API.
- **Spring Security**: For user authentication and authorization.
- **MySQL**: Database used to store user, product, and order information.
- **JPA (Hibernate)**: For ORM (Object Relational Mapping) with the database.
- **Maven**: For managing dependencies in the backend.

## Setup Instructions

### Backend Setup

1. **Clone the backend repository:**
   ```bash
   git clone https://github.com/prithvirajbaral/ecommerce-product-management.git
   cd ecommerce-product-management/backEnd/ecom-proj
2. **Configure the MySQL database:**
- Create a database in MySQL named `ecommerce_db`.
- Update the `src/main/resources/application`.properties file with your database username and password.
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce_db
    spring.datasource.username=YOUR_USERNAME
    spring.datasource.password=YOUR_PASSWORD
3. **Build the project:**
    ```bash
    mvn clean install
4. **Run the application:**
    ```bash
    mvn spring-boot:run
The backend API will be accessible at `http://localhost:8080`.

### Frontend Setup

1. **Clone the frontend repository:**
    ```bash
    cd ecommerce-product-management/frontEnd/ecom-frontend-5
2. **Install the dependencies:**
    ```bash
    npm install
3. **Start the development server:**
    ```bash
    npm start
The frontend will be accessible at `http://localhost:3000`.

### Project Structure

    ```bash
    ecommerce-product-management/
    │
    ├── frontEnd/
    │   └── ecom-frontend-5/
    │       ├── public/
    │       ├── src/
    │       ├── package.json
    │       └── ...
    │
    └── backEnd/
        └── ecom-proj/
            ├── src/
            ├── pom.xml
            └── ...

## API Endpoints

### Products
- GET `/api/products:` Retrieve a list of all products.
- POST `/api/products:` Create a new product (Admin only).
- PUT `/api/products/{id}:` Update an existing product (Admin only).
- DELETE `/api/products/{id}:` Delete a product (Admin only).

## Images

![07 09 2024_11 15 24_REC](https://github.com/user-attachments/assets/f21e3670-5267-4aa1-8c85-9859fa7ea198)
![07 09 2024_11 19 22_REC](https://github.com/user-attachments/assets/3e77af08-bdbf-4b0a-80b5-6c94cd15d3dd)
