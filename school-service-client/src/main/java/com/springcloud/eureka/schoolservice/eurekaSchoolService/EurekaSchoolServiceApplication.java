package com.springcloud.eureka.schoolservice.eurekaSchoolService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan({"com.springcloud.eureka.schoolservice.*"})
public class EurekaSchoolServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaSchoolServiceApplication.class, args);
	}

}
