package Tugas;

public class Setrika {
    private String merek;
    private String warna;
    private String kondisi;
    private int suhu;

    public void setMerek(String newValue) {
        merek = newValue;
    }

    public void setWarna(String newValue) {
        warna = newValue;
    }

    public void menyala(int newValue) {
        kondisi = "Menyala";
        suhu = newValue;
    }

    public void mati() {
        kondisi = "Mati";
        suhu = 0;
    }

    public void menambahSuhu(int newValue) {
        suhu = suhu + newValue;
    }

    public void mengurangiSuhu(int newValue) {
        suhu = suhu - newValue;
    }

    public void cekSetrika() {
        System.out.println("Merek: "+merek);
        System.out.println("Warna: "+warna);
        System.out.println("Kondisi: "+kondisi);
        System.out.println("Suhu: "+suhu);
        System.out.println("---------------");
    }
}
