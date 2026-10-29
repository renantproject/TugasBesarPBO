package soal2;

import java.util.ArrayList;
import java.util.Scanner;

public class MainSoal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Sepeda> listSepeda = new ArrayList<>();

        System.out.println("====================================");
        System.out.println("    INPUT DATA RENTAL SEPEDA (S2)   ");
        System.out.println("====================================");

        while (true) {
            System.out.print("Masukkan Kode Sepeda    : ");
            String kode = scanner.nextLine();
            System.out.print("Masukkan Jenis Sepeda   : ");
            String jenis = scanner.nextLine();
            System.out.print("Masukkan Lama Sewa (Jam): ");
            int lama = Integer.parseInt(scanner.nextLine());
            System.out.print("Masukkan Harga Per Jam  : ");
            double harga = Double.parseDouble(scanner.nextLine());

            listSepeda.add(new Sepeda(kode, jenis, lama, harga));

            System.out.print("Apakah ingin menginput data lain? (y/n): ");
            String lagi = scanner.nextLine();
            if (lagi.equalsIgnoreCase("n")) {
                break;
            }
            System.out.println();
        }

        System.out.println("\n=== DATA RENTAL SEPEDA YANG TELAH DIINPUT ===");
        for (Sepeda s : listSepeda) {
            s.tampilData();
        }
    }
}
