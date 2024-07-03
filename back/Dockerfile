FROM maven as builder

WORKDIR /app

COPY ./back/pom.xml .
RUN mvn dependency:go-offline

COPY ./back/src ./src
RUN mvn package -DskipTests -Pprod


FROM openjdk:17

WORKDIR /app

COPY --from=builder /app/target/back-0.0.1-SNAPSHOT.jar .


EXPOSE 9000

ENTRYPOINT ["java", "-jar", "back-0.0.1-SNAPSHOT.jar"]