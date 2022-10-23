FROM openjdk:8
ADD target/Achat-main.jar Achat-main.jar
ENTRYPOINT ["java","-jar","Achat-main.jar"]