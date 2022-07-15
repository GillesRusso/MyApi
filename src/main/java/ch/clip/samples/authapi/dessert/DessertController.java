package ch.clip.samples.authapi.dessert;

import ch.clip.samples.authapi.user.AppUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.util.Collections.emptyList;

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
    public void addDessert(@RequestBody Dessert name) {
        dessertRepository.save(name);
    }

    public Dessert getDessert (@RequestBody Dessert name) {
        Dessert dessert = dessertRepository.save(name);
        return dessert;
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
