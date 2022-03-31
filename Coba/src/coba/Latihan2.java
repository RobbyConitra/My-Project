/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coba;

/**
 *
 * @author Thea Jessica
 */
public class Latihan2 {
    public static void main(String[] args) {

    int counter = 0;
    int sum = 0;
    while (counter < 100){
        counter++;
         if (counter % 10 == 0){
            continue;
        }
        else {
            sum += counter;
        }//end if
    }//end while
    System.out.println("sum of 1 - 99 : "+sum);
}
}
