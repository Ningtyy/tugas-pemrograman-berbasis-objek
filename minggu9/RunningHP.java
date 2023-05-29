/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu9;
import java.util.Scanner;


public class RunningHP {
    public static void main(String [] args){
        int pilih;
        int pilih2;
        Scanner inp = new Scanner(System.in);
        

            HPMi run = new HPMi();

            System.out.print("Masukkan pilihan: ");
            pilih = inp.nextInt();

            if (pilih == 1) {
                run.powerOn();
                do {
                    System.out.print("\n\nPilihan Menu: "
                    + "\n 1. Naikkan volume"
                    + "\n 2. Turunkan volume"
                    + "\n 3. Cek Baterai"
                    + "\n 4. Charge baterai"
                    + "\n 5. Cek pulsa"
                    + "\n 6. Tambah pulsa"
                    + "\n 7. Tambah Kontak"
                    + "\n 8. Cari kontak"
                    + "\n 9. Daftar kontak"
                    + "\n 10. Keluar \n");
                    
                    System.out.print("Masukkan pilihan: ");
                    pilih2 = inp.nextInt();
                    switch (pilih2) {
                        case 1:
                            run.volumeUp();
                            break;
                            
                        case 2:
                            run.volumeDown();
                            break;
  
                        case 3:
                            run.battery();
                            break;
                        
                        case 4:
                            run.chargeBattery();
                            break;
                            
                        case 5:
                            run.pulsa();
                            break;
                            
                        case 6:
                            run.topupPulsa();
                            break;
                            
                        case 7:
                            run.addContact();
                            break;
                            
                        case 8:
                            run.findContact();
                            break;
                            
                        case 9:
                            run.printContact();
                            break;
                            
                        case 10:
                            System.out.println("Terima kasih. Program selesai.");
                            return;
                        
                        default:
                            System.out.print("Pilihan tidak tersedia");
                    }
                } while ((pilih!=0)||(pilih<10));
            }
            
            else {
                run.powerOff();
                System.out.print("Tidak dapat melakukan menu lanjutan karena ponsel mati");
            }
            
            
    }
}
