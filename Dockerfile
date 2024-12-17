FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/CRM_Registro_Interaccion-0.0.1.jar
COPY ${JAR_FILE} app_registro.jar
EXPOSE 8090
ENTRYPOINT [ "java", "-jar", "app_registro.jar" ]