# otel-spring-tracing
 
Run with following VM arguments

-javaagent:D:\Installations\opentelemetry-javaagent.jar 
-Dotel.traces.exporter=zipkin 
-Dotel.resource.attributes=service.name=school-service 
-Dotel.metrics.exporter=none
-Dotel.exporter.zipkin.endpoint=http://localhost:9411/api/v2/spans

#start Zipkin server locally with an installation of elastic search instance

java -DSTORAGE_TYPE=elasticsearch -DES_HOSTS=http://127.0.0.1:9200 -jar D:/Installations/zipkin.jar

