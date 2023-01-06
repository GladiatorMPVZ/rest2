package rest.rest2.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import rest.rest2.Service.CartService;
import rest.rest2.model.Cart;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/cart")
public class CartController {

    private final CartService cartService;

    @GetMapping("/add/{id}")
    public void addToCart(@PathVariable Long id) {
        cartService.add(id);
    }
    @GetMapping
    public Cart getCurrentCart() {
        return cartService.getCurrentCart();
    }
    @GetMapping("/price_change")
    public void changeQuantity(@RequestParam Long productId, @RequestParam Integer delta) {
        cartService.changeQuantity(productId, delta);
    }
    @GetMapping("/delete/{productId}")
    public void deleteFromCart(@PathVariable Long productId) {
        cartService.deleteFromCart(productId);
    }
    @GetMapping("/clear")
    public void clearCart() {
        cartService.clearCart();
    }
}
