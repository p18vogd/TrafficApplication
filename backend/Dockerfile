FROM openjdk:17-jdk-alpine

# Set the working directory to /app
WORKDIR /app

# Copy the JAR file into the container at /app
COPY target/backend-0.0.1-SNAPSHOT.jar app.jar

# Specify the command to run on container start
ENTRYPOINT ["java", "-jar", "app.jar"]
