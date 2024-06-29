import java.time.LocalTime;

public class Product {
    String id;
    String description;
    // Can be enum ("peça, unidade, metro, cm3")
    String unitType;
    double price;

    public Product(String descipriton, String unitType, double price) {
        this.id = LocalTime.now().toString();
        this.description = descipriton;
        this.unitType = unitType;
        this.price = price;
    };
}
