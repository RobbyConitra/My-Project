package array;

import java.util.Scanner;
public class Array_try_catch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = 100,b,c,res;
        
        try{
            System.out.print("Nilai B : ");
            b = s.nextInt();
            res = a/b;
            System.out.println(res);
        } catch(Exception e){
            String errMsg = e.getMessage();
            System.out.println(errMsg);
        }
    }
}
