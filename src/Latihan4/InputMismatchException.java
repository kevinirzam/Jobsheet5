/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class InputMismatchException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //int a=100;
        System.out.println("Masukkan nilai a");
         Scanner console = new Scanner(System.in);
	int a = console.nextInt();
     
        System.out.println("Masukkan nilai b");
	int c = console.nextInt();
        int b=4;
        double res=b/c;
        System.out.println(" Hasilnya adalah : "+res);  
    }

    }
