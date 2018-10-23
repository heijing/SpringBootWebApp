FROM frolvlad/alpine-oraclejdk8:slim
MAINTAINER Danyang Li <danyang.li@mmodal.com>
VOLUME /tmp

EXPOSE 8080

# The application goes here, this is the working directory
RUN mkdir /SpringBootJQueryAjaxClient
RUN chmod 750 /SpringBootJQueryAjaxClient
WORKDIR /SpringBootJQueryAjaxClient

# Folder in which the spring boot configuration can be overriden
RUN mkdir /SpringBootJQueryAjaxClient/config
VOLUME "/SpringBootJQueryAjaxClient/config"

RUN mkdir /SpringBootJQueryAjaxClient/src
VOLUME "/SpringBootJQueryAjaxClient/src"

RUN mkdir /SpringBootJQueryAjaxClient/src/main
VOLUME "/SpringBootJQueryAjaxClient/src/main"

RUN mkdir /SpringBootJQueryAjaxClient/src/main/resources
VOLUME "/SpringBootJQueryAjaxClient/src/main/resources"

# Allows outside access to the logs, e.g. for Kibana integration
RUN mkdir /SpringBootJQueryAjaxClient/logs
VOLUME "/SpringBootJQueryAjaxClient/logs"

# Install Spring Boot artifact
ADD ./target/SpringBootJQueryAjaxClient*.jar /SpringBootJQueryAjaxClient/SpringBootJQueryAjaxClient.jar
RUN sh -c 'touch /SpringBootJQueryAjaxClient/SpringBootJQueryAjaxClient.jar'

ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /SpringBootJQueryAjaxClient/SpringBootJQueryAjaxClient.jar" ]
