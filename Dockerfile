FROM eclipse-temurin:25

WORKDIR /app

COPY . .

RUN ./mvnw clean package -DskipTests

EXPOSE 7070

CMD ["java", "-jar", "target/intelligent-log-analyzer-1.0.0.jar"]