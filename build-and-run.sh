#!/bin/bash
LABEL=$(date +'%Y%m%d-%H%M%S')
mvn clean package && docker build -t cl.ulagos/electivojee:$LABEL .
docker rm -f electivojee || true && docker run -it -p 8080:8080 -p 4848:4848 --name electivojee cl.ulagos/electivojee:$LABEL

