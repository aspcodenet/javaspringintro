#!/bin/bash
IMAGE_URI="stefanholmberg/javademoimage:latest" # Change to your image name

# Stop and remove the old container if it exists
if [ $(docker ps -a -q -f name=my-app-container) ]; then
  docker stop my-app-container
  docker rm my-app-container
fi

# Pull the new Docker image
docker pull $IMAGE_URI

# Run the new container, mapping the ports
docker run -d --name my-app-container -p 80:8080 $IMAGE_URI
