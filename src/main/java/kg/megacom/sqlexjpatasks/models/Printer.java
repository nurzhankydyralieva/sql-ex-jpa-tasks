package kg.megacom.sqlexjpatasks.models;

import kg.megacom.sqlexjpatasks.enums.PrinterType;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Printer {
    @Id
    private Long code;
    @ManyToOne
    @JoinColumn(name =  "model")
    private Product product;
    private String color;
    @Enumerated(EnumType.STRING)
    private PrinterType type;
    private double price;
}
