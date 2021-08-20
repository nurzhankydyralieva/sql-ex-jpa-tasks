package kg.megacom.sqlexjpatasks.models.dto;

import kg.megacom.sqlexjpatasks.enums.ProductType;
import lombok.Data;
@Data
public class ProductDto {
    private String model;
    private String maker;
    private ProductType type;
}
