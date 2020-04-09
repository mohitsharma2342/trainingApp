FROM openjdk:8
EXPOSE 8090
ADD target/registration-0.0.1-SNAPSHOT.jar registration-0.0.1-SNAPSHOT.jar.jar
ENTRYPOINT ["java","-jar","/registration-0.0.1-SNAPSHOT.jar.jar"]
