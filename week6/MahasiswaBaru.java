/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6;

/**
 *
 * @author D2J-00
 */
public class MahasiswaBaru extends Mahasiswa {
    private String asalSekolah;
    
    public MahasiswaBaru(String nama, String nim, int umur, String asalSekolah){
        super(nama, nim, umur);
        this.asalSekolah = asalSekolah;
    }
   
   public String getAsalSekolah(){
       return this.asalSekolah;
   }
   
   public void setAsalSekolah(String asalSekolah){
       this.asalSekolah = asalSekolah;
   }
   
   public void cetak(){
        System.out.println("Nama Mahasiswa: " + super.getNama());
        System.out.println("NIM Mahasiswa : " + super.getNim());
        System.out.println("Umur Mahasiswa: " + super.getUmur());
        System.out.println("Asal Mahasiswa: " + asalSekolah);
   }
}
