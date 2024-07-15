# Use a base image with Ubuntu
FROM ubuntu:latest

# Install necessary packages
RUN apt-get update && apt-get install -y \
    openjdk-8-jre-headless \
    wget \
    && rm -rf /var/lib/apt/lists/*

# Download Kafka Tool script using curl
RUN curl -o /tmp/kafkatool.sh https://www.kafkatool.com/download2/kafkatool.sh && \
    chmod +x /tmp/kafkatool.sh

# Execute Kafka Tool installation quietly
RUN /tmp/kafkatool.sh -q

# Clean up downloaded script
RUN rm /tmp/kafkatool.sh

# Copy start script
COPY start.sh /start.sh
RUN chmod +x /start.sh

# Expose port
EXPOSE 9000

# Start Kafka Tool on container startup
ENTRYPOINT ["/start.sh"]
