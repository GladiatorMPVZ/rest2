package rest.rest2.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import rest.rest2.Cart;
import rest.rest2.Entity.Product;
import rest.rest2.Service.CartService;
import rest.rest2.Service.ProductService;

import java.util.List;
import java.util.Map;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/cart")
public class CartController {

    private final CartService cartService;
    private Cart cart;

    @GetMapping
    public List<Product> showCart() {
        return cartService.showAll(cart);
    }

    @GetMapping("/add/{id}")
    public void addToCart(@PathVariable(name = "id") Long id, @RequestParam(required = false, name = "q") Integer quantity) {
        cartService.addProductById(cart, id, quantity);
    }
}
