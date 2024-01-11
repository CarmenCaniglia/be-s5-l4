package carmen.bes5l4.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Drinks")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Drink extends Item {
    @Id
    @GeneratedValue
    private long id;
    private String name;

    public Drink(int calories, double price, String name) {
        super(calories, price);
        this.name = name;
    }
}
