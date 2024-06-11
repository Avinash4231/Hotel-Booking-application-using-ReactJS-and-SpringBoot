# Hotel Booking Application
### Overview
This project is a Hotel Booking Application developed using ReactJS for the front-end and Spring Boot for the back-end. The application provides two roles: Admin and User. Each role has specific functionalities as described below.

### Demo
https://github.com/Avinash4231/Hotel-Booking-application-using-ReactJS-and-SpringBoot/assets/119235391/ea5f7f74-b19b-4dcd-9b83-80fd74755611

## Features
### Admin Role
#### Admins have the following permissions:
```
View all bookings
Cancel any booking
Add new rooms
Update room details
Delete rooms
```
### User Role
#### Users have the following permissions:
```
Book a room
View their bookings
```
### Technologies Used
Front-end: ReactJS, Redux, Axios
Back-end: Spring Boot, Spring Security, JPA, Hibernate
Database: MySQL

### Installation
###### Prerequisites - Ensure you have the following installed:
Node.js
npm or yarn
Java (JDK 11 or above)
MySQL

#### Front-end Setup
##### Navigate to the frontend directory:
```
cd frontend/Hotel-booking-application
```
##### Install the dependencies:
```
npm install
```
##### Start the development server:
```
npm start
```

### Back-end Setup
##### Navigate to the backend directory:
```
cd backend/HotelBookingApplication
```

##### Configure the database connection in src/main/resources/application.properties:
```
spring.datasource.url=jdbc:mysql://localhost:3306/hotel_booking
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

##### Build the project:
```
./mvnw clean install
```
##### Run the Spring Boot application:
```
./mvnw spring-boot:run
``` 
### Usage
Register as a user or log in if you already have an account.
Admins can access the admin dashboard to manage rooms and bookings.
Users can browse available rooms and make bookings.

### API Endpoints
##### Admin Endpoints
GET /api/admin/bookings - View all bookings
DELETE /api/admin/bookings/{bookingId} - Cancel a booking
POST /api/admin/rooms - Add a new room
PUT /api/admin/rooms/{roomId} - Update room details
DELETE /api/admin/rooms/{roomId} - Delete a room
##### User Endpoints
POST /api/user/bookings - Book a room
GET /api/user/bookings - View user bookings
