package github.com.frapodev.productsales.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import github.com.frapodev.productsales.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    
} 