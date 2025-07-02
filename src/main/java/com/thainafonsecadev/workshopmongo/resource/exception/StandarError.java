package com.thainafonsecadev.workshopmongo.resource.exception;

import java.io.Serializable;

public class StandarError  implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	private Long timestamp;
	private Integer stattus;
	private String error;
	private String message;
	private String path;
	
	public StandarError() {
		
	}

	public StandarError(Long timestamp, Integer stattus, String error, String message, String path) {
		super();
		this.timestamp = timestamp;
		this.stattus = stattus;
		this.error = error;
		this.message = message;
		this.path = path;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public Integer getStattus() {
		return stattus;
	}

	public void setStattus(Integer stattus) {
		this.stattus = stattus;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	

}
