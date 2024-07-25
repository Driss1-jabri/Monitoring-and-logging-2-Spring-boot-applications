FROM openjdk:17-alpine
COPY target/App2-0.0.1-SNAPSHOT.jar /App2-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-Dspring.profiles.active=k8s", "-jar", "/App2-0.0.1-SNAPSHOT.jar"]
