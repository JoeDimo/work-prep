FROM maven:3.8.2-openjdk-11
ADD target/workprep.jar workprep.jar
#ARG DEPENDENCY=target/dependency
#COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
#COPY ${DEPENDENCY}/META-INF /app/META-INF
#COPY ${DEPENDENCY}/BOOT-INF/classes /app
ENTRYPOINT ["java", "-jar", "workprep.jar"]