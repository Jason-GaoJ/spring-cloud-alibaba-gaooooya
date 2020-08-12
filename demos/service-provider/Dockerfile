#指定父镜像
FROM openjdk:8u201-jdk-alpine3.9
#作者信息
MAINTAINER gaooooya
#系统编码
ENV LANG=C.UTF-8 LC_ALL=C.UTF-8
#标签
LABEL gaooooya-service=<jason.gao1955@gmail.com>
#定义外部可以挂载的数据卷
VOLUME /data/cloudgaoooya
#应用构建成功后的jar文件被复制到镜像内，名字也改成了app.jar
ADD target/service-provider-0.0.1-SNAPSHOT.jar app.jar
#启动容器时的进程
ENTRYPOINT ["java","-jar","/app.jar"]
#暴露8020端口
EXPOSE 8020