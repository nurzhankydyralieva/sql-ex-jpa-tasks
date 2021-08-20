package kg.megacom.sqlexjpatasks.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@Entity
public class PC {
    @Id
    private Long code;
    @ManyToOne
    @JoinColumn(name =  "model")
    private Product product;
    private int speed;
    private int ram;
    private double hd;
    private String cd;
    private double price;

}
