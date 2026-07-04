FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY target/project-0.0.1-SNAPSHOT.jar project-0.0.1-SNAPSHOT.jar
EXPOSE 9999
CMD ["java", "-jar", "project-0.0.1-SNAPSHOT.jar"]