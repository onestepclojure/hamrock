FROM openjdk:8-alpine

COPY target/uberjar/hamrock.jar /hamrock/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/hamrock/app.jar"]
