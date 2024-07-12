FROM openjdk:17-jdk-slim

LABEL Description="Еврика"

WORKDIR /app

COPY target/eurika*.jar eurika.jar

EXPOSE 8761
ENTRYPOINT exec java -jar eurika.jar
