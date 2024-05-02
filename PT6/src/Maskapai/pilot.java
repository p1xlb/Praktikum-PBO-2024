package Maskapai;

import java.util.Arrays;
import java.util.List;

final public class pilot extends karyawan implements Sertifiable {
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
    return Arrays.asList("A320 Series", "B737 Series", "A330", "B777", "GL7T", "G650");
    }

    @Override
    public boolean isRatingValid(String rating) {
        List<String> validRatings = getValidRatings();
        return validRatings.contains(rating);
    }
}