FROM openjdk:17-alpine
COPY target/App1-0.0.1-SNAPSHOT.jar /App1-0.0.1-SNAPSHOT.jar
COPY elastic-apm-agent-1.36.0.jar /elastic-apm-agent.jar
EXPOSE 8081
ENTRYPOINT ["java", "-javaagent:/elastic-apm-agent.jar", "-jar", "/App1-0.0.1-SNAPSHOT.jar"]
