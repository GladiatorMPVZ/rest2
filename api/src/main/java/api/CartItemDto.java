package api;

import lombok.Data;

@Data
public class CartItemDto {
    private Long productId;
    private String productTitle;
    private int quantity;
    private int price;

    public CartItemDto(Long productId, String productTitle, int quantity, int pricePerProduct, int price) {
        this.productId = productId;
        this.productTitle = productTitle;
        this.quantity = quantity;
        this.price = price;
    }

    public CartItemDto() {
    }
}