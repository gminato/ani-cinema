package monkey.d.anicinema.services.interfaces;

import monkey.d.anicinema.dto.AnimeShowdto;

public interface IAnimeListService {
    public AnimeShowdto getAnimeList(String city);
}
