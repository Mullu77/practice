package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.binding.Customers;

@RestController
public class CustomerRestController {
	
	@GetMapping("/customer")
	public Customers getCustomers() {
		
		Customers c = new Customers();
		c.setName("murali");
		c.setGender("male");
		c.setEmail("murali@gmail.com");
		
		return c;
	}

}
