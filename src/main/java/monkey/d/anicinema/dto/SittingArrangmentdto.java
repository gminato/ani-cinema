package monkey.d.anicinema.dto;

import lombok.Data;

@Data
public class SittingArrangmentdto {
    String showName;
    String Language;
    String location;
    HallLayoutdto hallLayout;

    public SittingArrangmentdto() {
        showName = "Naruto";
        Language = "English";
        location = "Bangalore";
        hallLayout = new HallLayoutdto();
    }
}
