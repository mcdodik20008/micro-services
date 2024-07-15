FROM openjdk:17-jdk-slim

LABEL Description="Производим похлебки из кролей"

WORKDIR /app

COPY target/stew*.jar stew.jar

EXPOSE 8080
ENTRYPOINT exec java -jar stew.jar
