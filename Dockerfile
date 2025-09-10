FROM openjdk:21
COPY ./out/production/proyectounne/ /app
WORKDIR /app
ENTRYPOINT ["java","DemoApplication"]
