package api;

import lombok.Data;

import java.util.List;

@Data
public class CartDto {
    private List<CartItemDto> items;
    private int totalPrice;

    public CartDto(List<CartItemDto> items, int totalPrice) {
        this.items = items;
        this.totalPrice = totalPrice;
    }

    public CartDto() {
    }
}