package com.example.demo.responce;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiRes {
	
	private String date;
	private String states;
	private String positive;
	private String negative;
	private String pending;
	public ApiRes() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ApiRes(String date, String states, String positive, String negative, String pending) {
		super();
		this.date = date;
		this.states = states;
		this.positive = positive;
		this.negative = negative;
		this.pending = pending;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getStates() {
		return states;
	}
	public void setStates(String states) {
		this.states = states;
	}
	public String getPositive() {
		return positive;
	}
	public void setPositive(String positive) {
		this.positive = positive;
	}
	public String getNegative() {
		return negative;
	}
	public void setNegative(String negative) {
		this.negative = negative;
	}
	public String getPending() {
		return pending;
	}
	public void setPending(String pending) {
		this.pending = pending;
	}
	@Override
	public String toString() {
		return "ApiRes [date=" + date + ", states=" + states + ", positive=" + positive + ", negative=" + negative
				+ ", pending=" + pending + "]";
	}
	
	


}
