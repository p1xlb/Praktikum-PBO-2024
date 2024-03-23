import java.util.ArrayList;

import Maskapai.pesawat;
import Maskapai.pilot;
import Maskapai.mekanik;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class App {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int readIntInput(String prompt) {
        int input = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print(prompt);
            try {
                input = Integer.parseInt(br.readLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid. Masukkan angka yang benar.");
            } catch (IOException e) {
                System.out.println("Terjadi kesalahan saat membaca input.");
                e.printStackTrace();
            }
        }

        return input;
    }


    public static void main(String[] args) throws IOException {
        ArrayList<pesawat> pesawatList = new ArrayList<pesawat>();
        ArrayList<pilot> pilotList = new ArrayList<pilot>();
        ArrayList<mekanik> mekanikList = new ArrayList<mekanik>();

        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        pesawatList.add(new pesawat("PK-PKL", "Airbus A321-200", 'Y'));
        pesawatList.add(new pesawat("PK-PKM", "Bombardier Global 7500", 'Y'));
        pesawatList.add(new pesawat("PK-PKN", "Airbus A320-200", 'Y'));
        pesawatList.add(new pesawat("PK-PKO", "Cessna Citation X", 'N'));

        pilotList.add(new pilot("P1", "Ujang P", "A320 Series"));
        pilotList.add(new pilot("P2", "Ucok P", "A320 Series"));
        pilotList.add(new pilot("P3", "Udin P", "A320 Series"));
        pilotList.add(new pilot("P4", "Fahri P", "Global 7500"));
        pilotList.add(new pilot("P5", "Fajar P", "Global 7500"));
        pilotList.add(new pilot("P6", "Fadli P", "Citation"));

        mekanikList.add(new mekanik("M1", "Ujang M", "A320 Series"));
        mekanikList.add(new mekanik("M2", "Ucok M", "A320 Series"));
        mekanikList.add(new mekanik("M3", "Udin M", "Global 7500"));
        mekanikList.add(new mekanik("M4", "Fahri M", "Citation"));

        int pilihan = 0;
        
        while (true) {
            System.out.println("1. Manajemen Pesawat");
            System.out.println("2. Manajemen Pilot");
            System.out.println("3. Manajemen Mekanik");
            System.out.println("4. Keluar");
            pilihan = readIntInput("Pilihan : ");

            if(pilihan == 1){
                int pilih1 = 0;
                while (true){
                    System.out.println("1. Tambah Pesawat");
                    System.out.println("2. Lihat Pesawat");
                    System.out.println("3. Ubah data Pesawat");
                    System.out.println("4. Hapus Pesawat");
                    System.out.println("5. Kembali");
                    pilih1 = readIntInput("Pilihan : ");

                    if(pilih1 == 1){
                        System.out.print("Nomor Registrasi: ");
                        String n_registrasi = br.readLine();
                        System.out.print("Nama Pesawat: ");
                        String nama_pesawat = br.readLine();
                        System.out.print("Status (Y/N): ");
                        char status = br.readLine().charAt(0);
                        pesawatList.add(new pesawat(n_registrasi, nama_pesawat, status));
                        System.out.println("Data Pesawat berhasil ditambahkan");
                    } 

                    else if(pilih1 == 2){
                        for (pesawat pesawat : pesawatList) {
                            System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
                            System.out.println("Nomor Registrasi: " + pesawat.getN_registrasi());
                            System.out.println("Nama Pesawat: " + pesawat.getNama_pesawat());
                            System.out.println("Status: " + pesawat.getStatus());
                            System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
                        }
                    } 

                    else if(pilih1 == 3){
                        System.out.print("Nomor Registrasi: ");
                        String n_registrasi = br.readLine();
                        boolean found = false;
                        for (pesawat pesawat : pesawatList) {
                            if(pesawat.getN_registrasi().equals(n_registrasi)){
                                System.out.print("Nama Pesawat: ");
                                String nama_pesawat = br.readLine();
                                System.out.print("Status (Y/N): ");
                                char status = br.readLine().charAt(0);
                                pesawat.setNama_pesawat(nama_pesawat);
                                pesawat.setStatus(status);
                                System.out.println("Data Pesawat berhasil diubah");
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Data tidak ditemukan");
                        }
                    } 

                    else if(pilih1 == 4){
                        System.out.print("Nomor Registrasi: ");
                        String n_registrasi = br.readLine();
                        boolean found = false;
                        for (pesawat pesawat : pesawatList) {
                            if (pesawat.getN_registrasi().equals(n_registrasi)) {
                                pesawatList.removeIf(p -> p.getN_registrasi().equals(n_registrasi));
                                System.out.println("Data Pesawat berhasil dihapus");
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Data tidak ditemukan");
                        }

                    } 

                    else if(pilih1 == 5){
                        break;
                    }

                    else {
                        System.out.println("Pilihan tidak valid");
                        continue;
                    }
            }
            }

            else if(pilihan == 2){
                int pilih2 = 0;
                while (true){
                    System.out.println("1. Tambah Pilot");
                    System.out.println("2. Lihat Pilot");
                    System.out.println("3. Ubah data Pilot");
                    System.out.println("4. Hapus Pilot");
                    System.out.println("5. Kembali");
                    pilih2 = readIntInput("Pilihan : ");

                    if(pilih2 == 1){
                        String id_pilot = "P" + (pilotList.size() + 1);
                        System.out.print("Nama Pilot: ");
                        String nama_pilot = br.readLine();
                        System.out.print("Rating: ");
                        String rating = br.readLine();
                        try {
                            pilotList.add(new pilot(id_pilot, nama_pilot, rating));
                        } catch (IllegalArgumentException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        System.out.println("Data Pilot berhasil ditambahkan");
                    } 

                    else if(pilih2 == 2){
                        for (pilot pilot : pilotList) {
                            System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
                            System.out.println("ID Pilot: " + pilot.getId_pilot());
                            System.out.println("Nama Pilot: " + pilot.getNama());
                            System.out.println("Rating: " + pilot.getRating());
                            System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
                        }
                    } 

                    else if(pilih2 == 3){
                        System.out.print("ID Pilot: ");
                        String id_pilot = br.readLine();
                        boolean found = false;
                        for (pilot pilot : pilotList) {
                            if(pilot.getId_pilot().equals(id_pilot)){
                                System.out.print("Nama Pilot: ");
                                String nama_pilot = br.readLine();
                                System.out.print("Rating: ");
                                String rating = br.readLine();
                                try {
                                    pilot.setNama(nama_pilot);
                                    pilot.setRating(rating);
                                } catch (IllegalArgumentException e) {
                                    System.out.println("Error: " + e.getMessage());
                                }
                                System.out.println("Data Pilot berhasil diubah");
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Data tidak ditemukan");
                        }
                    } 

                    else if(pilih2 == 4){
                        System.out.print("ID Pilot: ");
                        String id_pilot = br.readLine();
                        boolean found = false;
                        for (pilot pilot : pilotList) {
                            if (pilot.getId_pilot().equals(id_pilot)) {
                                pilotList.removeIf(p -> p.getId_pilot().equals(id_pilot));
                                System.out.println("Data Pilot berhasil dihapus");
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Data tidak ditemukan");
                        }

                    } 

                    else if(pilih2 == 5){
                        break;
                    }

                    else {
                        System.out.println("Pilihan tidak valid");
                    }
                }
            }

            else if(pilihan == 3){
                int pilih3 = 0;
                while (true){
                    System.out.println("1. Tambah Mekanik");
                    System.out.println("2. Lihat Mekanik");
                    System.out.println("3. Ubah data Mekanik");
                    System.out.println("4. Hapus Mekanik");
                    System.out.println("5. Kembali");
                    pilih3 = readIntInput("Pilihan : ");

                    if(pilih3 == 1){
                        String id_mekanik = "M" + (mekanikList.size() + 1);
                        System.out.print("Nama Mekanik: ");
                        String nama_mekanik = br.readLine();
                        System.out.print("Rating: ");
                        String rating = br.readLine();
                        try {
                            mekanikList.add(new mekanik(id_mekanik, nama_mekanik, rating));
                        } catch (IllegalArgumentException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        System.out.println("Data Mekanik berhasil ditambahkan");
                    } 

                    else if(pilih3 == 2){
                        for (mekanik mekanik : mekanikList) {
                            System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
                            System.out.println("ID Mekanik: " + mekanik.getId_mekanik());
                            System.out.println("Nama Mekanik: " + mekanik.getNama());
                            System.out.println("Rating: " + mekanik.getRating());
                            System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
                        }
                    }

                    else if(pilih3 == 3){
                        System.out.print("ID Mekanik: ");
                        String id_mekanik = br.readLine();
                        boolean found = false;
                        for (mekanik mekanik : mekanikList) {
                            if(mekanik.getId_mekanik().equals(id_mekanik)){
                                System.out.print("Nama Mekanik: ");
                                String nama_mekanik = br.readLine();
                                System.out.print("Rating: ");
                                String rating = br.readLine();
                                try {
                                    mekanik.setNama(nama_mekanik);
                                    mekanik.setRating(rating);
                                } catch (IllegalArgumentException e) {
                                    System.out.println("Error: " + e.getMessage());
                                }
                                System.out.println("Data Mekanik berhasil diubah");
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Data tidak ditemukan");
                        }
                    } 

                    else if(pilih3 == 4){
                        System.out.print("ID Mekanik: ");
                        String id_mekanik = br.readLine();
                        boolean found = false;
                        for (mekanik mekanik : mekanikList) {
                            if (mekanik.getId_mekanik().equals(id_mekanik)) {
                                mekanikList.removeIf(m -> m.getId_mekanik().equals(id_mekanik));
                                System.out.println("Data Mekanik berhasil dihapus");
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Data tidak ditemukan");
                        }
                    } 
                    else if(pilih3 == 5){
                        break;
                    }

                    else {
                        System.out.println("Pilihan tidak valid");
                    }
                }
            } 
            
            else if(pilihan == 4){
                break;
            }

            else {
                System.out.println("Pilihan tidak valid");
            }
    }
}
}
