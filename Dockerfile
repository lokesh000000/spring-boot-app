# 
FROM eclipse-temurin:17


LABEL maintainer="lokesh@gmail.com"

WORKDIR /app


COPY target/Spring-Docker-0.0.1-SNAPSHOT.jar /app/springboot-docker.jar


ENTRYPOINT ["java", "-jar", "springboot-docker.jar"]
