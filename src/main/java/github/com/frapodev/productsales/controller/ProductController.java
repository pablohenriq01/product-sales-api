package github.com.frapodev.productsales.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import github.com.frapodev.productsales.model.Product;

import github.com.frapodev.productsales.service.ProductService;



@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired 
    ProductService productService;

    @PostMapping
    public Product registerProduct(@RequestBody Product product){
       return productService.registerProductService(product);
    }
}
