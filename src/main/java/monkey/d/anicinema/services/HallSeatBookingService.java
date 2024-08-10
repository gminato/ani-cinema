package monkey.d.anicinema.services;

import org.springframework.stereotype.Service;

import monkey.d.anicinema.dto.SittingArrangmentdto;
import monkey.d.anicinema.services.interfaces.IHallSeatBoolkingService;

@Service
public class HallSeatBookingService implements IHallSeatBoolkingService {

    @Override
    public SittingArrangmentdto getSeatArrangement(String city, String animeName, String cinemaName, String showTime,
            String hallName) {
                return new SittingArrangmentdto();
    }
   
    
}
