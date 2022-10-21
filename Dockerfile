FROM maven:3.6.3
WORKDIR /usr/src/app
COPY . /usr/src/app
# Compile and package the application to an executable JAR
RUN mvn install -DskipTests

# For Java 11,
FROM adoptopenjdk/openjdk11:alpine-jre

ARG JAR_FILE=achat-1.0.jar
WORKDIR /opt/app
COPY --from= /usr/src/app/target/${JAR_FILE} /opt/app/
ENTRYPOINT ["java","-jar","achat-1.0.jar"]