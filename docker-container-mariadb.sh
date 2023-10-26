#!/bin/bash

# Set your desired username and password
DB_USER="admin"
DB_PASS="admin"

# Run the MariaDB container with the specified credentials
sudo docker run -d --name my-mariadb-container -e MYSQL_ROOT_PASSWORD=my-secret-pw -p 3306:3306 mariadb

echo "MariaDB container is running with username: $DB_USER and password: $DB_PASS"
