package monkey.d.anicinema.dto;

import java.util.List;

import lombok.Data;

@Data
public class AnimeBookingDetaildto {
    String name; 
    String description;
    List<String> amenities;
    List<HallInfodto> hallInfodtos;

    public AnimeBookingDetaildto() {
        this.name = "test";
        this.description = "test";
        this.amenities = List.of("3D", "Dolby Atmos");
        this.hallInfodtos = List.of(new HallInfodto());
    }
}
