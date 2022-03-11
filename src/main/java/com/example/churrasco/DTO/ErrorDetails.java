package com.example.churrasco.DTO;

import java.util.Date;

public class ErrorDetails {

	private Date timeDate;
	private String message;
	private String details;
	
	

	public ErrorDetails(Date timeDate, String message, String details) {
		super();
		this.timeDate = timeDate;
		this.message = message;
		this.details = details;
	}

	public Date getTimeDate() {
		return timeDate;
	}

	public void setTimeDate(Date timeDate) {
		this.timeDate = timeDate;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
	

}
