FROM eclipse-temurin:17-jdk-alpine
EXPOSE 8081
ADD target/jenkinspipeline.jar jenkinspipeline.jar
ENTRYPOINT ["java","-jar","/jenkinspipeline.jar"]