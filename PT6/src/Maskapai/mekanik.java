package Maskapai;

import java.util.Arrays;
import java.util.List;

final public class mekanik extends karyawan implements Sertifiable {
    private String id_mekanik;
    private String spesialisasi;
    
    public mekanik(String id_mekanik, String nama, String rating) {
        super(nama, rating);
        setId_mekanik(id_mekanik);
        this.spesialisasi = "General";
    }
    
    public mekanik(String id_mekanik, String nama, String rating, String spesialisasi) {
        super(nama, rating);
        setId_mekanik(id_mekanik);
        this.spesialisasi = spesialisasi;
    }

    public void setId_mekanik(String id_mekanik) {
        if (id_mekanik == null || id_mekanik.isEmpty()) {
            throw new IllegalArgumentException("ID mekanik tidak bisa kosong.");
        }
        if (!id_mekanik.startsWith("M")) {
            throw new IllegalArgumentException("ID mekanik harus diawali dengan 'M'.");
        }
        this.id_mekanik = id_mekanik;
    }

    public String getId_mekanik() {
        return id_mekanik;
    }

    public String getSpesialisasi() {
        return spesialisasi;
    }

    public void setSpesialisasi(String spesialisasi) {
        this.spesialisasi = spesialisasi;
    }

    public void DefSpesialisasi(String spesialisasi) {
        this.spesialisasi = "General";
    }

    @Override
    public final String getDetails() {
        return "ID Mekanik: " + id_mekanik + "\nNama Mekanik: " + getNama() + "\nRating: " + getRating() + "\nSpesialisasi: " + spesialisasi;
    }

    @Override
    public String getRating() {
        return super.getRating();
    }

    @Override
    public void setRating(String rating) {
        super.setRating(rating);
    }

    @Override
    public List<String> getValidRatings() {
        return Arrays.asList("A320 Series", "B737 Series", "A330", "B777", "GL7T", "G650", "General");
    }

    @Override
    public boolean isRatingValid(String rating) {
        List<String> validRatings = getValidRatings();
        return validRatings.contains(rating);
    }
}