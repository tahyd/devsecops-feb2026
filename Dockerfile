FROM eclipse-temurin:21-jdk-jammy
COPY ./target/ems.jar ems.jar
EXPOSE 9090
ENTRYPOINT ["java","-jar","ems.jar"]