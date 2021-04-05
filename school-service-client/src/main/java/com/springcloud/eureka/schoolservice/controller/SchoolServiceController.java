package com.springcloud.eureka.schoolservice.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import com.springcloud.eureka.schoolservice.domain.Student;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriTemplate;

@RestController
public class SchoolServiceController {
		

	@RequestMapping(value="/getSchoolDetails/{schoolname}", method=RequestMethod.GET)
	public Map<String, String> getStudents(@PathVariable String schoolname){
		
		System.out.println("Getting School details for "+ schoolname);
		
		Map<String, String> map =new HashMap<String, String>();
		
		
		     final String uri = "http://localhost:8098/getStudentDetails/utp";
 
    		     //TODO: Autowire the RestTemplate in all the examples
    			RestTemplate restTemplate = new RestTemplate();
 
    			String result = restTemplate.getForObject(uri, String.class);
    			System.out.println(result);
		
		//String response = restTemplate.getForObject("http://student-service/getStudentDetails/utp", String.class,schoolname);
		
	     map.put("School name", schoolname);
		map.put("Student Details", result); 
		
		return map;
	}

}
