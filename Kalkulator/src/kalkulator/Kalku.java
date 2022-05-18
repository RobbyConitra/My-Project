package kalkulator;

import java.util.Scanner;

public class Kalku {
    
    public void tambah (){
        double a,b;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("---Penjumlahan---");
        System.out.print("Masukkan Angka Pertama : ");
        a = scan.nextDouble();
        System.out.print("Masukkan Angka Kedua : ");
        b = scan.nextDouble();
        System.out.print("Hasil : "+a);
        System.out.println(" + "+b);
        System.out.println("Hasil : "+(a+b));
        
    }
    
    public void kurang (){
        double a,b;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("---Pengurangan---");
        System.out.print("Masukkan Angka Pertama : ");
        a = scan.nextDouble();
        System.out.print("Masukkan Angka Kedua : ");
        b = scan.nextDouble();
        System.out.println("Hasil : "+(a-b));
        
    }
    
    public void kali (){
        double a,b;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("---Perkalian---");
        System.out.print("Masukkan Angka Pertama : ");
        a = scan.nextDouble();
        System.out.print("Masukkan Angka Kedua : ");
        b = scan.nextDouble();
        System.out.println("Hasil : "+(a*b));
        
    }
    
    public void bagi (){
        double a,b;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("---Pembagian---");
        System.out.print("Masukkan Angka Pertama : ");
        a = scan.nextDouble();
        System.out.print("Masukkan Angka Kedua : ");
        b = scan.nextDouble();
        System.out.println("Hasil : "+(a/b));
        
    }
    
    public void kuadrat () {
        double a,b;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("---Kuadrat---");
        System.out.println("Masukkan Angka : ");
        a = scan.nextDouble();
        System.out.println("Hasil : "+(a*a));
    }
}