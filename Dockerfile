FROM openjdk:8
EXPOSE 8090
ADD target/registration-0.0.1-SNAPSHOT.jar docker-jenkins-registration-sample.jar
ENTRYPOINT ["java","-jar","/docker-jenkins-registration-sample.jar"]
