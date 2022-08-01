package com.example.demo.responce;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@SuppressWarnings("unused")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiResponce {
	
	private String status;
	private int totalResults;
	private List<Article> articles;
	
	
	public ApiResponce() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public ApiResponce(String status, int totalResults, List<Article> articles) {
		super();
		this.status = status;
		this.totalResults = totalResults;
		this.articles = articles;
	}


	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getTotalResults() {
		return totalResults;
	}
	public void setTotalResults(int totalResults) {
		this.totalResults = totalResults;
	}
	
	
	
	
	
	public List<Article> getArticles() {
		return articles;
	}
	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}
	@Override
	public String toString() {
		return "ApiResponce [status=" + status + ", totalResults=" + totalResults + ", articles=" + articles + "]";
	}
	
	

}
