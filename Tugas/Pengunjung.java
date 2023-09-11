package Tugas;
import java.util.*;

public class Pengunjung {
   private String nama;
   private String alamat;
   private String nohp;

   Pengunjung(String nama, String alamat, String nohp){
      this.nama =nama;
      this.alamat = alamat;
      this.nohp = nohp;
   }

   Pengunjung(){

   }

   public String getNama() {
      return nama;
   }

   public String getAlamat() {
      return alamat;
   }

   public String getNoHP() {
      return nohp;
   }

   public String toString() {
      return "Nama: "+nama+"\n" + "Alamat: "+alamat+"\n"+"No HP: "+nohp+"\n"+"-------------------------";
   }

}
