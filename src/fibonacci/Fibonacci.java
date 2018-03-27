/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan Size : ");
        int size = scan.nextInt();
        
        int[] fibonacci = new int[size];
        
        for(int i = 0; i < size; i++){
            if(i == 0)
                fibonacci[i] = (i+1);
            else if(i == 1)
                fibonacci[i] = fibonacci[i-1];
            else{
                fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
            }
        }
        
        int sum = 0;
        
        for(int i = 0; i < size; i++){
            sum += fibonacci[i];
            System.out.print(fibonacci[i] + " ");
        }
        
        System.out.println("");
        System.out.println("Total : " + sum);
    }
    
}
