package github.com.frapodev.productsales.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import github.com.frapodev.productsales.model.Product;
import github.com.frapodev.productsales.repository.ProductRepository;

@Service
public class ProductService {
    
    @Autowired
    ProductRepository pRepository;

    public Product registerProductService(Product product){
        return pRepository.save(product);
    }

    public List<Product> listAllProductService(){
        return pRepository.findAll();
    }

    public Product findByIDService(Long id){
        return pRepository.findById(id).get();
    }

    public void deleteProductService(Product product){
        pRepository.deleteById(product.getId());
    }

    

}
