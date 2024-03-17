package Maskapai;

public class pilot {
    private String id_pilot;
    private String nama_pilot;
    private String rating;

    public pilot(String id_pilot, String nama_pilot, String rating) {
        setId_pilot(id_pilot);
        setNama_pilot(nama_pilot);
        setRating(rating);
    }

    public void setId_pilot(String id_pilot) {
        if (id_pilot == null || id_pilot.isEmpty()) {
            throw new IllegalArgumentException("ID pilot cannot be null or empty.");
        }
        if (!id_pilot.startsWith("P")) {
            throw new IllegalArgumentException("ID pilot must start with 'P'.");
        }
        this.id_pilot = id_pilot;
    }

    public String getId_pilot() {
        return id_pilot;
    }

    public void setNama_pilot(String nama_pilot) {
        if (nama_pilot == null || nama_pilot.isEmpty()) {
            throw new IllegalArgumentException("Nama pilot tidak bisa kosong.");
        }
        nama_pilot = nama_pilot.trim();
        if (!nama_pilot.matches("[a-zA-Z ]+")) {
            throw new IllegalArgumentException("Nama pilot hanya mencakup huruf dan sapsi.");
        }
        this.nama_pilot = nama_pilot;
    }

    public String getNama_pilot() {
        return nama_pilot;
    }

    public void setRating(String rating) {
        if (rating == null || rating.isEmpty()) {
            throw new IllegalArgumentException("Rating tidak bisa kosong.");
        }
        this.rating = rating;
    }

    public String getRating() {
        return rating;
    }
    
}
