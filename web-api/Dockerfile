FROM openjdk:17-jdk-slim

LABEL Description="Апи для чила"

WORKDIR /app

COPY target/web-api*.jar web-api.jar

EXPOSE 8080
ENTRYPOINT exec java -jar web-api.jar
