package api;

import lombok.Data;

@Data
public class ProductDto {
    private Long id;
    private String title;
    private int price;
    private String categoryTitle;

    public ProductDto(Long id, String title, int price, String categoryTitle) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.categoryTitle = categoryTitle;
    }

    public ProductDto() {
    }
}