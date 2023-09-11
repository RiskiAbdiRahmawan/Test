package Tugas;
/**
 * BukuPengunjung
 */

import java.util.*;

public class BukuPengunjung {
    List <Pengunjung> pengunjung = new ArrayList<>();

    public void addGuest(Pengunjung pgj) {
        pengunjung.add(pgj);
    }

    public void checkData() {
        for (int i = 0; i < pengunjung.size(); i++) {
            System.out.println(pengunjung.get(i));
        }
    }
}