#FROM openjdk:8
#EXPOSE 8090

# COPY target/training-app.jar /opt/docker/

#ADD target/training-app.jar training-app.jar

# cd /opt/app
# WORKDIR /opt/docker
#VOLUME /opt/docker/

#ENTRYPOINT ["java","-jar","training-app.jar"]


FROM openjdk:8
EXPOSE 8090
ADD /demo/target/training-app.jar training-app.jar
ENTRYPOINT ["java","-jar","/training-app.jar"]
