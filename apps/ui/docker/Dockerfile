FROM frolvlad/alpine-oraclejdk8
EXPOSE ${PRJ_PORT:-8080}
ADD ui.jar .
CMD java -jar -Dprovider.url=${SERVICE_NAME} \
              -Dprovider.port=${SERVICE_PORT} \
              -Dserver.port=${PRJ_PORT} \
               ui.jar
              
