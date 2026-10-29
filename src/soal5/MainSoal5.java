package soal5;

import java.util.ArrayList;
import java.util.Scanner;

public class MainSoal5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Tiket> listTiket = new ArrayList<>();

        System.out.println("=========================================");
        System.out.println(" INPUT DATA TRANSAKSI TIKET BIOSKOP (S5) ");
        System.out.println("=========================================");

        while (true) {
            System.out.print("Masukkan Kode Tiket       : ");
            String kode = scanner.nextLine();
            System.out.print("Masukkan Judul Film       : ");
            String film = scanner.nextLine();
            System.out.print("Masukkan Jenis Tiket      : ");
            String jenis = scanner.nextLine();
            System.out.print("Masukkan Harga Satuan     : ");
            double harga = Double.parseDouble(scanner.nextLine());
            System.out.print("Masukkan Jumlah Pembelian : ");
            int jml = Integer.parseInt(scanner.nextLine());

            listTiket.add(new Tiket(kode, film, jenis, harga, jml));

            System.out.print("Apakah ingin menginput data lain? (y/n): ");
            String lagi = scanner.nextLine();
            if (lagi.equalsIgnoreCase("n")) {
                break;
            }
            System.out.println();
        }

        System.out.println("\n=== DAFTAR TRANSAKSI TIKET YANG TELAH DIINPUT ===");
        double totalPemasukan = 0;
        for (Tiket t : listTiket) {
            t.tampilData();
            totalPemasukan += t.hitungTotal();
        }
        System.out.printf("TOTAL KESELURUHAN TRANSAKSI : Rp %,.0f\n", totalPemasukan);
    }
}
