#!/bin/bash

# Start Kafka Tool
./kafkatool.sh &
# Wait for 5 seconds to allow Kafka Tool to initialize
sleep 5
# Open browser (assuming xdg-open works in your Docker environment)
xdg-open http://localhost:9000
# Keep the container running (useful for Docker)
tail -f /dev/null
