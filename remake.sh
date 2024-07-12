#!/bin/bash

# Остановить и удалить существующие контейнеры
docker-compose down

# Пересобрать образы и запустить контейнеры
docker-compose up --build -d
