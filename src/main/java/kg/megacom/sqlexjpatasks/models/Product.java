package kg.megacom.sqlexjpatasks.models;

import kg.megacom.sqlexjpatasks.enums.ProductType;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Data
@Entity
public class Product {
    @Id
    private String model;
    private String maker;
    @Enumerated(EnumType.STRING)
    private ProductType type;
}
