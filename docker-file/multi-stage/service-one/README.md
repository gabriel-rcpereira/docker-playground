# Multi-stage Docker feature

Consists in aggregate many steps, usually, to build and create
a self-content image.
This example shows how to build a java application image built 
with Spring Boot and Maven.

## Steps

- The first part of the process pulls a Maven image, copy the application files
into it and run the create package command;

- The last step set an OpenJDK image, copy the artifact built from the Container 
Builder(Maven container alias) and set the entrypoint to initialize the jar when 
container starts.

## Create the image

`docker build -t hello-app .`

## Create and run the container

`docker run -p 8080:8080 --name hello-app-container hello-app`

## Test it :rocket:

`curl http://localhost:8080/api/v1/hello`