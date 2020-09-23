# spring-boot-kafka

Simple example of a Spring Boot application using Kafka

## Testing the endpoint

`curl -d '{"message":"Hello from Kafka!}' -H "Content-Type: application/json" -X POST http://localhost:8081/kafka/publish`