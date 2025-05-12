# Use Java base image
FROM openjdk:17-jdk-alpine

# Set working dir in container
WORKDIR /app

# Copy compiled JAR into container
COPY target/message-logger-0.0.1-SNAPSHOT.jar app.jar

# Expose port
EXPOSE 8080

# Run the app
ENTRYPOINT ["java", "-jar", "app.jar"]
