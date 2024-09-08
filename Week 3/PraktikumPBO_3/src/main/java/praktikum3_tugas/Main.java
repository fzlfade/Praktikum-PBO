/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3_tugas;

/**
 *
 * @author faiza
 */
public class Main {
    public static void main(String[] args) {
        Mobil saya = new Mobil("BMW","M3",2005,"Hitam");
        saya.displayInfo();
        saya.setWarna("Biru");
        saya.displayWarna();
        saya.StartEngine();
         
        System.out.println("\n");
       
        Mobil dia = new Mobil("Mazda","RX-7",2005,"Biru");
        dia.displayInfo();
        dia.setWarna("Putih");
        dia.displayWarna();
        dia.StartEngine();
    }
}
