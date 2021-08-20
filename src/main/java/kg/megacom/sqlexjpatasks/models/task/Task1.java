package kg.megacom.sqlexjpatasks.models.task;

import lombok.Data;

@Data
public class Task1 {
    private String model;
    private int speed;
    private double hd;

    public Task1(String model, int speed, double hd) {
        this.model = model;
        this.speed = speed;
        this.hd = hd;
    }

    public Task1() {
    }

}
