# BOOTH ARTIST MANAGEMENT SYSTEM API

### Techstack:
* Java
* OpenJDK 17
* Maven
* Spring Boot
* Spring Data JPA (Native Query)
* PostgreSQL

### Database
* Artist
* Customer
* Item Type
* Item Category
* Merchandise
* Shipment
* Transaction
* Payment

### API
* Artist Management System [CREATE, READ, UPDATE, DELETE]
* Customer Management System [CREATE, READ, UPDATE, DELETE]
* Merchandise Management System [CREATE, READ, UPDATE, DELETE]
* Shipment Management System [CREATE, READ, UPDATE, DELETE]
* Transaction Order System [CREATE, READ]

### Installation
You need to convert to jar file using
```bash
   git clone
   cd booth-art
   mvn clean package
```
You can run directly with
```bash
   java -jar /target/booth-art-0.0.1-SNAPSHOT.jar
```
or You can build to docker with
```bash
   docker compose build
```
then, run it with
```bash
   docker compose up
```
If want to run in background
```bash
   docker compose up -d
```