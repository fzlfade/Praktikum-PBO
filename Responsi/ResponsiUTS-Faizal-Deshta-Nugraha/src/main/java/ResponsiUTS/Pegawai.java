/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResponsiUTS;

/**
 *
 * @author faiza
 */
public class Pegawai {
    private String namaPegawai;
    private int gaji;
    
   public Pegawai(String namaPegawai,int gaji){
   this.namaPegawai = namaPegawai;
   this.gaji = gaji;
   }
    
    public String getNamaPegawai() {
        return namaPegawai;
    }

    /**
     * @param namaPegawai the namaPegawai to set
     */
    public void setNamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }

    /**
     * @return the gaji
     */
    public int getGaji() {
        return gaji;
    }

    /**
     * @param gaji the gaji to set
     */
    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
    
        public void tampilkanInfo(){
        System.out.println("Nama Produk : " + namaPegawai+"\nHarga Produk : " + gaji);
    };
}
