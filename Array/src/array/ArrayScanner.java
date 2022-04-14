package array;

import java.util.Scanner;
public class ArrayScanner {
    public static void main(String[] args) {
        Scanner nil = new Scanner(System.in);
        int skor[] = new int[10];
        int jumlah = 0;
        double rerata;
        
        for(int a=0; a<skor.length; a++){
            System.out.print("Masukkan data : ");
            skor[a] = nil.nextInt();
            jumlah = jumlah+skor[a];
        }
        
        for(int s:skor){
            System.out.println("Skor : "+s);
        }
        rerata = jumlah/skor.length;
        System.out.println("Total : "+jumlah);
        System.out.println("Rata-Rata : "+rerata);
    }
    
}
