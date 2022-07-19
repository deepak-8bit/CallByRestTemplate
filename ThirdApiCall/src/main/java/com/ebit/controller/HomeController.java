package com.ebit.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ebit.service.ServiceLayer;

@RestController
public class HomeController {
	
	@Autowired
	private ServiceLayer service;
	
	
	
	@GetMapping("/test/{word}")
	public String testapi(@PathVariable String word) {
		return service.testnewsApi(word);
	}

}
