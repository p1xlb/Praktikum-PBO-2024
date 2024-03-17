import java.util.ArrayList;

import Maskapai.pesawat;
import Maskapai.pilot;
import Maskapai.mekanik;

import java.util.Scanner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        ArrayList<pesawat> pesawatList = new ArrayList<pesawat>();
        ArrayList<pilot> pilotList = new ArrayList<pilot>();
        ArrayList<mekanik> mekanikList = new ArrayList<mekanik>();

        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        int pilihan = 0;
        
        while (true) {
            System.out.println("1. Manajemen Pesawat");
            System.out.println("2. Manajemen Pilot");
            System.out.println("3. Manajemen Mekanik");
            System.out.println("4. Keluar");
            System.out.print("Pilihan: ");
            pilihan = Integer.parseInt(br.readLine());

            if(pilihan == 1){
                int pilih1 = 0;
                System.out.println("1. Tambah Pesawat");
                System.out.println("2. Lihat Pesawat");
                System.out.println("3. Ubah data Pesawat");
                System.out.println("4. Hapus Pesawat");
                System.out.println("5. Kembali");
                System.out.print("Pilihan: ");
                pilih1 = Integer.parseInt(br.readLine());

                if(pilih1 == 1){
                    System.out.print("Nomor Registrasi: ");
                    String n_registrasi = br.readLine();
                    System.out.print("Nama Pesawat: ");
                    String nama_pesawat = br.readLine();
                    System.out.print("Status: ");
                    char status = br.readLine().charAt(0);
                    pesawatList.add(new pesawat(n_registrasi, nama_pesawat, status));
                } 
                
                else if(pilih1 == 2){
                    for (pesawat pesawat : pesawatList) {
                        System.out.println("Nomor Registrasi: " + pesawat.getN_registrasi());
                        System.out.println("Nama Pesawat: " + pesawat.getNama_pesawat());
                        System.out.println("Status: " + pesawat.getStatus());
                    }
                } 
                
                else if(pilih1 == 3){
                    System.out.print("Nomor Registrasi: ");
                    String n_registrasi = br.readLine();
                    System.out.print("Nama Pesawat: ");
                    String nama_pesawat = br.readLine();
                    System.out.print("Status (Y/N): ");
                    char status = br.readLine().charAt(0);
                    for (pesawat pesawat : pesawatList) {
                        if(pesawat.getN_registrasi().equals(n_registrasi)){
                            pesawat.setNama_pesawat(nama_pesawat);
                            pesawat.setStatus(status);
                        }
                    }
                } 
                
                else if(pilih1 == 4){
                    System.out.print("Nomor Registrasi: ");
                    String n_registrasi = br.readLine();
                    pesawatList.removeIf(pesawat -> pesawat.getN_registrasi().equals(n_registrasi));

                } 
                
                else if(pilih1 == 5){
                    continue;
                }
            }

            else if(pilihan == 2){
                int pilih2 = 0;
                System.out.println("1. Tambah Pilot");
                System.out.println("2. Lihat Pilot");
                System.out.println("3. Ubah data Pilot");
                System.out.println("4. Hapus Pilot");
                System.out.println("5. Kembali");
                System.out.print("Pilihan: ");
                pilih2 = Integer.parseInt(br.readLine());

                if(pilih2 == 1){
                    String id_pilot = "P" + (pilotList.size() + 1);
                    System.out.print("Nama Pilot: ");
                    String nama_pilot = br.readLine();
                    System.out.print("Rating: ");
                    String rating = br.readLine();
                    pilotList.add(new pilot(id_pilot, nama_pilot, rating));
                } 
                
                else if(pilih2 == 2){
                    for (pilot pilot : pilotList) {
                        System.out.println("ID Pilot: " + pilot.getId_pilot());
                        System.out.println("Nama Pilot: " + pilot.getNama_pilot());
                        System.out.println("Rating: " + pilot.getRating());
                    }
                } 
                
                else if(pilih2 == 3){
                    System.out.print("ID Pilot: ");
                    String id_pilot = br.readLine();
                    System.out.print("Nama Pilot: ");
                    String nama_pilot = br.readLine();
                    System.out.print("Rating: ");
                    String rating = br.readLine();
                    for (pilot pilot : pilotList) {
                        if(pilot.getId_pilot().equals(id_pilot)){
                            pilot.setNama_pilot(nama_pilot);
                            pilot.setRating(rating);
                        }
                    }
                } 
                
                else if(pilih2 == 4){
                    System.out.print("ID Pilot: ");
                    String id_pilot = br.readLine();
                    pilotList.removeIf(pilot -> pilot.getId_pilot().equals(id_pilot));
                } 
                
                else if(pilih2 == 5){
                    continue;
                }
            }

            else if(pilihan == 3){
                int pilih3 = 0;
                System.out.println("1. Tambah Mekanik");
                System.out.println("2. Lihat Mekanik");
                System.out.println("3. Ubah data Mekanik");
                System.out.println("4. Hapus Mekanik");
                System.out.println("5. Kembali");
                System.out.print("Pilihan: ");
                pilih3 = Integer.parseInt(br.readLine());

                if(pilih3 == 1){
                    String id_mekanik = "P" + (mekanikList.size() + 1);
                    System.out.print("Nama Mekanik: ");
                    String nama_mekanik = br.readLine();
                    System.out.print("Rating: ");
                    String rating = br.readLine();
                    mekanikList.add(new mekanik(id_mekanik, nama_mekanik, rating));
                } 
                
                else if(pilih3 == 2){
                    for (mekanik mekanik : mekanikList) {
                        System.out.println("ID Mekanik: " + mekanik.getId_mekanik());
                        System.out.println("Nama Mekanik: " + mekanik.getNama_mekanik());
                        System.out.println("Rating: " + mekanik.getRating());
                    }
                } 
                
                else if(pilih3 == 3){
                    System.out.print("ID Mekanik: ");
                    String id_mekanik = br.readLine();
                    System.out.print("Nama Mekanik: ");
                    String nama_mekanik = br.readLine();
                    System.out.print("Rating: ");
                    String rating = br.readLine();
                    for (mekanik mekanik : mekanikList) {
                        if(mekanik.getId_mekanik().equals(id_mekanik)){
                            mekanik.setNama_mekanik(nama_mekanik);
                            mekanik.setRating(rating);
                        }
                    }
                } 
                
                else if(pilih3 == 4){
                    System.out.print("ID Mekanik: ");
                    String id_mekanik = br.readLine();
                    mekanikList.removeIf(mekanik -> mekanik.getId_mekanik().equals(id_mekanik));
                } 
                else if(pilih3 == 5){
                    continue;
                }
            
            } else if(pilihan == 4){
                break;
            
        }
    }
}
}
