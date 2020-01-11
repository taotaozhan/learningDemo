FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD mybatisplusdemo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-Djava.security.egd =file:/dev/./urandom","-jar","/app.jar"]
