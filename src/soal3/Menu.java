package soal3;

public class Menu {
    private String kodeMenu;
    private String namaMenu;
    private double harga;
    private String kategori;

    // Constructor 1: Tanpa parameter (dipakai saat membuat slot menu baru untuk Tambah Menu)
    public Menu() {
        this.kodeMenu = "-";
        this.namaMenu = "-";
        this.harga = 0.0;
        this.kategori = "-";
    }

    // Constructor 2: Dengan parameter lengkap (dipakai untuk inisialisasi katalog / pesanan)
    public Menu(String kodeMenu, String namaMenu, double harga, String kategori) {
        this.kodeMenu = kodeMenu;
        this.namaMenu = namaMenu;
        this.harga = harga;
        this.kategori = kategori;
    }

   
    public String getKodeMenu() {
        return kodeMenu;
    }

    public void setKodeMenu(String kodeMenu) {
        this.kodeMenu = kodeMenu;
    }

    public String getNamaMenu() {
        return namaMenu;
    }

    public void setNamaMenu(String namaMenu) {
        this.namaMenu = namaMenu;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    // Method non-void kalkulasi sesuai class diagram
    public double hitungHarga(int jml) {
        return this.harga * jml;
    }

    // Method void menampilkan info menu
    public void tampilMenu() {
        System.out.println("Kode     : " + kodeMenu);
        System.out.println("Nama     : " + namaMenu);
        System.out.printf("Harga    : Rp %,.0f\n", harga);
        System.out.println("Kategori : " + kategori);
        System.out.println("------------------------------------");
    }
}