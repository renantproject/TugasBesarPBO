package soal1;

public class Buku {
   
    String kodeBuku;
    String judul;
    String penulis;
    double harga;

    public Buku(String kodeBuku, String judul, String penulis, double harga) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.penulis = penulis;
        this.harga = harga;
    }

    public void tampilData() {
        System.out.println("Kode Buku : " + kodeBuku);
        System.out.println("Judul     : " + judul);
        System.out.println("Penulis   : " + penulis);
        System.out.printf("Harga     : Rp %,.0f\n", harga);
        System.out.println("------------------------------------");
    }
}
