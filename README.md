# 📨 Message Logger (Spring Boot + MongoDB + Docker)

Submit short messages via a web interface and view them styled in a responsive card layout.


## 🛠️ Tech Stack

- Java (Spring Boot)
- MongoDB (NoSQL database)
- Docker & Docker Compose
- HTML/CSS/JavaScript frontend

## 🌟 Features

- Submit messages via a web form
- View all messages
- Messages stored in MongoDB

## 🚀 Quick Start (Using Docker Compose)

### 🔧 Requirements

- [Docker](https://www.docker.com/products/docker-desktop)
- [Docker Compose](https://docs.docker.com/compose/)

### 1. Clone the repository

```bash
git clone https://github.com/haingo-raz/message-logger.git
cd message-logger
```

### 2. Package the Spring Boot app
```bash
./mvnw clean package
```
This generates a JAR file in the `target/` folder.

### 3. Start the app and MongoDB
```bash
docker-compose up --build
```
This starts two containers:
- `message-app` – Spring Boot app
- `mongodb` – MongoDB instance

### 4. Use the app
Access the app at [http://localhost:8080](http://localhost:8080)