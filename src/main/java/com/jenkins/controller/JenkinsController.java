package com.jenkins.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/get")
public class JenkinsController {

	@RequestMapping(value = "/message")
	public String getMessage() {
		return "springboot jenkins working be happy shahimsha";
	}

}
