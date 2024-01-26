FROM openjdk:17
EXPOSE 8081

COPY /target/park-service.jar park-service.jar
ENTRYPOINT ["java", "-jar", "/park-service.jar"]