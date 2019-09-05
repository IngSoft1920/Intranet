FROM openjdk:8-jdk-alpine
WORKDIR /home
ARG JAR_FILE
ARG PORT
VOLUME /tmp
COPY ${JAR_FILE} /home/app.jar
EXPOSE ${PORT}
ENTRYPOINT ["java","-jar","/home/app.jar","&"]