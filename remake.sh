#!/bin/bash

docker-compose down

cd ./beer-service
mvn clean package
cd ../

cd ./eurika
mvn clean package
cd ../

cd ./rabbit-service
mvn clean package
cd ../

cd ./stew-service
mvn clean package
cd ../

cd ./web-api
mvn clean package
cd ../

docker-compose up --build -d
