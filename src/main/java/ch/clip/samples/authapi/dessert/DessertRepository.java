package ch.clip.samples.authapi.dessert;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface DessertRepository extends JpaRepository<Dessert, Long> {
  //Dessert FindyByDessertName (String name);

}
