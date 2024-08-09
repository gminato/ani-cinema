package monkey.d.anicinema.dto;

import java.util.List;

import lombok.Data;

@Data
public class Cinemadto {
    String name; 
    String description;
    List<String> amenities;
    List<HallInfodto> hallInfodtos;
}
