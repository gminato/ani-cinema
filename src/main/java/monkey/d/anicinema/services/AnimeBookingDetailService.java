package monkey.d.anicinema.services;

import org.springframework.stereotype.Service;

import monkey.d.anicinema.dto.AnimeBookingDetaildto;
import monkey.d.anicinema.services.interfaces.IAnimeBookingDetailService;

@Service
public class AnimeBookingDetailService implements IAnimeBookingDetailService {

    public AnimeBookingDetaildto getCinemaList(String city, String animeName) {
        return new AnimeBookingDetaildto();
    }
    
}
