# Stage-1 : Building project with maven
FROM maven:3.6.3-openjdk-17 AS build

#Set Working directory
WORKDIR /app

#Copy pom.xml file
COPY pom.xml .

#Download the dependency first for faster build
RUN mvn dependency:go-offline

# Copy source code
COPY src ./src

# Build the project (skip tests)
RUN mvn clean package -DskipTests

# Stage 2: Run the application
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the jar file from the build stage
COPY --from=build /app/target/*.jar app.jar

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]