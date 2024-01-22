package com.example.overallTask.service;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.example.overallTask.entity.Billing;
import com.example.overallTask.entity.Customer;
@Service
public interface OtServiceIf {
	public Customer getDetailsById(int id);
	public Customer createCustomerDetails(Customer customer);
	public Billing createBillingDetails(Billing billing);
	public ResponseEntity<?> createCustomerDetails(int id, Customer customer);
	public ResponseEntity<?> deleteCustomerDetailById(int id);
	public ResponseEntity<?> updateDetailsBillingById(int id, Billing billing);
	public ResponseEntity<?> deleteBillingDetailById(int id);
	public List<Customer> getAllCustomers1();
	public List<Billing> getAllBillings1();
	public Billing getDetailsByIdBilling(int id);

}