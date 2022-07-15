package ch.clip.samples.authapi.dessert;

import org.springframework.data.jpa.repository.JpaRepository;


public interface DessertRepository extends JpaRepository<Dessert, Long> {
    public Dessert findByName(Dessert name);
}
