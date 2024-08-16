# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the generated JAR file to the container
COPY target/app-0.0.1-SNAPSHOT.jar /app/app.jar

# Expose the port your application runs on (change this if your app uses a different port)
EXPOSE 8080

# Command to run the JAR file
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
