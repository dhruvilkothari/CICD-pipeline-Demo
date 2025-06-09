# Use OpenJDK 21 as base image
FROM openjdk:21-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the container
COPY target/*.jar app.jar

# Expose port 8080 (or your Spring Boot server port)
EXPOSE 9000

# Run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]
