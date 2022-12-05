package com.commerce.Product_Service.Controller;


import com.commerce.Product_Service.Service.ProductService;
import com.commerce.Product_Service.dto.ProductRequest;
import com.commerce.Product_Service.dto.ProductResponse;
import com.commerce.Product_Service.models.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping("/Add")
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest) {
        productService.createProduct(productRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProducts() {
        return productService.getAllProducts();
    }
    @PutMapping("/updateProduct")
    public Product updateProduct(@RequestBody Product product) {
        return  productService.updateProduct(product);
    }
    @DeleteMapping("/remove-Product/{id}")
    @ResponseBody
    public void removeCreation(@PathVariable("id") String id) {
        productService.DeleteProduct(id);
    }

}
