package Maskapai;

public class pesawat {
    String n_registrasi;
    String nama_pesawat;
    char status;

    public pesawat(String n_registrasi, String nama_pesawat, char status) {
        this.n_registrasi = n_registrasi;
        this.nama_pesawat = nama_pesawat;
        this.status = status;
    }

    public void setN_registrasi(String n_registrasi) {
        this.n_registrasi = n_registrasi;
    }

    public String getN_registrasi() {
        return n_registrasi;
    }

    public void setNama_pesawat(String nama_pesawat) {
        this.nama_pesawat = nama_pesawat;
    }

    public String getNama_pesawat() {
        return nama_pesawat;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public char getStatus() {
        return status;
    }
}


