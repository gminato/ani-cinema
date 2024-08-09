package monkey.d.anicinema.services.interfaces;

import monkey.d.anicinema.dto.AnimeBookingDetaildto;

public interface IAnimeBookingDetailService {
    AnimeBookingDetaildto getCinemaList(String city,String animeName);
}
