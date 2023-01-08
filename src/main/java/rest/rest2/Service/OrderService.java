package rest.rest2.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import rest.rest2.Entity.Order;
import rest.rest2.Entity.OrderItem;
import rest.rest2.Entity.User;
import rest.rest2.Repository.ProductRepository;
import rest.rest2.model.Cart;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final CartService cartService;
    private final ProductService productService;
    private final ProductRepository productRepository;

    public void createOrder(User user) {
        Cart cart = new Cart();
        Order order = new Order();
        cart.getItems().stream().map(cartItem -> {
            return new OrderItem(null, productService.findProductById(cartItem.getProdictId()),
                    order,
                    cartItem.getQuantity());
        });
    }
}
