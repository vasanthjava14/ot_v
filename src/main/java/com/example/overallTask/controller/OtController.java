package com.example.overallTask.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.example.overallTask.entity.Billing;
import com.example.overallTask.entity.Customer;
import com.example.overallTask.service.OtServiceIf;
@RestController
@CrossOrigin
@RequestMapping("/overall")
public class OtController {
	@Autowired
	OtServiceIf otServiceIf;
	Logger log=LoggerFactory.getLogger(OtController.class);
	@GetMapping("/customer")
	public List<Customer>getAllCustomers1() {
		return otServiceIf.getAllCustomers1();
	}
	@GetMapping("/customer/{id}")
	public Customer getDetailsById(@PathVariable int id) {
		log.error("hel");
		return otServiceIf.getDetailsById(id);
	}
	@PostMapping("/customer")
	public Customer createCustomerDetails(@RequestBody Customer customer) {
		return otServiceIf.createCustomerDetails(customer);
	}
	@PutMapping("/customer/{id}")
	public ResponseEntity<?> updateCustomerVo(@PathVariable int id, @RequestBody Customer customer) {
		return otServiceIf.createCustomerDetails(id, customer);
	}
	@DeleteMapping("/customer/{id}")
	public ResponseEntity<?> deleteCustomerDetailById(@PathVariable int id) {
		return otServiceIf.deleteCustomerDetailById(id);
	}
	// BILLING TABLE
	@GetMapping("/bill")
	public List<Billing> getAllBillings1() {
		return otServiceIf.getAllBillings1();
	}
	@GetMapping("/bill/{id}")
	public Billing getDetailsByIdBilling(@PathVariable int id) {
		return otServiceIf.getDetailsByIdBilling(id);
	}
	@PostMapping("/bill")
	public Billing createBillingDetails(@RequestBody Billing billing) {
		return otServiceIf.createBillingDetails(billing);
	}
	@PutMapping("bill/{id}")
	public ResponseEntity<?> updateDetailsBillingById(@PathVariable int id,@RequestBody Billing billing){
		return otServiceIf.updateDetailsBillingById(id,billing);
	}
	@DeleteMapping("/bill/{id}")
	public ResponseEntity<?> deleteBillingDetailById(@PathVariable int id)
	{
		return otServiceIf.deleteBillingDetailById(id);
	}
}
