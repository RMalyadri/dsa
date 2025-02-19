package com.design;

import java.util.HashMap;
import java.util.Map;

public class RouterImpl implements Router {
    private Map<String,String> context = new HashMap<>();
    
	@Override
	public void addRoute(String path, String result) {
		context.put(path, result);

	}

	@Override
	public String callRoute(String path) {
		return context.getOrDefault(path, "");
	}

}
