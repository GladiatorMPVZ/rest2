package rest.rest2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartItem {
    private Long prodictId;
    private String productTitle;
    private Long price;
    private int quantity;

    public void changeQuantity(int delta) {
        quantity += delta;
    }
}
