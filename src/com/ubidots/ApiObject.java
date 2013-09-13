package com.ubidots;

import java.util.HashMap;
import java.util.Map;

class ApiObject {

	private Map<String, Object> raw;
	protected ApiClient api;
	protected ServerBridge bridge;
	
	ApiObject(Map<String, Object> raw, ApiClient api) {
		this.raw = new HashMap<String, Object>(raw);
		this.api = api;
		bridge = api.getServerBridge();
	}
	
	String getAttributeString(String name) {
		return (String) raw.get(name);
	}
	
	Double getAttributeDouble(String name) {
		return (Double) raw.get(name);
	}
	
	Integer getAttributeInteger(String name) {
		return (Integer) raw.get(name);
	}
}
