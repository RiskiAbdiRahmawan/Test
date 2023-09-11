package Tugas;
import java.util.*;

public class PengunjungDemo {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Scanner h = new Scanner(System.in);
        BukuPengunjung book = new BukuPengunjung();
        while (true) {
            System.out.println("1. Memasukkan Data");
            System.out.println("2. Cek Data");
            System.out.println("3. Keluar");
            System.out.println("Pilihan: ");
            int choice = a.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Masukkan Nama: ");
                    String name = h.nextLine();
                    System.out.println("Masukkan Alamat: ");
                    String address = h.nextLine();
                    System.out.println("Masukkan NO HP: ");
                    String numberPhone = h.nextLine();

                    Pengunjung pgj = new Pengunjung(name, address, numberPhone);
                    book.addGuest(pgj);
                    break;
                case 2:
                    book.checkData();
                    break;
                case 3:
                    System.exit(0);
                default:
                    break;
            }
        }
        // Pengunjung pjg = new Pengunjung();
        // Pemilik pm = new Pemilik();
        // Pengunjung pgj1 = new Pengunjung("Mahi", "Jln Kembang Kerta", "083xxx");
        // Pengunjung pgj2 = new Pengunjung("Mahi", "Jln Kembang Kerta", "083xxx");
        // Pengunjung pm1 = new Pengunjung("Mahi", "Jln Kembang Kerta", "083xxx");
        // // pjg.memasukkanData(pgj1);
        // // pjg.memasukkanData(pgj2);
        // // pjg.melihatData();
        // pm.memasukkanData(pm1);
        // pm.melihatData();
    }
}
