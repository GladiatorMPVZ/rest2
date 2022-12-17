package rest.rest2.Controller;

import lombok.AllArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.web.bind.annotation.*;
import rest.rest2.Entity.Product;
import rest.rest2.Service.ProductService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/products")
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public List<Product> getAllProduct() {
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public Product getAllProduct(@PathVariable Long id) {
        return productService.findProductById(id);
    }

    @PostMapping
    public Product saveNewProduct(@RequestBody Product product) {
        product.setId(null);
        return productService.saveOrUpdateProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        productService.deleteProductById(id);
    }

    @PutMapping
    public Product updateStudent(@RequestBody Product product) {
        return productService.saveOrUpdateProduct(product);
    }
}
