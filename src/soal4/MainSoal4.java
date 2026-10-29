package soal4;

import java.util.ArrayList;
import java.util.Scanner;

public class MainSoal4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pemeriksaan> listPemeriksaan = new ArrayList<>();

        System.out.println("=========================================");
        System.out.println(" INPUT DATA PEMERIKSAAN KLINIK (S4)     ");
        System.out.println("=========================================");

        while (true) {
            System.out.print("Masukkan No Pemeriksaan : ");
            String no = scanner.nextLine();
            System.out.print("Masukkan Nama Pasien    : ");
            String pasien = scanner.nextLine();
            System.out.print("Masukkan Nama Dokter    : ");
            String dokter = scanner.nextLine();
            System.out.print("Masukkan Biaya Periksa  : ");
            double biaya = Double.parseDouble(scanner.nextLine());

            listPemeriksaan.add(new Pemeriksaan(no, pasien, dokter, biaya));

            System.out.print("Apakah ingin menginput data lain? (y/n): ");
            String lagi = scanner.nextLine();
            if (lagi.equalsIgnoreCase("n")) {
                break;
            }
            System.out.println();
        }

        System.out.println("\n=== DATA PEMERIKSAAN PASIEN YANG TELAH DIINPUT ===");
        double totalBiaya = 0;
        for (Pemeriksaan p : listPemeriksaan) {
            p.tampilData();
            totalBiaya += p.hitungTotal();
        }
        System.out.printf("Akumulasi Total Biaya Seluruh Pasien: Rp %,.0f\n", totalBiaya);
    }
}
