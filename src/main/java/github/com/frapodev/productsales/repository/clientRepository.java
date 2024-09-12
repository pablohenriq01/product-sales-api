package github.com.frapodev.productsales.repository;

import github.com.frapodev.productsales.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface clientRepository extends JpaRepository <Long, Client> {
}