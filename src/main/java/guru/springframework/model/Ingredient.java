package guru.springframework.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Data
@EqualsAndHashCode(exclude = {"recipe"})
public class Ingredient {

    public Ingredient() {
    }

    @Id
    private String id;

    private String description;
    private BigDecimal amount;

    @DBRef
    private UnitOfMeasure uom;

    //private Recipe recipe;

    public Ingredient(String description, BigDecimal amount, UnitOfMeasure uom) {
        this.description = description;
        this.amount = amount;
        this.uom = uom;
    }
}
