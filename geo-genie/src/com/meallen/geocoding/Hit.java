package com.meallen.geocoding;

import java.util.Map;

public class Hit {
	String id;
	StringCoordinate query;
	Response response;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public StringCoordinate getQuery() {
		return query;
	}
	public void setQuery(StringCoordinate query) {
		this.query = query;
	}
	public Response getResponse() {
		return response;
	}
	public void setResponse(Response response) {
		this.response = response;
	}
}