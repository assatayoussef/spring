FROM openjdk:8

COPY ./target/*.jar /usr/src/myapp/
RUN chmod +x /usr/src/myapp/*.jar

ENTRYPOINT ["java", "-jar", "/usr/src/myapp/location-0.0.1-SNAPSHOT.jar
"]
