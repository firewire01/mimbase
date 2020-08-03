package com.elisharedservices.mims.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/mims")
public class BaseController {
	
	@Value("${application.version}")
	private String version;
	
	@RequestMapping("/version")
	public String getVersion() {
	   return version;
	}

}
