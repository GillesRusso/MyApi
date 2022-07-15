package ch.clip.samples.authapi.ingredient;

import ch.clip.samples.authapi.dessert.Dessert;

import javax.persistence.*;

@Entity
public class Ingredient {
    //Die Klasse Ingredient verfügt über die Attribute name und price und ist mit der Tabelle dessert verbunden
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int price;

    private String name;

    @ManyToOne
    @JoinColumn(name = "dessert_id", referencedColumnName = "id")
    private Dessert dessert;

    public Ingredient(){
        super();
    }

    public Ingredient(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public Dessert getDessert() {
        return dessert;
    }

    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "id=" + id +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", dessert=" + dessert +
                '}';
    }
}
