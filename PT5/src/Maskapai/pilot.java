package Maskapai;

final public class pilot extends karyawan {
    private String id_pilot;
    private int flightHour;

    public pilot(String id_pilot, String nama, String rating, int flightHour) {
        super(nama, rating);
        setId_pilot(id_pilot);
        this.flightHour = flightHour;
    }

    public void setId_pilot(String id_pilot) {
        if (id_pilot == null || id_pilot.isEmpty()) {
            throw new IllegalArgumentException("ID pilot tidak bisa kosong.");
        }
        if (!id_pilot.startsWith("P")) {
            throw new IllegalArgumentException("ID pilot harus diawali dengan 'P'.");
        }
        this.id_pilot = id_pilot;
    }

    public String getId_pilot() {
        return id_pilot;
    }

    public int getFlightHour() {
        return flightHour;
    }

    public void setFlightHour(int flightHour) {
        this.flightHour = flightHour;
    }

    @Override
    public final String getDetails() {
        return "ID Pilot: " + id_pilot + "\nNama Pilot: " + getNama() + "\nRating: " + getRating() + "\nFlight Hour: " + flightHour;
    }

}