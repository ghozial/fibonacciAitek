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
        
        int fibo = 0, fibo1 = 0, fibo2 = 1;
    int counter = 0; //to check which element we are looking for
    int pivot = 0; //I will use this as a temporary storage tool 
    
    //going to need an array to store the previous, the next and current values
    int[] seqFib = new int[3]; 
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Angka : ");
        int n = scan.nextInt();
    
    while(fibo < n){
      
      //Checks if we are at the first number
      if(counter == 0){
      
        seqFib[counter] = fibo1;
	      counter++;
	      
	    }else if(counter == 1){
	    
        seqFib[counter] = fibo2;
        counter++; 
        System.out.print(fibo2 + " ");
        
      }else{
      
        fibo = seqFib[counter -2] + seqFib[counter-1];
        pivot = seqFib[counter - 1];
        
        seqFib[counter -2] = pivot;
        seqFib[counter-1] = fibo;
        
        //control statement in order not to print out anything higher than 1000
        if(fibo > n){
        }else{
          System.out.print(fibo + " ");
        }
	 
      }

    }

	System.out.print("\n");
    }
    
}
