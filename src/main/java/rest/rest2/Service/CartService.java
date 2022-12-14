package rest.rest2.Service;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import rest.rest2.Cart;
import rest.rest2.Entity.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
@Slf4j
@Service
public class CartService {

    private final ProductService productService;

    public void addProduct(Cart cart, Product product, Integer quantity) {
        cart.getCartMap().put(product, quantity);
    }

    public void addProductById(Cart cart, Long id, Integer quantity) {
        Product product = productService.findProductById(id);
        this.addProduct(cart, product, quantity);
    }

    public List<Product> showAll(Cart cart) {
        List<Product> cartList = new ArrayList<>(cart.getCartMap().keySet());
        return cartList;
    }

}
