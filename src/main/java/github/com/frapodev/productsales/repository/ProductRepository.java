package github.com.frapodev.productsales.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import github.com.frapodev.productsales.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

    
} 