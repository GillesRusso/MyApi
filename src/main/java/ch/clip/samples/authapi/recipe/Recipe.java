package ch.clip.samples.authapi.recipe;
import ch.clip.samples.authapi.dessert.Dessert;
import javax.persistence.*;
@Entity
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int stepNum;

    private String name;

    @ManyToOne
    @JoinColumn(name = "dessert_id", referencedColumnName = "id")
    private Dessert dessert;

    public Recipe(){
        super();
    }

    public Recipe(int stepNum, String name) {
        this.stepNum = stepNum;
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

    public int getStepNum() {
        return stepNum;
    }

    public void setStepNum(int stepNum) {
        this.stepNum = stepNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "id=" + id +
                ", stepNum=" + stepNum +
                ", name='" + name + '\'' +
                '}';
    }
}
