# spring-kotlin-mongo
 \
This is a Kotlin application with spring-boot and MongoDB. \
Kotlin in the backend provides less code and is easy to build. \
You can take a look on official documentation on https://kotlinlang.org/docs/reference/server-overview.html \
It is very easy to use that. Below I'll show you how you can build your application. \
\
\
Build and Start: \
`./gradlew clean` \
`./gradlew build` \
`./gradlew bootRun` \
_In this way **you need** to start and Mongodb instance as well._
\
\
With Docker Compose, Build and Start: \
``docker-compose up --build `` \
_In this way **you don't need** to start and Mongodb instance._
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