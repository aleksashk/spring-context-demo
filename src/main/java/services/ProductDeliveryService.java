package services;

import org.springframework.stereotype.Service;
import repositories.ProductRepository;

@Service
public class ProductDeliveryService {
    private ProductRepository productRepository;

    public void addSomeProducts(){
        productRepository.add();
        productRepository.add();
        productRepository.add();
    }
}
