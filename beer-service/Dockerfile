FROM openjdk:17-jdk-slim

LABEL Description="Магазин пива"

WORKDIR /app

COPY target/beer-service*.jar beer.jar

EXPOSE 8081
ENTRYPOINT exec java -jar beer.jar
