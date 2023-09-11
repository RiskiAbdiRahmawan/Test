package Tugas;

public class KomproListrik extends Kompor{
    private int waktu = 0;
    private int daya;

    public void mengaturWaktu(int newValue) {
        waktu = newValue;
    }

    public void mengaturDaya(int newValue){
        daya = newValue;
    }

    public void cekKomporListrik() {
        super.cekKompor();
        System.out.println("Waktu: "+waktu+" Menit");
        System.out.println("Daya: "+daya+" Watt");
        System.out.println("----------------------------");
    }
}
