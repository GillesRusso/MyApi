package dessert;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DessertRepository extends JpaRepository<Dessert, Long> {
    Dessert findyByDessert (String name);
}
