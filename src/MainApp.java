import soal1.MainSoal1;
import soal2.MainSoal2;
import soal3.MainSoal3;
import soal4.MainSoal4;
import soal5.MainSoal5;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("##################################################");
        System.out.println("  TUGAS BESAR & KUIS UTS - PBO (SEMUA NOMOR)");
        System.out.println("##################################################\n");

        // Menjalankan nomor 1
        MainSoal1.main(args);
        System.out.println("\n");

        // Menjalankan nomor 2
        MainSoal2.main(args);
        System.out.println("\n");

        // Menjalankan nomor 3
        MainSoal3.main(args);
        System.out.println("\n");

        // Menjalankan nomor 4
        MainSoal4.main(args);
        System.out.println("\n");

        // Menjalankan nomor 5
        MainSoal5.main(args);
        System.out.println("\n");

        System.out.println("##################################################");
        System.out.println("             SEMUA SOAL TELAH DIJALANKAN          ");
        System.out.println("##################################################");
    }
}
