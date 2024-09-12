package github.com.frapodev.productsales.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import github.com.frapodev.productsales.model.Client;

@Repository
public interface ClientRepository extends JpaRepository <Client, Long>{
    
}
