
# Usar una imagen base de JDK para ejecutar Spring Boot
FROM openjdk:17-jdk-alpine

# Copiar el archivo JAR generado
COPY target/api-gateway-0.0.1-SNAPSHOT.jar api-gateway.jar

# Exponer el puerto configurado
EXPOSE 8765

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "/api-gateway.jar"]
