/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;
import java.util.ArrayList;
import java.util.List;

// Kelas abstrak Produk
abstract class Produk {
    protected String nama;
    protected double harga;

    public Produk(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // Metode abstrak untuk menghitung diskon
    public abstract double hitungDiskon();

    // Getter untuk harga setelah diskon
    public double getHargaSetelahDiskon() {
        return harga - hitungDiskon();
    }

    @Override
    public String toString() {
        return nama + " - Harga: " + harga + " - Diskon: " + hitungDiskon();
    }
}

// Kelas Buku
class Buku extends Produk {
    public Buku(String nama, double harga) {
        super(nama, harga);
    }

    @Override
    public double hitungDiskon() {
        // Diskon 10% untuk buku
        return harga * 0.10;
    }
}

// Kelas Elektronik
class Elektronik extends Produk {
    public Elektronik(String nama, double harga) {
        super(nama, harga);
    }

    @Override
    public double hitungDiskon() {
        // Diskon 15% untuk elektronik
        return harga * 0.15;
    }
}

// Kelas Pakaian
class Pakaian extends Produk {
    public Pakaian(String nama, double harga) {
        super(nama, harga);
    }

    @Override
    public double hitungDiskon() {
        // Diskon 5% untuk pakaian
        return harga * 0.05;
    }
}

// Kelas KeranjangBelanja
class KeranjangBelanja {
    private List<Produk> daftarProduk;

    public KeranjangBelanja() {
        daftarProduk = new ArrayList<>();
    }

    // Menambah produk ke keranjang
    public void tambahProduk(Produk produk) {
        daftarProduk.add(produk);
    }

    // Menghitung total harga setelah diskon
    public double hitungTotalHargaSetelahDiskon() {
        double total = 0;
        for (Produk produk : daftarProduk) {
            total += produk.getHargaSetelahDiskon();
        }
        return total;
    }

    // Menampilkan produk dalam keranjang
    public void tampilkanProduk() {
        for (Produk produk : daftarProduk) {
            System.out.println(produk);
        }
    }
}

// Main class untuk demo
public class Main {
    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja();

        // Tambah produk ke keranjang
        keranjang.tambahProduk(new Buku("Buku Pemrograman Java", 100000));
        keranjang.tambahProduk(new Elektronik("Smartphone", 2000000));
        keranjang.tambahProduk(new Pakaian("Kemeja", 250000));

        // Tampilkan produk dalam keranjang
        keranjang.tampilkanProduk();

        // Hitung total harga setelah diskon
        double totalHarga = keranjang.hitungTotalHargaSetelahDiskon();
        System.out.println("Total harga setelah diskon: " + totalHarga);
    }
}
