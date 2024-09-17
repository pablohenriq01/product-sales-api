package github.com.frapodev.productsales.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import github.com.frapodev.productsales.model.Product;
import github.com.frapodev.productsales.service.ProductService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired 
    ProductService productService;

    @PostMapping("/register")
    public Product registerProduct(@RequestBody Product product){
       return productService.registerProductService(product);
    }

    @GetMapping
    public List<Product> listAllProducts() {
        return productService.listAllProductService();
    }
    
    @GetMapping("/{id}")
    public Product findByID(@PathVariable("id") Long id) {
        return productService.findByIDService(id);
    }
    
    @DeleteMapping("/delete/{id}")
    public void deleteById (@PathVariable("id") Product product){
        productService.deleteProductService(product);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable Long id , @RequestBody Product product){
        return productService.updateProductService(id, product);
    }
}


