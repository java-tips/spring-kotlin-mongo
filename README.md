# spring-kotlin-mongo
[![CircleCI](https://circleci.com/gh/java-tips/spring-kotlin-mongo/tree/master.svg?style=svg)](https://circleci.com/gh/java-tips/spring-kotlin-mongo/tree/master) 
[![CircleCI](https://circleci.com/gh/java-tips/spring-kotlin-mongo/tree/master.svg?style=shield)](https://circleci.com/gh/java-tips/spring-kotlin-mongo/tree/master)
[![deepcode](https://www.deepcode.ai/api/gh/badge?key=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJwbGF0Zm9ybTEiOiJnaCIsIm93bmVyMSI6ImphdmEtdGlwcyIsInJlcG8xIjoic3ByaW5nLWtvdGxpbi1tb25nbyIsImluY2x1ZGVMaW50IjpmYWxzZSwiYXV0aG9ySWQiOjIzNDM4LCJpYXQiOjE2MDE2NDI0NTl9.PIRggL0XT093JBBcowceF8Q93oxOPmkMS-rb6-Z-j-s)](https://www.deepcode.ai/app/gh/java-tips/spring-kotlin-mongo/_/dashboard?utm_content=gh%2Fjava-tips%2Fspring-kotlin-mongo)
\
\
This is a Kotlin application with spring-boot and MongoDB. \
Kotlin in the backend provides less code and is easy to build. \
You can take a look at the official documentation https://kotlinlang.org/docs/reference/server-overview.html \
It is very easy to use that. Below I'll show you how you can build the application. \
\
\
Build and Start: \
`./gradlew clean` \
`./gradlew build` \
`./gradlew bootRun` \
_In this way **you need** to start a Mongodb instance as well._
\
\
With Docker Compose, Build and Start: \
``docker-compose up --build `` \
_In this way **you don't need** to start a Mongodb instance._
\
Open the browser: \
``http://localhost:8080/v1/ping`` \
\
Routes: \
``GET  http://localhost:8080/v1/ping`` \
``GET  http://localhost:8080/v1/order`` \
``POST http://localhost:8080/v1/order`` \
``GET  http://localhost:8080/v1/order/{status}`` \
\
*You can change everything if you will. \
\
Enjoy it :D 
