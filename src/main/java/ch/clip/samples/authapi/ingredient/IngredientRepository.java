package ch.clip.samples.authapi.ingredient;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
   // Ingredient findyByIngredientName (String name);
}
