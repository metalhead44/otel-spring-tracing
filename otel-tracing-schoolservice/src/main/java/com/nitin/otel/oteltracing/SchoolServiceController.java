package com.nitin.otel.oteltracing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
 
@RestController
public class SchoolServiceController {
  @Autowired
  RestTemplate restTemplate;
 
  @RequestMapping(value = "/getSchoolDetails/{schoolname}", method = RequestMethod.GET)
  public String getStudents(@PathVariable String schoolname) 
  {
    System.out.println("Getting School details for " + schoolname);
 
    String response = restTemplate.exchange("http://localhost:9000/getStudentDetailsForSchool/{schoolname}",
                HttpMethod.GET, null, new ParameterizedTypeReference<String>() {}, schoolname).getBody();
 
    System.out.println("Response Received as " + response);
 
    return "School Name -  " + schoolname + " \n Student Details " + response;
  }
 
 
}
