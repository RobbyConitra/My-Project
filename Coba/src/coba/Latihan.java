/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coba;

import java.util.Scanner;

/**
 *
 * @author Thea Jessica
 */
public class Latihan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
