FROM eclipse-temurin:17
COPY target/linux.jar linux.jar
CMD [ "java","-jar","linux.jar" ]