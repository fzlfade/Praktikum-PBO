/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResponsiUTS;

import java.util.Date;

/**
 *
 * @author faiza
 */
public class Main {
    public static void main(String[] args) {
        Produk p1 = new Elektronik("Laptop", 12000000, 2);
        Produk p2 = new Makanan("Roti", 15000, new Date());

        Pegawai peg1 = new PegawaiTetap("Faizal", 6000000, 1000000);
        Pegawai peg2 = new PegawaiKontrak("Rio", 4000000, 12);

        p1.tampilkanInfo();
        System.out.println("\n");
        p2.tampilkanInfo();
        System.out.println("\n");
        
        peg1.tampilkanInfo();
        System.out.println("\n");
        peg2.tampilkanInfo();
    }
}

