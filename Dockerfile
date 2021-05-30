FROM openjdk:8
EXPOSE 8080
ADD target/sb-jenkins-docker.jar sb-jenkins-docker.jar
ENTRYPOINT ["java","-jar","/sb-jenkins-docker.jar"]