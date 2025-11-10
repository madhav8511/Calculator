# Stage 1: Run the application
#FROM openjdk:17-jdk-slim
FROM eclipse-temurin:17-jdk-alpine

#Set Working directory
WORKDIR /app

# Copy the JAR from target/ (relative to build context)
COPY target/*.jar app.jar

# Make entry point
ENTRYPOINT ["java", "-jar", "app.jar"]
