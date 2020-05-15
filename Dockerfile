FROM openjdk:8-jdk-alpine
VOLUME /tmp
WORKDIR /usr/src/app/
COPY target/*.jar /usr/src/app/
RUN sh -c 'touch /usr/src/app/ProductsApplications-0.0.1-SNAPSHOT.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Xmx200m", "-jar", "/usr/src/app/ProductsApplications-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080