# java-react-security
Implementation of a Java-backend with rest services consumed by React

1. Hit the services

# issues a GET request to retrieve tasks with no JWT
# HTTP 403 Forbidden status is expected
curl http://localhost:8080/tasks

# registers a new user
curl -H "Content-Type: application/json" -X POST -d '{
    "username": "admin",
    "password": "password"
}' http://localhost:8080/users/sign-up

# logs into the application (JWT is generated)
curl -i -H "Content-Type: application/json" -X POST -d '{
    "username": "admin",
    "password": "password"
}' http://localhost:8080/login

# Here is the response
HTTP/1.1 200 
Authorization: Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImV4cCI6MTUzOTc5NzgyOH0.QxPd9OEUDZQd5rde5JhNBinhFpfHj6iNgNESNo0P4glHnFKcl_q5teiFhqpJWlswKvjm-MJNFT4kK4dqR9AOVQ
X-Content-Type-Options: nosniff
X-XSS-Protection: 1; mode=block
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Length: 0
Date: Sun, 07 Oct 2018 17:37:09 GMT





# issue a POST request, passing the JWT, to create a task
# remember to replace xxx.yyy.zzz with the JWT retrieved above
curl -H "Content-Type: application/json" \
-H "Authorization: Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImV4cCI6MTUzOTc5NzgyOH0.QxPd9OEUDZQd5rde5JhNBinhFpfHj6iNgNESNo0P4glHnFKcl_q5teiFhqpJWlswKvjm-MJNFT4kK4dqR9AOVQ" \
-X POST -d '{
    "description": "Buy watermelon"
}'  http://localhost:8080/tasks

# issue a new GET request, passing the JWT
# remember to replace xxx.yyy.zzz with the JWT retrieved above
curl -H "Authorization: Bearer xxx.yyy.zzz" http://localhost:8080/tasks



2. The DB design was created with MySQL Workbench, you can get it from https://www.mysql.com/products/workbench/




# React
1. You need node.js installed on your system

2. Install create react app (you need to put sudo at the begining if you have linux or mac)
    npm install -g create-react-app

3. The app was created with the command below
    create-react-app react-security