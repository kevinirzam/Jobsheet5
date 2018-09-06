/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;

import java.util.Scanner;
/**
 *
 * @author WINDOWS 10
 */
public class ArithmeticException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int i=100;
        System.out.println("Enter value for b ");
        Scanner console = new Scanner(System.in);
        int b=console.nextInt();
        
        System.out.println("Enter the value for c");
	int c = console.nextInt();
        int res=10/(b-c);
        System.out.println(" The result is "+res);  

        
    }
    
}
