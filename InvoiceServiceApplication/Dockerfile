# Use an official OpenJDK runtime as a base image
FROM openjdk:17

# Set the working directory inside the container
WORKDIR /app

# Copy the source files to the container
COPY src /app/src

# Compile the Java application
RUN javac /app/src/main/java/com/scalableservices/assignement/invoice/InvoiceServiceApplication.java

# Specify the entry point for the container
CMD ["java", "-cp", "/app/src/main/java", "com.scalableservices.assignement.invoice.InvoiceServiceApplication"]
