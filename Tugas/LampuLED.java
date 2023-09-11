package Tugas;

public class LampuLED extends Lampu{
    private int daya;

    public void setDaya(int newValue) {
        daya = newValue;
    }

    public void cekLampuLED() {
        super.cekLampu();
        System.out.println("Daya: "+daya+" Watt");
    }
}
