package ch.clip.samples.authapi.dessert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/desserts")
public class DessertController {
    @Autowired
    private DessertRepository dessertRepository;

    public DessertController(DessertRepository dessertRepository){
        super();
        this.dessertRepository = dessertRepository;
    }
    @PostMapping("/{id}")
    public void addDessert(@RequestBody Dessert name, @PathVariable Long id) {

    }

    /**
     *
     * @return
     */
    @GetMapping
    public List<Dessert> getDessert() {
        return dessertRepository.findAll();
    }

}
