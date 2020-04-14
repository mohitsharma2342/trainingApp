FROM openjdk:8
EXPOSE 8090



ADD target/training-app.jar training-app.jar

# cd /opt/app
# WORKDIR /opt/docker


ENTRYPOINT ["java","-jar","training-app.jar"]
