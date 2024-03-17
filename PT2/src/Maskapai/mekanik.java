package Maskapai;

public class mekanik {
    private String id_mekanik;
    private String nama_mekanik;
    private String rating;

    public mekanik(String id_mekanik, String nama_mekanik, String rating) {
        setId_mekanik(id_mekanik);
        setNama_mekanik(nama_mekanik);
        setRating(rating);
    }

    public void setId_mekanik(String id_mekanik) {
        if (id_mekanik == null || id_mekanik.isEmpty()) {
            throw new IllegalArgumentException("ID mekanik cannot be null or empty.");
        }
        if (!id_mekanik.startsWith("M")) {
            throw new IllegalArgumentException("ID mekanik must start with 'M'.");
        }
        this.id_mekanik = id_mekanik;
    }

    public String getId_mekanik() {
        return id_mekanik;
    }

    public void setNama_mekanik(String nama_mekanik) {
        if (nama_mekanik == null || nama_mekanik.isEmpty()) {
            throw new IllegalArgumentException("Nama mekanik tidak bisa kosong.");
        }
        nama_mekanik = nama_mekanik.trim();
        if (!nama_mekanik.matches("[a-zA-Z ]+")) {
            throw new IllegalArgumentException("Nama mekanik hanya mencakup huruf dan spasi.");
        }
        this.nama_mekanik = nama_mekanik;
    }

    public String getNama_mekanik() {
        return nama_mekanik;
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