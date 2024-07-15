#!/bin/bash

cd ./kafka-ui

docker build -t kafka-ui .
docker run -d kafka-ui
