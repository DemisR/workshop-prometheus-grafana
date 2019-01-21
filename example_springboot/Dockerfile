FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY ./spring-boot-management-example-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]