package kalkulator;

import java.util.Scanner;

public class Kalkulator {

    public static void main(String[] args) {
        int kode;
        double a,b,c,f,g,h;
        Scanner scan = new Scanner (System.in);
        
        System.out.println("--- Kalkulator ---");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. pembagian");
        System.out.print("Pilihan : ");
        kode = scan.nextInt();
        
        switch(kode){
            case 1 :
                System.out.println("--- Penjumlahan ---");
                System.out.print("Masukkan angka pertama : ");
                a = scan.nextDouble();
                System.out.print("Masukkan angka kedua : ");
                b = scan.nextDouble();
                c = a+b;
                System.out.println("Hasil : "+c);
                break;
            case 2 :
                
                        
        }
        
    }
    
}
