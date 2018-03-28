FROM frolvlad/alpine-oraclejdk8
EXPOSE ${PRJ_PORT:-8080}
ADD backend.jar .
CMD java -jar -Dspring.datasource.url=jdbc:mysql://${DB_IP}:${DB_PORT}/${DB_NAME} \
              -Dspring.datasource.username=${DB_USERNAME} \
              -Dspring.datasource.password=${DB_PASSWORD} \
              -Dserver.port=${PRJ_PORT} \
               backend.jar
              
