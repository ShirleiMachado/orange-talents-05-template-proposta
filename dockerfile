FROM openjdk:11
MAINTAINER Shirlei Machado
ARG JAR_FILE=/target/*.jar
COPY ${JAR_FILE} proposta-app.jar
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=prod", "proposta-app.jar"]