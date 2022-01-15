FROM maven:3-openjdk-11-slim as container-builder

RUN mkdir /opt/app/
ADD ./ /opt/app
WORKDIR /opt/app

RUN mvn clean package -DskipTests

FROM adoptopenjdk/openjdk11:jdk-11.0.11_9-alpine-slim

COPY --from=container-builder /opt/app/target/*-task.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","/app.jar"]