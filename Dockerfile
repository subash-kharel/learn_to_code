FROM openjdk:11.0.8
ADD target/learn_to_code.jar learn_to_code.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "learn_to_code.jar"]