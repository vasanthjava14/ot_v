package com.example.overallTask.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name = "customer_Table")
public class Customer {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id;
	private String customername;
	private String customerinfo;
	private long mobileno;
	//@OneToMany(mappedBy = "cust", cascade = CascadeType.ALL)
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="fk_customer_Table_id", referencedColumnName = "id")
	@JsonManagedReference
	private List<Billing> billrate;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getCustomerinfo() {
		return customerinfo;
	}
	public void setCustomerinfo(String customerinfo) {
		this.customerinfo = customerinfo;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
}
