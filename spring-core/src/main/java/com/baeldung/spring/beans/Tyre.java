package com.baeldung.spring.beans;

public class Tyre {

	private String type;
	private String width;

	public Tyre(String type, String width) {
		this.type = type;
		this.width = width;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}
	
}
