package monkey.d.anicinema.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("anime")
public class Animecontroller {

    @GetMapping("/{city}")
    public String getAnimeList(@PathVariable("city") String city) {
        return "Anime" + city;
    }

}