FROM openjdk:8-jdk-alpine
VOLUME /tmp
RUN mkdir -p /satisfy
COPY /target/Satisfy-1.0-SNAPSHOT.jar /satisfy/app.jar
ENTRYPOINT ["java","-Xms768m","-Xmx2048m","-Djava.security.egd=file:/dev/./urandom","-jar","/satisfy/app.jar"]