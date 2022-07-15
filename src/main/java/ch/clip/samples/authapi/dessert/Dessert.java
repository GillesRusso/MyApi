package ch.clip.samples.authapi.dessert;

import javax.persistence.*;
import ch.clip.samples.authapi.user.AppUser;

@Entity
public class Dessert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String origin;
    private String name;
    @ManyToOne
    @JoinColumn(name = "appuser_id", referencedColumnName = "id")
    private AppUser appuser;

    public AppUser getAppuser() {
        return appuser;
    }

    public void setAppuser(AppUser appuser) {
        this.appuser = appuser;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Dessert() {
        super();
    }

    public Dessert(String origin, String name) {
        super();
        this.origin = origin;
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dessert{" +
                "id=" + id +
                ", origin='" + origin + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
