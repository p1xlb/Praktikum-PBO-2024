package Maskapai;

public class mekanik extends karyawan {
    private String id_mekanik;
    private String spesialisasi;

    public mekanik(String id_mekanik, String nama, String rating, String spesialisasi) {
        super(nama, rating);
        setId_mekanik(id_mekanik);
        this.spesialisasi = spesialisasi;
    }

    public mekanik(String id_mekanik, String nama, String rating) {
        super(nama, rating);
        setId_mekanik(id_mekanik);
        this.spesialisasi = "General";
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

    public String getSpecialization() {
        return spesialisasi;
    }

    public void setSpecialization(String specialization) {
        this.spesialisasi = spesialisasi;
    }

    @Override
    public String toString() {
        return "ID Mekanik: " + id_mekanik + "\nNama Mekanik: " + getNama() + "\nRating: " + getRating() + "\nSpesialisasi: " + spesialisasi;
    }

}