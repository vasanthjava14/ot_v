package com.example.overallTask.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.example.overallTask.entity.Billing;
import com.example.overallTask.entity.Customer;
import com.example.overallTask.repository.BillingRepo;
import com.example.overallTask.repository.CustomerRepo;
@Service
public class OtServiceImpl implements OtServiceIf {
	@Autowired
	CustomerRepo customerRepo;
	@Autowired
	BillingRepo billingRepo;

	@Override
	public Customer getDetailsById(int id) {
		// TODO Auto-generated method stub
		return customerRepo.findById(id).orElse(null);
	}

	@Override
	public Customer createCustomerDetails(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepo.save(customer);
	}

	@Override
	public ResponseEntity<?> createCustomerDetails(int id, Customer customer) {
		// TODO Auto-generated method stub
		Customer cust = customerRepo.findById(id).get();
		cust.setCustomername(customer.getCustomername());
		cust.setCustomerinfo(customer.getCustomerinfo());
		cust.setMobileno(customer.getMobileno());
		customerRepo.save(cust);
		return ResponseEntity.ok().body("Customer Update Detils Successfull");
	}

	@Override
	public ResponseEntity<?> deleteCustomerDetailById(int id) {
		// TODO Auto-generated method stub

		billingRepo.deleteById(id);
		return ResponseEntity.ok().body("Customer DElete Detils Successfull");
	}

	@Override
	public Billing createBillingDetails(Billing billing) {
		// TODO Auto-generated method stub
		return billingRepo.save(billing);
	}

	@Override
	public ResponseEntity<?> updateDetailsBillingById(int id, Billing billing) {
		// TODO Auto-generated method stub
		Billing bill = billingRepo.findById(id).get();
		bill.setMedicinedesc(billing.getMedicinedesc());
		bill.setCustomeraddress(billing.getCustomeraddress());
		bill.setBillrate(billing.getBillrate());
		billingRepo.save(bill);
		return ResponseEntity.ok().body("Billing Update Detils Successfull");
	}

	@Override
	public ResponseEntity<?> deleteBillingDetailById(int id) {
		// TODO Auto-generated method stub
		billingRepo.deleteById(id);
		return ResponseEntity.ok().body("Billing Delete Detils Successfull");
	}

	@Override
	public List<Customer> getAllCustomers1() {
		// TODO Auto-generated method stub
		return customerRepo.findAll();
	}

	@Override
	public List<Billing> getAllBillings1() {
		// TODO Auto-generated method stub
		return billingRepo.findAll();
	}

	@Override
	public Billing getDetailsByIdBilling(int id) {
		// TODO Auto-generated method stub
		return billingRepo.findById(id).orElse(null);
	}

}
