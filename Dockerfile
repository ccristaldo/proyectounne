# Usa una imagen base de Java (por ejemplo, OpenJDK 17)
FROM openjdk:21

# Establece el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copia el archivo JAR de la aplicación al directorio de trabajo
# Asegúrate de que 'build/libs/tu-aplicacion.jar' es la ruta correcta a tu JAR
COPY target/demo-0.0.1-SNAPSHOT.jar /app/demo-0.0.1-SNAPSHOT.jar

# Expone el puerto en el que la aplicación escucha (por ejemplo, 8080)
EXPOSE 8080

# Define el comando para ejecutar la aplicación cuando el contenedor inicie
ENTRYPOINT ["java", "-jar", "/app/demo-0.0.1-SNAPSHOT.jar"]