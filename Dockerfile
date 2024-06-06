FROM openjdk:17-alpine
COPY target/bank-eureka-server-ms-0.0.1-SNAPSHOT.jar bank-eureka-server-ms-0.0.1-SNAPSHOT.jar
EXPOSE 8761
ENTRYPOINT ["java","-jar","bank-eureka-server-ms-0.0.1-SNAPSHOT.jar"]
