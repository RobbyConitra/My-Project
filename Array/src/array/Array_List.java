package array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class Array_List {
    public static void main(String[] args) {
        
        Scanner age = new Scanner(System.in);
        ArrayList<String> nm = new ArrayList<>();
        int tot = 0, total = 0;
        double rerata;
        
        nm.add("Yodi");
        nm.add(0, "Budi");
        nm.add(2, "Doni");
        nm.add("Delvin");
        
        nm.remove(1);
        nm.remove("Doni");
        System.out.println("isi arl : "+nm);
        System.out.println(" ");
        
        for(String i:nm){
            System.out.println(i);
        }
        System.out.println(" ");
        
        Iterator<String> ite = nm.iterator();
        while(ite.hasNext()){
            System.out.println(ite.next());
        }
        System.out.println(" ");
        
        ListIterator <String> litr = nm.listIterator();
        System.out.println("MAJU!!!");
        while(litr.hasNext()){
            System.out.println(litr.next());
        }
        System.out.println(" ");
        
        System.out.println("MUNDUR!!!");
        while(litr.hasPrevious()){
            System.out.println(litr.previous());
        }
        System.out.println(" ");
        
        ArrayList<Integer> umur = new ArrayList<>();
        umur.add(10);
        umur.add(0, 12);
        umur.add(0, 17);
        umur.add(3, 20);
        umur.add(1, 50);
        umur.add(100);
        System.out.println(umur);
        
        for(int a:umur){
            tot = tot + a;
        }
        System.out.println("total : "+tot);
        
        ArrayList<Integer> um = new ArrayList<>();
        int u;
        
        System.out.print("Berapa Data yang Mau Dimasukkan ? ");
        u = age.nextInt();
        
        for(int a=0; a<u; a++){
            System.out.print("Data "+(a+1)+" : ");
            um.add(age.nextInt());
        }
        
        for(int ur:um){
            total = total + ur;
        }
        rerata = total/u;
        System.out.println("Total : "+total);
        System.out.println("Rata-Rata : "+rerata);
        
    }
    
}
