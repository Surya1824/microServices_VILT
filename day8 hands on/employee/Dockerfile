FROM openjdk:11
ADD target/users-sql.jar users-sql.jar
EXPOSE 8086
ENTRYPOINT ["java", "-jar" , "users-sql.jar"]