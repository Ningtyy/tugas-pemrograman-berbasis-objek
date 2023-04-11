/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6;

/**
 *
 * @author D2J-00
 */
public class Mahasiswa {
    private String nama;
    private String nim;
    private int umur;
    
    //constructor
    public Mahasiswa(String nama, String nim, int umur){
        this.nama = nama;
        this.nim = nim;
        this.umur = umur;
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public String getNim(){
        return this.nim;
    }
    
    public int getUmur(){
        return this.umur;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setNim(String nim){
        this.nim = nim;
    }
    
    public void setUmur(int umur){
        this.umur = umur;
    }
    
    
    public void tampilData(){
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Umur: " + umur);
    }
}
