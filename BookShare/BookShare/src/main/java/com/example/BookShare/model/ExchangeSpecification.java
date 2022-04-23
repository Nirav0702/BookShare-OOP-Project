package com.bookshare.app;

import org.springframework.format.annotation.DateTimeFormat;

public class ExchangeSpecification {
	private DateTimeFormat exchangeTime;
	private String exchangePlace;
	
	public DateTimeFormat getExchangeTime() {
		return exchangeTime;
	}
	public void setExchangeTime(DateTimeFormat exchangeTime) {
		this.exchangeTime = exchangeTime;
	}
	public String getExchangePlace() {
		return exchangePlace;
	}
	public void setExchangePlace(String exchangePlace) {
		this.exchangePlace = exchangePlace;
	}
	
	public void changePlace() {
		return;
	}
	
	public void changeTime() {
		return;
	}
}
