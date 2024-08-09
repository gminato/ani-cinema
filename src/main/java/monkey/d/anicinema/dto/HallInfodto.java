package monkey.d.anicinema.dto;

import lombok.Data;

@Data
public class HallInfodto {
    String hallName;
    String hallType;
    Long  startTime; 
    String hallDescription;
    String hallCapacity;
    String hallPrice;

    public HallInfodto() {
        this.hallName = "test";
        this.hallType = "test";
        this.startTime = 123L;
        this.hallDescription = "test";
        this.hallCapacity = "test";
        this.hallPrice = "test";
    }
}
