FROM openjdk:11
LABEL maintainer="lisa.l.crowell@gmail.com"
RUN adduser --system --group transactionservice
USER transactionservice:transactionservice
ADD target/TransactionService-0.0.1-SNAPSHOT.jar transactionservice.jar
EXPOSE 7775
ENTRYPOINT ["java", "-jar", "transactionservice.jar", "--spring.profiles.active=dev"]