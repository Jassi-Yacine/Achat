FROM openjdk:8
ADD target/achat-1.0.jar
ENTRYPOINT ["java","-jar","achat-1.0.jar"]
