FROM openjdk:8-jdk-alpine
ADD target/Achat-main.jar Achat-main.jar
ENTRYPOINT ["java","-jar","Achat-main.jar"]