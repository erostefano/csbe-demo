#!/bin/bash

# username is root
sudo docker run --name mariadb -e MYSQL_ROOT_PASSWORD=mypass -p 3306:3306 -d docker.io/library/mariadb:10.3
