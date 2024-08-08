Creating a Quiz Microservice Architecture Application involves dividing the application into two main services: Quiz Service and Question Service. These services communicate with each other using Eureka Server and Client and are registered with an API Gateway for efficient load distribution across multiple instances. Here's a detailed overview:

Microservice Architecture
Quiz Service: This service is responsible for managing quizzes, including creating, updating, and retrieving quiz information. It acts as the central service that coordinates with the Question Service to fetch questions for each quiz.

Question Service: This service handles the management of questions, including adding, updating, and retrieving questions. It provides APIs that the Quiz Service can call to fetch questions needed for quizzes.

Communication and Discovery
Eureka Server: Acts as a service registry where both the Quiz Service and Question Service register themselves. This enables dynamic discovery of services, allowing them to communicate without hardcoding the locations of other services.

Eureka Client: Both the Quiz Service and Question Service are configured as Eureka Clients. They register with the Eureka Server and discover other services through it.

API Gateway
API Gateway: The API Gateway serves as an entry point for clients. It routes requests to the appropriate service instances, ensuring load balancing and failover. This setup distributes the load efficiently across multiple instances of each service, enhancing scalability and reliability.
