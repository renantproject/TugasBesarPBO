package soal4;

public class Pemeriksaan {
    private String noPemeriksaan;
    private String namaPasien;
    private String namaDokter;
    private double biayaPemeriksaan;

    public Pemeriksaan(String noPemeriksaan, String namaPasien, String namaDokter, double biayaPemeriksaan) {
        this.noPemeriksaan = noPemeriksaan;
        this.namaPasien = namaPasien;
        this.namaDokter = namaDokter;
        this.biayaPemeriksaan = biayaPemeriksaan;
    }

    public double hitungTotal() {
        return this.biayaPemeriksaan;
    }

    public void tampilData() {
        System.out.println("No Pemeriksaan : " + noPemeriksaan);
        System.out.println("Nama Pasien    : " + namaPasien);
        System.out.println("Nama Dokter    : " + namaDokter);
        System.out.printf("Biaya Medis    : Rp %,.0f\n", biayaPemeriksaan);
        System.out.printf("Total Biaya    : Rp %,.0f\n", hitungTotal());
        System.out.println("-----------------------------------------");
    }
}
