FROM frolvlad/alpine-oraclejdk8
EXPOSE ${PRJ_PORT:-8080}
ADD demo.jar .
CMD java -jar -DDeploy.version=${PRJ_VERSION} -Dserver.port=${PRJ_PORT} demo.jar
