package Tugas;

public class Kompor {
    public String merek;
    public String warna;
    public String jenisBahan;
    public int suhu;
    public String status;

    public void setMerek(String newValue) {
        merek = newValue;
    }

    public void setWarna(String newValue) {
        warna = newValue;
    }

    public void setJenisBahan(String newValue) {
        jenisBahan = newValue;
    }


    public void Menyala(int newValue) {
        status = "Menyala";
        suhu = newValue;
    }

    public void Mati() {
        status = "Mati";
        suhu = 0;
    }

    public void memperbesarSuhu(int newValue){
        suhu = suhu + newValue;
    }

    public void memperkecilSuhu(int newValue) {
        suhu = suhu - newValue;
    }

    public void cekKompor() {
        System.out.println("Merek: "+merek);
        System.out.println("Warna: "+warna);
        System.out.println("Jenis Bahan: "+jenisBahan);
        System.out.println("Kondisi: "+status);
        System.out.println("Suhu: "+suhu);
        System.out.println("------------------------------------");
    }
}
