package com.design;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class CustomerPlanService {
	
	public PlanCost getPlanPayentDetails(CustomerRequest customerRequest) {
		LocalDate ldt = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
		SubscriptionDetails subscription = customerRequest.getSubscription();
		PlanCost planCost = new PlanCost();
		if(subscription != null) {
			PlanEnum planDet = PlanEnum.lookup(subscription.getPlan());
			LocalDate planSubDt = LocalDate.parse(subscription.getStartDate(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
			long remDays = ChronoUnit.DAYS.between(planSubDt, ldt);
			double pricePerYear = planDet.getPrice()*12;
			double pricePerDay = pricePerYear/365;
			planCost.setYear(pricePerYear);
			planCost.setMonth(remDays * pricePerDay);
		}
		return planCost;		
	}

}
