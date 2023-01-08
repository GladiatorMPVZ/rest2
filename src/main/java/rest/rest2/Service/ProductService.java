package rest.rest2.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import rest.rest2.Entity.Product;
import rest.rest2.Repository.ProductRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class ProductService {
    private final ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findProductById(Long id) {
        return productRepository.findById(id).orElseThrow();
    }

    public Product saveOrUpdateProduct(Product product) {
        return productRepository.save(product);
    }

    public void deleteProductById(Long id) {
        productRepository.deleteById(id);
    }
}
