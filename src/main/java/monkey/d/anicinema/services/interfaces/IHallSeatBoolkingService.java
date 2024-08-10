package monkey.d.anicinema.services.interfaces;

import monkey.d.anicinema.dto.HallLayoutdto;
import monkey.d.anicinema.dto.SittingArrangmentdto;

public interface IHallSeatBoolkingService {
    public SittingArrangmentdto getSeatArrangement(String city, String animeName, String cinemaName, String showTime, String hallName);
}