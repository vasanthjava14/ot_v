package com.example.overallTask.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.overallTask.entity.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer>{

}
     