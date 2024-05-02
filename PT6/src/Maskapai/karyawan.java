package Maskapai;

abstract public class karyawan {
    private final String nama;
    private String rating;

    public karyawan(String nama, String rating) {
        if (nama == null || nama.isEmpty()) {
            throw new IllegalArgumentException("Nama tidak bisa kosong.");
        }
        nama = nama.trim();
        if (!nama.matches("[a-zA-Z ]+")) {
            throw new IllegalArgumentException("Nama hanya mencakup huruf dan spasi.");
        }
        this.nama = nama;
        setRating(rating);
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

    public abstract String getDetails();
}