FROM maven:3.9.2-eclipse-temurin-11 AS builder
WORKDIR /app
ADD . /app/
RUN mvn clean install

FROM eclipse-temurin:11 
COPY --from=builder /app/target/sample_proj-0.0.1-SNAPSHOT.jar /app/jar/sample_proj-0.0.1-SNAPSHOT.jar
COPY --from=builder /app/bin/start.sh /app/bin/start.sh
RUN chmod +x /app/bin/start.sh


#The below java Main class executes infinitely.
ENTRYPOINT ["/app/bin/start.sh"]
