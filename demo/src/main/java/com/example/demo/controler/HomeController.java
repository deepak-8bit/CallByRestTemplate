package com.example.demo.controler;

import java.util.List;



//import org.json.JSONArray;
//import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.responce.ApiRes;
import com.example.demo.responce.ApiRes2;
import com.example.demo.responce.ApiResponce;

import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
//import com.google.gson.Gson;

@RestController
public class HomeController {
	
	@Autowired
	private RestTemplate restTemplae;
	
	ObjectMapper obj =new ObjectMapper();
	
	@GetMapping("/te")
	public String test() {
		
	String responce =	restTemplae.getForObject("https://newsapi.org/v2/top-headlines?country=us&category=business&apiKey=a1c426e2416b4c47855a23ddde3577be", String.class);
	
	return responce;
	}
	

	

	
	
	
	@GetMapping("/testrun2")
	public ApiResponce test4() {
		ApiResponce ap = null;
		try {
		
		
		String res =  restTemplae.getForObject("https://newsapi.org/v2/top-headlines?country=us&category=business&apiKey=a1c426e2416b4c47855a23ddde3577be",String.class);
		System.out.println(res);
		
		 ap =		obj.readValue(res, ApiResponce.class);
	
			System.out.println(ap);
		} catch (JsonProcessingException e) {
			
			e.printStackTrace();
		}
		return ap;
		
	}
	@GetMapping("/covid-uk")
	public  ApiRes[] test5() {
		
		ApiRes[] responc =null;
		 responc = restTemplae.getForObject("https://api.covidtracking.com/v1/us/daily.json", ApiRes[].class);
		
		System.out.println(responc);
		
		return responc;
		
		
	}
	
	
	
	
}
