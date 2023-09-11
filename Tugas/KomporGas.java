package Tugas;

public class KomporGas extends Kompor{
    private String jenisPengaturSuhu;
    private String jenisPiringan;

    public void setJenisPengaturSUhu(String newValue) {
        jenisPengaturSuhu = newValue;
    }

    public void setJenisPiringan(String newValue) {
        jenisPiringan = newValue;
    }

    public void cekKomporGas() {
        super.cekKompor();
        System.out.println("Jenis Pengatur Suhu: "+jenisPengaturSuhu);
        System.out.println("Jenis Piringan: "+jenisPiringan);
        System.out.println("-------------------------------------");
    }
}
