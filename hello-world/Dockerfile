FROM openjdk:8-alpine


ARG APPLICATION_DIR=/opt/software/hello-world
ARG JAR_FILE
ADD jar/${JAR_FILE} ${APPLICATION_DIR}/${JAR_FILE}

RUN mkdir -p ${APPLICATION_DIR}
WORKDIR ${APPLICATION_DIR}
EXPOSE 8010

# TODO add unix constraints on user ownership
# TODO find a better to identify the jar
ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -Duser.timezone=UTC -jar *.jar