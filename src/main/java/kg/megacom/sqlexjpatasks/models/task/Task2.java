package kg.megacom.sqlexjpatasks.models.task;

import lombok.Data;

@Data
public class Task2 {
    private String model;
    private int ram;
    private int screen;

    public Task2(String model, int ram, int screen) {
        this.model = model;
        this.ram = ram;
        this.screen = screen;
    }

    public Task2() {
    }
}


