/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author faiza
 */
public class Kendaraan {
    private String nama;
    protected int kecepatanMaks;
    public String jenisMesin;
    
    public Kendaraan(String nama,int kecepatanMaks,String jenisMesin){
    this.nama = nama;
    this.kecepatanMaks = kecepatanMaks;
    this.jenisMesin = jenisMesin;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void tampilkanInfoKendaraan(){
        System.out.println("Nama Kendaraan : "+ nama);
        System.out.println("Kecepatan Maksimum : "+ kecepatanMaks + "KM/H");
        System.out.println("Jenis Mesin : "+ jenisMesin);
    }
    
//    private String merek;
//    private String model;
//    private int tahun;
//
//   public Kendaraan(String merek, String model, int tahun){
//       this.merek = merek;
//       this.model = model;
//       this.tahun = tahun;
//   }
//    
//    public String getMerek() {
//        return merek;
//    }
//
//    public void setMerek(String merek) {
//        this.merek = merek;
//    }
//
//    public String getModel() {
//        return model;
//    }
//
//    public void setModel(String model) {
//        this.model = model;
//    }
//
//    public int getTahun() {
//        return tahun;
//    }
//
//    public void setTahun(int tahun) {
//        this.tahun = tahun;
//    }
}
