package carmen.bes5l4.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public abstract class Item {
    protected int calories;
    protected double price;

    public Item(int calories, double price) {
        this.calories = calories;
        this.price = price;
    }
}
