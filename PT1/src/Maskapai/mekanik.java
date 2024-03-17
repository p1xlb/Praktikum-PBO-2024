package Maskapai;

public class mekanik {
    String id_mekanik;
    String nama_mekanik;
    String rating;

    public mekanik(String id_mekanik, String nama_mekanik, String rating) {
        this.id_mekanik = id_mekanik;
        this.nama_mekanik = nama_mekanik;
        this.rating = rating;
    }

    public void setId_mekanik(String id_mekanik) {
        this.id_mekanik = id_mekanik;
    }

    public String getId_mekanik() {
        return id_mekanik;
    }

    public void setNama_mekanik(String nama_mekanik) {
        this.nama_mekanik = nama_mekanik;
    }

    public String getNama_mekanik() {
        return nama_mekanik;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getRating() {
        return rating;
    }
}
