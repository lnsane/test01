FROM java:8
MAINTAINER Kate Smith <ksmith@example.com>
VOLUME /tmp
ADD target/child1234-0.0.1-SNAPSHOT.jar HelloWorld.jar
RUN bash -c 'touch /HelloWorld.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","HelloWorld.jar"]
EXPOSE 8080


