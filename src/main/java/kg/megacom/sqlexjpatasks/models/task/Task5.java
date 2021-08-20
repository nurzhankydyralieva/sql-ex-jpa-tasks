package kg.megacom.sqlexjpatasks.models.task;

import lombok.Data;
@Data
public class Task5 {
    private Long code;
    private String model;
    private int speed;
    private int ram;
    private double hd;
    private String cd;
    private double price;

    public Task5(Long code, String model, int speed, int ram, double hd, String cd, double price) {
        this.code = code;
        this.model = model;
        this.speed = speed;
        this.ram = ram;
        this.hd = hd;
        this.cd = cd;
        this.price = price;
    }

    public Task5() {
    }
}
