package edu.wctc.wholesale.repo;

import edu.wctc.wholesale.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
