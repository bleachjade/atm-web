FROM maven:3.6.3-openjdk-15
WORKDIR /usr/atm
COPY pom.xml .
RUN mvn dependency:resolve
COPY src ./src/
RUN mvn compile
EXPOSE 8080
CMD ["mvn","spring-boot:run"]


