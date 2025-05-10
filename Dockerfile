# Pull a base image which gives you all required tools & Libraries
FROM openjdk:17-jdk-alpine

# Create a folder where the  app code will be stored
WORKDIR /app

# Copy the source code from your HOST to your container
COPY src/Main.java /app/Main.java

# Compile the application code
RUN javac Main.java

# Run the application
CMD ["java","Main"]
