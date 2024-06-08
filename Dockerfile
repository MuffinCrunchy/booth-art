# base image / parent image
FROM openjdk:17-alpine

WORKDIR /app

COPY /target/booth-art-0.0.1-SNAPSHOT.jar /app/boothart.jar
COPY .env /app/.env
EXPOSE 8080
CMD ["java", "-jar", "boothart.jar"]
