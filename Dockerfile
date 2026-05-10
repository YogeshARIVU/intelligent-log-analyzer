FROM eclipse-temurin:25

WORKDIR /app

COPY target/intelligent-log-analyzer-1.0.0.jar app.jar

EXPOSE 7070

ENTRYPOINT ["java", "-jar", "app.jar"]