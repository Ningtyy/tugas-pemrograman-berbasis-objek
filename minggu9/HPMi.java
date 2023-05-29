/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author D2J-00
 */
public class HPMi implements Phone {
    private int volume;
    private int battery;
    private int pulsa;
    public String name;
    public String number;
    
    public HPMi(){
        this.volume = 99;
        this.battery = 99;
        this.pulsa = 5980;
    }
    
    
        Scanner inp = new Scanner(System.in);
        Map<String, String> contact = new HashMap<>();
    
    @Override
    public void powerOn() {
        System.out.println("Hadphone ON");
    }
    
    @Override
    public void powerOff() {
        System.out.println("Hadphone OFF");
    }
    
    @Override
    public void volumeUp() {
        this.volume ++;
        System.out.println("Volume sekarang: " + this.getVolume());
    }
    
    @Override
    public void volumeDown() {
        this.volume --;
        System.out.println("Volume sekarang: " + this.getVolume());
    }
    
    public int getVolume() {
        return this.volume;
    }
    
    @Override
    public void addContact(){
        
        System.out.print("Masukkan nama kontak: ");
        String name = inp.nextLine();
        
        System.out.print("Masukkan nomor telepon: ");
        String number = inp.nextLine();
        
        addcontact(contact, name, number);
        
        System.out.println("Kontak berhasil ditambahkan.");
    };
    
    @Override
    public void findContact() {
        
        System.out.print("Masukkan nama kontak yang akan dicari: ");
        String cariNama = inp.nextLine();
                    
        String cariNomor = findcontact(contact, cariNama);
        if (cariNomor != null) {
            System.out.println("Nomor telepon " + cariNama + ": " + cariNomor);
        } 
        else {
            System.out.println("Kontak tidak ditemukan.");
        }
        
    };
    
    

    public static void addcontact(Map<String, String> contact, String name, String number) {
        contact.put(name, number);
    }

    public static String findcontact(Map<String, String> contact, String name) {
        return contact.get(name);
    }
    
    @Override
    public void printContact() {
        if (contact.isEmpty()) {
            System.out.println("Tidak ada kontak yang tersimpan.");
        } else {
            System.out.println("Daftar Kontak:");
            for (Map.Entry<String, String> entry : contact.entrySet()) {
                String name = entry.getKey();
                String number = entry.getValue();
                System.out.println(name + ": " + number);
            }
        }
        
    };
    
    @Override
    public void pulsa() {
        System.out.println("Pulsa sekarang: " + this.getPulsa());
    };
    
    @Override
    public void topupPulsa(){
        this.pulsa ++;
        System.out.println("Pulsa sekarang: " + this.getPulsa());
    };
    
    public int getPulsa() {
        return this.pulsa;
    }
    
    @Override
    public void battery(){
        System.out.println("Baterai sekarang: " + this.getBattery());
    };
    
    @Override
    public void chargeBattery(){
        this.battery ++;
        System.out.println("Baterai sekarang: " + this.getBattery());
    };
    
    public int getBattery() {
        return this.battery;
    }
    
}
