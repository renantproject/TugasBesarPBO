package soal3;

import java.util.ArrayList;
import java.util.Scanner;

public class MainSoal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Daftar menu katalog kafe
        ArrayList<Menu> daftarKatalog = new ArrayList<>();

        // Inisialisasi awal katalog menggunakan Constructor 2 (dengan parameter)
        daftarKatalog.add(new Menu("M01", "Nasi Goreng", 18000, "Makanan"));
        daftarKatalog.add(new Menu("M02", "Mie Goreng Spesial", 16000, "Makanan"));
        daftarKatalog.add(new Menu("B01", "Es Teh Manis", 5000, "Minuman"));

        boolean berjalan = true;

        while (berjalan) {
            System.out.println("\n====================================");
            System.out.println("        SISTEM KASIR KAFE (S3)      ");
            System.out.println("====================================");
            System.out.println("1. Tampilkan Daftar Menu");
            System.out.println("2. Tambah Menu Baru");
            System.out.println("3. Hapus Menu");
            System.out.println("4. Buat Pesanan Kasir");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi (1-5): ");

            String pilihan = scanner.nextLine();
            System.out.println();

            switch (pilihan) {
                case "1":
                    // 1. TAMPILKAN MENU
                    System.out.println("=== DAFTAR MENU KAFE ===");
                    if (daftarKatalog.isEmpty()) {
                        System.out.println("Daftar menu masih kosong.");
                    } else {
                        for (Menu m : daftarKatalog) {
                            m.tampilMenu();
                        }
                    }
                    break;

                case "2":
                    // 2. TAMBAH MENU
                    System.out.println("=== TAMBAH MENU BARU ===");
                    
                    
                    Menu menuBaru = new Menu();

                    System.out.print("Masukkan Kode Menu    : ");
                    menuBaru.setKodeMenu(scanner.nextLine());

                    System.out.print("Masukkan Nama Menu    : ");
                    menuBaru.setNamaMenu(scanner.nextLine());

                    while (true) {
                        System.out.print("Masukkan Harga Satuan : ");
                        try {
                            double harga = Double.parseDouble(scanner.nextLine());
                            menuBaru.setHarga(harga);
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println(">> Peringatan: Harga harus berupa angka!");
                        }
                    }

                    System.out.print("Masukkan Kategori     : ");
                    menuBaru.setKategori(scanner.nextLine());

                    daftarKatalog.add(menuBaru);
                    System.out.println(">> Menu baru berhasil ditambahkan!");
                    break;

                case "3":
                    // 3. HAPUS MENU
                    System.out.println("=== HAPUS MENU ===");
                    if (daftarKatalog.isEmpty()) {
                        System.out.println("Tidak ada menu yang dapat dihapus.");
                        break;
                    }

                    System.out.print("Masukkan Kode Menu yang ingin dihapus: ");
                    String kodeHapus = scanner.nextLine();
                    boolean ditemukanHapus = false;

                    for (int i = 0; i < daftarKatalog.size(); i++) {
                        if (daftarKatalog.get(i).getKodeMenu().equalsIgnoreCase(kodeHapus)) {
                            daftarKatalog.remove(i);
                            ditemukanHapus = true;
                            System.out.println(">> Menu dengan kode '" + kodeHapus + "' berhasil dihapus!");
                            break;
                        }
                    }

                    if (!ditemukanHapus) {
                        System.out.println(">> Menu dengan kode tersebut tidak ditemukan.");
                    }
                    break;

                case "4":
                    // 4. BUAT PESANAN
                    System.out.println("=== TRANSAKSI PEMESANAN KASIR ===");
                    if (daftarKatalog.isEmpty()) {
                        System.out.println("Belum ada menu yang tersedia. Tambahkan menu terlebih dahulu.");
                        break;
                    }

                    while (true) {
                        System.out.print("Masukkan Kode Menu yang dipesan: ");
                        String kodeCari = scanner.nextLine();
                        Menu menuDipilih = null;

                        for (Menu m : daftarKatalog) {
                            if (m.getKodeMenu().equalsIgnoreCase(kodeCari)) {
                                menuDipilih = m;
                                break;
                            }
                        }

                        if (menuDipilih == null) {
                            System.out.println(">> Kode menu tidak ditemukan. Silakan cek menu kembali.");
                        } else {
                            int jmlPesan = 0;
                            while (true) {
                                System.out.print("Masukkan Jumlah Pesanan: ");
                                try {
                                    jmlPesan = Integer.parseInt(scanner.nextLine());
                                    if (jmlPesan <= 0) {
                                        System.out.println(">> Jumlah pesanan minimal 1!");
                                        continue;
                                    }
                                    break;
                                } catch (NumberFormatException e) {
                                    System.out.println(">> Peringatan: Jumlah harus berupa angka bulat!");
                                }
                            }

                            
                            System.out.println("\n--- STRUK KASIR ---");
                            System.out.println("Kode     : " + menuDipilih.getKodeMenu());
                            System.out.println("Nama     : " + menuDipilih.getNamaMenu());
                            System.out.printf("Harga    : Rp %,.0f\n", menuDipilih.getHarga());
                            System.out.println("Jumlah   : " + jmlPesan );
                            System.out.printf("Total    : Rp %,.0f \n", menuDipilih.hitungHarga(jmlPesan));
                            System.out.println("-------------------");
                        }

                        System.out.print("\nApakah ingin membuat pesanan lain? (y/n): ");
                        String lagi = scanner.nextLine();
                        if (lagi.equalsIgnoreCase("n")) {
                            break;
                        }
                        System.out.println();
                    }
                    break;

                case "5":
                    // 5. KELUAR
                    berjalan = false;
                    System.out.println("Terima kasih telah menggunakan sistem kasir.");
                    break;

                default:
                    System.out.println(">> Pilihan tidak valid, silakan masukkan angka 1 sampai 5.");
                    break;
            }
        }
    }
}