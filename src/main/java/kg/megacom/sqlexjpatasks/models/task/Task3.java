package kg.megacom.sqlexjpatasks.models.task;

import kg.megacom.sqlexjpatasks.enums.PrinterType;
import lombok.Data;

@Data
public class Task3 {
    private Long code;
    private String model;
    private String color;
    private PrinterType type;
    private double price;

    public Task3(Long code, String model, String color, PrinterType type, double price) {
        this.code = code;
        this.model = model;
        this.color = color;
        this.type = type;
        this.price = price;
    }

    public Task3() {
    }
}

