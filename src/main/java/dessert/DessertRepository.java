package dessert;

import ch.clip.samples.authapi.user.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DessertRepository extends JpaRepository<Dessert, Long> {
    Dessert findyByDessertName (String name);

    Dessert addDessert(DessertRepository name, Long id);
}
