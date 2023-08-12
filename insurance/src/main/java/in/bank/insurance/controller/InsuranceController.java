package in.bank.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.bank.insurance.model.Customers;
import in.bank.insurance.model.Insurance;
import in.bank.insurance.repository.InsuranceRepository;


@RestController
public class InsuranceController {
	 @Autowired
	    private InsuranceRepository insuranceRepository;
	    
	    
	    @PostMapping("/insurance")
		public Insurance getInsuranceDetails(@RequestBody Customers customer) {
			
			Insurance insurance = insuranceRepository. findByCustomerId(customer.getCustomerId());
			return insurance;
}
}
