package ch.clips.samples.recipe;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Recipies")
public class RecipeController {
    @Autowired
    private RecipeRepository recipeRepository ;

    public RecipeController(RecipeRepository recipeRepository){
        super();
        this.recipeRepository = recipeRepository;
    }
    /**
     *
     * @return
     */
    @GetMapping
    public List<Recipe> getRecipe() {
        return recipeRepository.findAll();
    }
}
