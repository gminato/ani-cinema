package monkey.d.anicinema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import monkey.d.anicinema.dto.AnimeBookingDetaildto;
import monkey.d.anicinema.dto.AnimeShowdto;
import monkey.d.anicinema.services.interfaces.IAnimeListService;
import monkey.d.anicinema.services.interfaces.IAnimeBookingDetailService;

@RestController
@RequestMapping(path = "v1/anime", produces = {MediaType.APPLICATION_JSON_VALUE})
@AllArgsConstructor
public class Animecontroller {

    @Autowired
    IAnimeListService iAnimeListService;
    @Autowired
    IAnimeBookingDetailService iAnimeBookingDetailService;

    @GetMapping("/{city}")
    public ResponseEntity<AnimeShowdto> getAnimeList(@PathVariable("city") String city) {
        AnimeShowdto animeListdto = iAnimeListService.getAnimeList(city); 
        return ResponseEntity.status(HttpStatus.OK).body(animeListdto); 
    }

    @GetMapping("/{city}/{animeName}")
    public ResponseEntity<AnimeBookingDetaildto> getAnimeList(@PathVariable("city") String city, @PathVariable("animeName") String animeName) {
        AnimeBookingDetaildto animeBookingDetaildto= iAnimeBookingDetailService.getCinemaList(city, animeName);
        return ResponseEntity.status(HttpStatus.OK).body(animeBookingDetaildto); 
    }

}