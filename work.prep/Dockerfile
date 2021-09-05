FROM maven:3.6.3-openjdk-11
ADD target/workprep.jar workprep.jar
COPY ./pom.xml ./pom.xml
COPY ./src ./src
ENTRYPOINT ["mvn", "spring-boot:run"]