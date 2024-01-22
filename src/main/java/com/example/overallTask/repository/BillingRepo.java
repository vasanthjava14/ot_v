package com.example.overallTask.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.overallTask.entity.Billing;
@Repository
public interface BillingRepo extends JpaRepository<Billing, Integer> {

}
