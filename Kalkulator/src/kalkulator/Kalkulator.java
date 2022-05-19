package kalkulator;

import java.util.Scanner;

public class Kalkulator {

    public static void main(String[] args) {
        int kode;
        Scanner scan = new Scanner (System.in);
        Kalku kalku = new Kalku ();
        
        System.out.println("--- Kalkulator ---");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("5. Kuadrat");
        System.out.print("Pilihan : ");
        kode = scan.nextInt();
        
        switch(kode){
            case 1 :
                kalku.tambah();
                break;
            case 2 :
                kalku.kurang();
                break;
            case 3 :
                kalku.kali();
                break;
            case 4 :
                kalku.bagi();
                break;
            case 5 :
                kalku.kuadrat();
                break;
            default : System.out.println("ERROR!!!");
                
        }
        
    }
    
}
