FROM openjdk:8
EXPOSE 8090


ARG JAR_FILE= target/training-app.jar

# cd /opt/app
WORKDIR /opt/docker

# cp target/spring-boot-web.jar /opt/app/app.jar
COPY ${JAR_FILE} training-app.jar




ENTRYPOINT ["java","-jar","/training-app.jar"]
