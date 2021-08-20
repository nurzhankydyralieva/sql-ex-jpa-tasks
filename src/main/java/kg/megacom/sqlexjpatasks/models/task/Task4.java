package kg.megacom.sqlexjpatasks.models.task;

import lombok.Data;

@Data
public class Task4 {
    private String maker;

    public Task4(String maker) {
        this.maker = maker;
    }

    public Task4() {
    }
}
