package com.dpattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class Immutable {
	private final List<String> names;
	private final Map<String, String> map;
	public Immutable(List<String> names, Map<String, String> map) {
		this.names = new ArrayList<>(names);
		this.map  = new HashMap<>(map);
	}
}
