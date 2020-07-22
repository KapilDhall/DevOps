FROM tomcat:8.0

EXPOSE 9292

ARG JAR_FILE=/target/*.war

COPY ${JAR_FILE} /usr/local/tomcat/webapps/javaapp.war

MAINTAINER "dhall.kapil@gmail.com"

CMD ["catalina.sh","run"]