package services;

import org.springframework.stereotype.Service;
import repositories.ProductRepository;

@Service
public class ProductDeliveryService {
    private final ProductRepository productRepository;

    public ProductDeliveryService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void addSomeProducts(){
        productRepository.add();
        productRepository.add();
        productRepository.add();
    }
}
