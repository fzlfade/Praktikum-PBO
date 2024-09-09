/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author faiza
 */
public class Mobil extends Kendaraan {
    
    private int jumlahPintu;
    
    public Mobil(String nama, int kecepatanMaks, String jenisMesin,int jumlahPintu) {
        super(nama, kecepatanMaks, jenisMesin);
        this.jumlahPintu = jumlahPintu;
    }
    
    public void tampilkanInfoMobil(){
        System.out.println("Kecepatan Maks Mobil : "+ kecepatanMaks + "KM/H");
        System.out.println("Jumlah Pintu : "+ jumlahPintu);
    }
    
}
