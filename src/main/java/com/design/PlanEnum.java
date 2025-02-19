package com.design;

import java.util.Arrays;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PlanEnum {
	
	BASIC_PLAN("Basic", 9.99),
	STANDARD_PLAN("Stanadard", 49.99),
	PREMIUM_PLAN("Premium", 249.99);
	
	private final String name;
	private final double price;
	
	public static PlanEnum lookup(String plan) {
		 return Arrays.stream(PlanEnum.values())
			.filter(pn -> pn.getName().equalsIgnoreCase(plan))
			.findFirst().orElse(BASIC_PLAN);
	}


}
