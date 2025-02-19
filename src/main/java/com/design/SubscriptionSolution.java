package com.design;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SubscriptionSolution {
	
	private static Logger logger = Logger.getLogger(SubscriptionSolution.class.getName());

	public static void main(String[] args) {
		CustomerRequest customerRequest = new CustomerRequest();
		customerRequest.setCustomer("C1");
		customerRequest.setProduct("Jira");
		SubscriptionDetails subscription = new SubscriptionDetails();
		subscription.setPlan(PlanEnum.PREMIUM_PLAN.getName());
		subscription.setStartDate("2024-03-10");
		customerRequest.setSubscription(subscription);
		CustomerPlanService customerPlanService = new CustomerPlanService();
		PlanCost planCost = customerPlanService.getPlanPayentDetails(customerRequest);
		logger.log(Level.INFO, "plan details: {0}",planCost);
		
	}

}
