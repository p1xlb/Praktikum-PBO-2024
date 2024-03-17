package Maskapai;

public class pilot {
    String id_pilot;
    String nama_pilot;
    String rating;

    public pilot(String id_pilot, String nama_pilot, String rating) {
        this.id_pilot = id_pilot;
        this.nama_pilot = nama_pilot;
        this.rating = rating;
    }

    public void setId_pilot(String id_pilot) {
        this.id_pilot = id_pilot;
    }

    public String getId_pilot() {
        return id_pilot;
    }

    public void setNama_pilot(String nama_pilot) {
        this.nama_pilot = nama_pilot;
    }

    public String getNama_pilot() {
        return nama_pilot;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getRating() {
        return rating;
    }
    
}
