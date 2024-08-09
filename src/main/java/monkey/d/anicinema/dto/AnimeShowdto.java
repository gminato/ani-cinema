package monkey.d.anicinema.dto;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lombok.Data;

@Data
public class AnimeShowdto {
    String name;
    List<String> languages;
    String rating;
    String likeCount;
    List<String> genres; 
    Long releaseDate;
    String posterUrl;

    public AnimeShowdto() {
        this.name = "test";
        this.languages = new ArrayList<>( Arrays.asList("English", "Japanese")); 
        this.rating = "A";
        this.likeCount = "80%";
        this.genres = new ArrayList<>( Arrays.asList("Action", "Adventure"));
        this.releaseDate = Date.valueOf("2021-01-01").getTime();
        this.posterUrl = "https://picsum.photos/400/500";
    }
}
