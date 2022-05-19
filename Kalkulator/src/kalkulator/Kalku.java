package kalkulator;

import java.util.ArrayList;
import java.util.Scanner;

public class Kalku {
    
    public void tambah (){
        Double hasil, a;
        Scanner scan = new Scanner(System.in);
        ArrayList<Double> angka = new ArrayList();
        
        System.out.println("---Penjumlahan---");
        do{
            System.out.print("Masukkan Angka : ");
            a = scan.nextDouble();
            angka.add(a);
        } while (a != 0);
        hasil = 0.0;
        
        for (Double i:angka){
            hasil += i;
        }
        
        System.out.println("Hasil : "+hasil);
    }
    
    public void kurang (){
        Double hasil, a;
        Scanner scan = new Scanner(System.in);
        ArrayList<Double> angka = new ArrayList();
        
        System.out.println("---Pengurangan---");
        do{
            System.out.print("Masukkan Angka : ");
            a = scan.nextDouble();
            angka.add(a);
        } while (a != 0);
        hasil = angka.get(0);
        
        for(int i = 1; i < angka.size();i++){
            hasil = hasil-angka.get(i);
        }
        System.out.println("Hasil : "+hasil);
    }
    
    public void kali (){
        Double hasil, a;
        Scanner scan = new Scanner(System.in);
        ArrayList<Double> angka = new ArrayList();
        
        System.out.println("---Perkalian---");
        do{
            System.out.print("Masukkan Angka : ");
            a = scan.nextDouble();
            angka.add(a);
        } while (a != 0);
        hasil = angka.get(0);
        
        for(int i = 1; i < angka.size();i++){
            if (i != angka.size()-1){
                hasil = hasil*angka.get(i);
            }
        }
        System.out.println("Hasil : "+hasil);
    }
    
    public void bagi (){
        Double hasil, a;
        Scanner scan = new Scanner(System.in);
        ArrayList<Double> angka = new ArrayList();
        
        System.out.println("---Perkalian---");
        do{
            System.out.print("Masukkan Angka : ");
            a = scan.nextDouble();
            angka.add(a);
        } while (a != 0);
        hasil = angka.get(0);
        
        for(int i = 1; i < angka.size();i++){
            if (i != angka.size()-1){
                hasil = hasil/angka.get(i);
            }
        }
        System.out.println("Hasil : "+hasil);
    }
    
    public void kuadrat () {
        double a;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("---Kuadrat---");
        System.out.print("Masukkan Angka : ");
        a = scan.nextDouble();
        System.out.println("Hasil : "+(a*a));
    }
}