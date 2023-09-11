package Tugas;

public class Lampu {
    private String merek;
    private String warnaCahaya;
    private String bentuk;
    private String kondisi;

    public void setMerek(String newValue) {
        merek = newValue;
    }

    public void setWarnaCahaya(String newValue) {
        warnaCahaya = newValue;
    }

    public void setBentuk(String newValue) {
        bentuk = newValue;
    }

    public void menyala() {
        kondisi = "Menyala";
    }

    public void mati() {
        kondisi = "Mati";
    }

    public void cekLampu() {
        System.out.println("Merek: "+merek);
        System.out.println("Warna Cahaya: "+warnaCahaya);
        System.out.println("Bentuk: "+bentuk);
        System.out.println("Kondisi: "+kondisi);
    }
}
