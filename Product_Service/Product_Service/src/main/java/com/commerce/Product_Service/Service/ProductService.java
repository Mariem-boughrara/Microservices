package com.commerce.Product_Service.Service;

import com.commerce.Product_Service.dto.ProductRequest;
import com.commerce.Product_Service.dto.ProductResponse;
import com.commerce.Product_Service.models.Product;
import com.commerce.Product_Service.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {

    private final ProductRepository productRepository;

    public void createProduct(ProductRequest productRequest) {
        Product product = Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();

        productRepository.save(product);
        log.info("Product {} is saved", product.getId());
    }
    public List<ProductResponse> getAllProducts() {
        List<Product> products = productRepository.findAll();

        return products.stream().map(this::mapToProductResponse).toList();
    }

    private ProductResponse mapToProductResponse(Product product) {
        return ProductResponse.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .build();
    }
    public Product updateProduct(Product product) {

        String id = product.getId();
        Product pro = productRepository.findById(id).get();

        pro.setName(product.getName());
        pro.setPrice(product.getPrice());
        pro.setDescription(product.getDescription());


        return productRepository.save(pro);
    }

    public void DeleteProduct(String id) {
        productRepository.deleteById(id);
    }


}
