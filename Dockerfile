FROM centos
LABEL version="1.0" maintainer="weiguofu 15173126889@163.com"
ADD target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]