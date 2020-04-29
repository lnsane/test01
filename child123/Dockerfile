FROM adoptopenjdk/openjdk8-openj9
VOLUME /tmp
ADD demo.jar HelloWorld.jar
RUN bash -c 'touch /HelloWorld.jar'
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","HelloWorld.jar"]


