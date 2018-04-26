#!/usr/bin/env bash
mvn clean package
docker rm -f app
docker build --rm -t satisfy .
docker run --rm --name app --network satisfy-network -p 8080:8080  -it -d satisfy