package com.dsa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class GraphDS {
    Map<Vertex, List<Vertex>> vertex = new HashMap<>();
	public static void main(String[] args) {
		
	}
    public boolean add(String label) {
    	vertex.putIfAbsent(new Vertex(label), new ArrayList<>());
    	return true;
    }

}
class Vertex {
	String label;
	Vertex(String label) {
		this.label = label;
	}
	@Override
	public int hashCode() {
		return Objects.hash(label);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vertex other = (Vertex) obj;
		return Objects.equals(label, other.label);
	}
	
}

