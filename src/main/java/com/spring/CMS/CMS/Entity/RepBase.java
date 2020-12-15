package com.spring.CMS.CMS.Entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonInclude;

/* Show null on JSON */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RepBase 
{
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	private Date timestamp = new Date();
	private Object response;
	
	public RepBase(Object response)
	{
		this.response = response;
	}
	
	public RepBase() {}

	public Date getTimestamp() { return timestamp; }

	public void setTimestamp(Date timestamp) { this.timestamp = timestamp; }

	public Object getResponse() { return response; }

	public void setResponse(Object response) { this.response = response;}

}
