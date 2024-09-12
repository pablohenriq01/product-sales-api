package github.com.frapodev.productsales.repository;

import github.com.frapodev.productsales.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface productRepository extends JpaRepository <Long, Product> {
}