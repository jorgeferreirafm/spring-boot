#!/bin/bash

THIS_DOCKER_CONTAINER_IP=$(hostname -i|cut -f 1 -d " ")

java -jar /app/${APP_WAR} --spring.profiles.active=${ACTIVE_PROFILE} --internal.server.address=${THIS_DOCKER_CONTAINER_IP} --server.address=0.0.0.0
