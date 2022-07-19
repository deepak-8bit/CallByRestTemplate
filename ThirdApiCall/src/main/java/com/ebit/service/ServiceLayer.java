package com.ebit.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class ServiceLayer {
	
//	@Autowired
	private final RestTemplate restTemplate;

	
	
	@Autowired
	public ServiceLayer(RestTemplate restTemplate) {
		super();
		this.restTemplate = restTemplate;
	}
	
	
	String baseurl = "https://newsapi.org/v2/everything?q=";
	String publish ="&apiKey=";
	String key="6b2258d1391e4b44bd9c8c443b052590";
	
	public String testnewsApi(String word){
		String resp = restTemplate.getForObject(baseurl+word+publish+key, String.class); 
		
		System.out.println(resp);
		
		return resp;
	}

	
	
	
	

}
