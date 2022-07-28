# otel-spring-tracing

A better guide is available on my medium articles - 
1) https://nitin-rohidas.medium.com/introduction-to-opentelemetry-distributed-tracing-part-i-d1dc57d71a96
2) https://nitin-rohidas.medium.com/introduction-to-opentelemetry-distributed-tracing-part-ii-7ddab4a4cf15
3) https://nitin-rohidas.medium.com/introduction-to-opentelemetry-distributed-tracing-part-iii-9b1bce59c1bd
 
Run with following VM arguments

-javaagent:D:\Installations\opentelemetry-javaagent.jar 
-Dotel.traces.exporter=zipkin 
-Dotel.resource.attributes=service.name=school-service 
-Dotel.metrics.exporter=none
-Dotel.exporter.zipkin.endpoint=http://localhost:9411/api/v2/spans

# start Zipkin server locally with an installation of elastic search instance

java -DSTORAGE_TYPE=elasticsearch -DES_HOSTS=http://127.0.0.1:9200 -jar D:/Installations/zipkin.jar

# exporting traces to http configuration
-javaagent:D:\Installations\opentelemetry-javaagent.jar 
-Dotel.exporter.otlp.protocol=http/protobuf
-Dotel.exporter.otlp.traces.protocol=http/protobuf
-Dotel.resource.attributes=service.name=school-service 
-Dotel.metrics.exporter=none

