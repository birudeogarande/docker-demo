FROM openjdk:17

WORKDIR /myapp

COPY ./target/application.jar /myapp

COPY entrypoint.sh /myapp/entrypoint.sh

RUN chmod +x /myapp/entrypoint.sh

ENTRYPOINT ["/bin/bash","/myapp/entrypoint.sh"]

EXPOSE 8080

CMD ["java", "-jar","application.jar"]