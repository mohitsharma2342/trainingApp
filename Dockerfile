FROM openjdk:8
EXPOSE 8090


ARG JAR_FILE=target/registration-0.0.1-SNAPSHOT.jar

# cd /opt/app
WORKDIR /opt/docker

# cp target/spring-boot-web.jar /opt/app/app.jar
COPY ${JAR_FILE} registration-0.0.1-SNAPSHOT.jar




ENTRYPOINT ["java","-jar","/registration-0.0.1-SNAPSHOT.jar.jar"]
