package rest.rest2;

import lombok.Data;
import org.springframework.stereotype.Component;
import rest.rest2.Entity.Product;

import java.util.HashMap;
import java.util.Map;

@Data
@Component
public class Cart {

    private final Map<Product, Integer> cartMap = new HashMap<>();

    public Map<Product, Integer> getCartMap() {
        return cartMap;
    }
}
