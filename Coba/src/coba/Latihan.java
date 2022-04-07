package coba;

import java.util.Scanner;

public class Latihan {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numInputs = 10, input = 0, x = 0, stopLoop = 999;
        System.out.println("Enter 10 numbers");
        for (int i = 0; i < numInputs; i++){
            input = in.nextInt();
            if (input == stopLoop){
                break;
            }
            else {
                x += input;
            }//end if
        }//end for
        System.out.println("The sum of the numbers : "+x);
    }
    
}
