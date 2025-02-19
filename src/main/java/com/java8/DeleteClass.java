package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class DeleteClass {
	
	private String getResponse(String s) {
		return null;
	}
	
	private void checkMap() {
	  Optional.ofNullable(null).map(x -> x.toString()).orElseThrow(() -> new RuntimeException("xx"));
	}

	public static void main(String[] args) {
		DeleteClass dc = new DeleteClass();
		dc.checkMap();
	}

}
