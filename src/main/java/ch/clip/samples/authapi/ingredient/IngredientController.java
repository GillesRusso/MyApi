package ch.clip.samples.authapi.ingredient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ingredients")
public class IngredientController {
    @Autowired
    private IngredientRepository ingredientRepository ;

    public IngredientController(IngredientRepository ingredientRepository){
        super();
        this.ingredientRepository = ingredientRepository;
    }
    /**
     *
     * @return
     */
    @GetMapping
    public List<Ingredient> getIngredient() {
        return ingredientRepository.findAll();
    }
}
