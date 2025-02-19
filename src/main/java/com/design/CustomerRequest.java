package com.design;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerRequest {
	
	private String customer;
	private String product;
	private SubscriptionDetails subscription;

}
