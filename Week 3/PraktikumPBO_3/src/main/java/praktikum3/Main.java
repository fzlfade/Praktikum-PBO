/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author faiza
 */
public class Main {
    public static void main(String[] args) {
        Hewan kucing = new Hewan("Kucing",1);
        kucing.info();
        kucing.suara();
        
        Hewan babi = new Hewan("Babi",1);
        babi.info();
        babi.berlari();
    }
}
