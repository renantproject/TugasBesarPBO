package soal5;

public class Tiket {
    private String kodeTiket;
    private String namaFilm;
    private String jenisTiket;
    private double hargaTiket;
    private int jumlahTiket;

    public Tiket(String kodeTiket, String namaFilm, String jenisTiket, double hargaTiket, int jumlahTiket) {
        this.kodeTiket = kodeTiket;
        this.namaFilm = namaFilm;
        this.jenisTiket = jenisTiket;
        this.hargaTiket = hargaTiket;
        this.jumlahTiket = jumlahTiket;
    }

    public double hitungTotal() {
        return this.hargaTiket * this.jumlahTiket;
    }

    public void tampilData() {
        System.out.println("=========================================");
        System.out.println("           STRUK PEMESANAN TIKET         ");
        System.out.println("=========================================");
        System.out.printf("Kode Tiket   : %s\n", kodeTiket);
        System.out.printf("Film         : %s\n", namaFilm);
        System.out.printf("Jenis Tiket  : %s\n", jenisTiket);
        System.out.printf("Harga        : Rp %,.0f\n", hargaTiket);
        System.out.printf("Jumlah       : %d\n", jumlahTiket);
        System.out.println("-----------------------------------------");
        System.out.printf("Total        : Rp %,.0f\n", hitungTotal());
        System.out.println("=========================================\n");
    }
}
