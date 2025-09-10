FROM openjdk:21
COPY /home/carlos/Repos/UNNE/demo/src/main/java/com/app/demo/DemoApplication.java /app
WORKDIR /app
ENTRYPOINT ["java","DemoApplication"]
