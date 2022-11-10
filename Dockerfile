FROM eclipse-temurin:17

ADD . /springboot/src/github.com/Scalingo/sample-java-springboot

WORKDIR /springboot/src/github.com/Scalingo/sample-java-springboot

EXPOSE 8080

CMD ["./gradlew", "bootRun"]
