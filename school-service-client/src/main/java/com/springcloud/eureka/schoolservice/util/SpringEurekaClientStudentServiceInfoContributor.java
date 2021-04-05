package com.springcloud.eureka.schoolservice.util;

import java.util.Collections;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.Info.Builder;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

@Component
public class SpringEurekaClientStudentServiceInfoContributor implements InfoContributor {

	@Override
	public void contribute(Builder builder) {
		// TODO Auto-generated method stub
		builder.withDetail("details", Collections.singletonMap("description", "THis is the student service, which is discovery server aware!!"));
	}



}
