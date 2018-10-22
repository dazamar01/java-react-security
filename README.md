# java-react-security
Implementation of a Java-backend with rest services in roder to serve a React App

#1. Hit the services

## issues a GET request to retrieve tasks with no JWT
## HTTP 403 Forbidden status is expected
curl http://localhost:8080/tasks

### registers a new user
curl -H "Content-Type: application/json" -X POST -d '{
    "username": "admin",
    "password": "password"
}' http://localhost:8080/users/sign-up

## logs into the application (JWT is generated)
curl -i -H "Content-Type: application/json" -X POST -d '{
    "username": "admin",
    "password": "password"
}' http://localhost:8080/login

### ** the response
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


## issue a GET request, passing the JWT, to hit the method with auth

curl -X GET -H "Content-Type: application/json"  -H "Authorization: Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInNjb3BlcyI6IlJPTEVfQURNSU5JU1RSQURPUiIsImV4cCI6MTUzOTkxNzk4NH0.cwP345K2CGVSGTYtEEOqsEIhNA7HG4IWibBUQx0mkiKmAd5QuzKRecmUD3GLK15V969DgIAfP5zjt6071s9JDg" http://localhost:8080/tasks/onlyadmin


Expected response:

ONLY ADMIN ALLOWED