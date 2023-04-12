FROM maven:3.9-eclipse-temurin-11 as build

WORKDIR /app

COPY pom.xml .

COPY src/ src/

RUN mvn -f pom.xml clean package

CMD ["java", "-jar", "target/ada-1.0-SNAPSHOT.jar"]