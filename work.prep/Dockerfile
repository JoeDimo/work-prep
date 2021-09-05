FROM maven:3.8.2-openjdk-11
ADD target/workprep.jar workprep.jar
ENTRYPOINT ["mvn", "spring-boot:run"]
#ENTRYPOINT ["java", "-jar", "workprep.jar"]