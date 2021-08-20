package kg.megacom.sqlexjpatasks.models.dto;

import lombok.Data;
@Data
public class PCDto {
    private Long code;
    private ProductDto product;
    private int speed;
    private int ram;
    private double hd;
    private String cd;
    private double price;
}
