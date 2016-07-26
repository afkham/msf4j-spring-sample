# msf4j-spring-sample
WSO2 Microservices Framework for Java (MSF4J) Spring sample

## How to build
```
mvn clean install
```

## How to run
```
java -jar target/msf4j-spring-example-0.0.1-SNAPSHOT.jar
```

## How to invoke

Add product:
```
curl -v -X POST -H "Content-Type:application/json" -d '{"id":1,"name":"soap"}' http://localhost:9090/
``` 

Get product:
```
curl -v http://localhost:9090/1
```

