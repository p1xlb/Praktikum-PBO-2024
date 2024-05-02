package Maskapai;

import java.util.List;

public interface Sertifiable {
    String getRating();
    void setRating(String rating);
    List<String> getValidRatings();
    boolean isRatingValid(String rating);
}
