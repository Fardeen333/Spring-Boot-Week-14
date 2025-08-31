FROM snyk/snyk:maven-3-jdk-24-preview

WORKDIR /app

COPY ./target/product-service-0.0.1-SNAPSHOT.jar .

EXPOSE 8080

CMD ["java", "-jar", "product-service-0.0.1-SNAPSHOT.jar"]