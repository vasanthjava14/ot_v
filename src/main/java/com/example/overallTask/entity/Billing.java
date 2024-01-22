package com.example.overallTask.entity;
import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="billing_Table")
public class Billing {
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Id
	private int id;
	private String medicinedesc;
	private String customeraddress;
	private int billrate;
	@ManyToOne
	@JoinColumn(name="fk_customer_Table_id")
	@JsonBackReference
	private Customer cust;
	public int getId() {
		return id;
	} 
	public void setId(int id) {
		this.id = id;
	}
	public String getMedicinedesc() {
		return medicinedesc;
	}
	public void setMedicinedesc(String medicinedesc) {
		this.medicinedesc = medicinedesc;
	}
	public String getCustomeraddress() {
		return customeraddress;
	}
	public void setCustomeraddress(String customeraddress) {
		this.customeraddress = customeraddress;
	}
	public int getBillrate() {
		return billrate;
	}
	public void setBillrate(int billrate) {
		this.billrate = billrate;
	}
	
}
