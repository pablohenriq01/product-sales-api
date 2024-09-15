package github.com.frapodev.productsales.service;

import org.springframework.beans.factory.annotation.Autowired;

import github.com.frapodev.productsales.model.Product;
import github.com.frapodev.productsales.repository.ProductRepository;

public class ProductService {
    
        @Autowired
        ProductRepository pRepository;

        public Product registerProductService(Product product){
        return pRepository.save(product);
    }

}
