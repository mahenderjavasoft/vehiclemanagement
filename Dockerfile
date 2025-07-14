FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/car-sales-1.0.0.jar car-sales.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "car-sales.jar"]