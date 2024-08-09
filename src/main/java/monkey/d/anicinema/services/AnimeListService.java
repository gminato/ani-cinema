package monkey.d.anicinema.services;

import org.springframework.stereotype.Service;

import monkey.d.anicinema.dto.AnimeShowdto;
import monkey.d.anicinema.services.interfaces.IAnimeListService;

@Service
public class AnimeListService implements IAnimeListService {

    public AnimeShowdto getAnimeList(String city) {
        return new AnimeShowdto();
    }
}
