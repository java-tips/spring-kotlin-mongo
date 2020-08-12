FROM gradle:6.6.0-jre14

ADD src src
ADD build.gradle.kts .
ADD settings.gradle.kts .

RUN gradle build

FROM openjdk:14-jdk-alpine

COPY --from=0 /home/gradle/build/libs/kotlin-1.0.jar kotlin.jar

EXPOSE 8080

ENTRYPOINT exec java $JAVA_OPTS -jar /kotlin.jar