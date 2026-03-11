package edu.wctc.wholesale.repo;

import edu.wctc.wholesale.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
