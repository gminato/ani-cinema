package monkey.d.anicinema.dto;

import java.util.List;
import java.util.Map;

import lombok.Data;


@Data
public class HallLayoutdto {
    String sittingName;
    String price;
    Map<String,List<List<StatusEnum>>> sittingArrangement;
    public enum StatusEnum {
        AVAILABLE, BOOKED, BLOCKED , SELECTED
    } 
   
    public HallLayoutdto() {
        sittingName = "A row";
        price = "Rs100";
        sittingArrangement = Map.of("A", List.of(List.of(StatusEnum.AVAILABLE,StatusEnum.AVAILABLE)));
    }
}
