package soal1;

import java.util.ArrayList;
import java.util.Scanner;

public class MainSoal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Buku> listBuku = new ArrayList<>();

        System.out.println("====================================");
        System.out.println("   INPUT DATA INVENTARIS BUKU (S1)  ");
        System.out.println("====================================");

        while (true) {
            System.out.print("Masukkan Kode Buku  : ");
            String kode = scanner.nextLine();
            System.out.print("Masukkan Judul Buku : ");
            String judul = scanner.nextLine();
            System.out.print("Masukkan Penulis    : ");
            String penulis = scanner.nextLine();
            System.out.print("Masukkan Harga      : ");
            double harga = Double.parseDouble(scanner.nextLine());

            listBuku.add(new Buku(kode, judul, penulis, harga));

            System.out.print("Apakah ingin menginput data lain? (y/n): ");
            String lagi = scanner.nextLine();
            if (lagi.equalsIgnoreCase("n")) {
                break;
            }
            System.out.println();
        }

        System.out.println("\n=== DATA BUKU YANG TELAH DIINPUT ===");
        for (Buku b : listBuku) {
            b.tampilData();
        }
    }
}
