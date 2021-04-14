FROM maven:3.6.1-jdk-8-alpine AS MAVEN_BUILD
COPY ./ ./
RUN mvn clean package

FROM openjdk:8-jre-alpine3.9
CMD ["java", "-jar", "/DevOps-1.jar"]