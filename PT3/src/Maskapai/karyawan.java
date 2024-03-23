package Maskapai;

public class karyawan {
    private String nama;
    private String rating;

    public karyawan(String nama, String rating) {
        setNama(nama);
        setRating(rating);
    }

    public void setNama(String nama) {
        if (nama == null || nama.isEmpty()) {
            throw new IllegalArgumentException("Nama tidak bisa kosong.");
        }
        nama = nama.trim();
        if (!nama.matches("[a-zA-Z ]+")) {
            throw new IllegalArgumentException("Nama hanya mencakup huruf dan spasi.");
        }
        this.nama = nama;
    }

    public String getNama() {
        return nama;
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