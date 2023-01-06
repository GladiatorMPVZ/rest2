package rest.rest2.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import rest.rest2.Entity.Product;
import rest.rest2.model.Cart;

import javax.annotation.PostConstruct;
@Service
@RequiredArgsConstructor
public class CartService {
    private final ProductService productService;
    private Cart tempCart;
    @PostConstruct
    public void init() {
        tempCart = new Cart();
    }
    public Cart getCurrentCart() {
        return tempCart;
    }
    public void add(Long productId) {
        Product product = productService.findProductById(productId);
        tempCart.add(product);
    }
    public void clearCart() {
        tempCart.clearCart();
    }
    public void deleteFromCart(Long productId) {
        tempCart.delete(productId);
    }
    public void changeQuantity(Long productId, Integer delta) {
        tempCart.changeQuantity(productId, delta);
    }
}
