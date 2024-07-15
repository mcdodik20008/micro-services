FROM openjdk:17-jdk-slim

LABEL Description="Фабрика кролей"

WORKDIR /app

COPY target/rabbit*.jar rabbit.jar

EXPOSE 8080
ENTRYPOINT exec java -jar rabbit.jar
