/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal10;

/**
 *
 * @author faiza
 */
public class Main {
    public static void main(String[] args) {
        Pembayaran elektronik = new Elektronik();
        System.out.println("Pajak Elektronik Sebesar : "+elektronik.hitungPajak(100000));
        
        Pembayaran makanan = new Makanan();
        System.out.println("Pajak Makanan Sebesar : "+makanan.hitungPajak(10000));
    }
}
