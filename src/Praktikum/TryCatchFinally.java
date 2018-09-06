/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

import java.util.Scanner;
/**
 *
 * @author WINDOWS 10
 */
public class TryCatchFinally {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner a = new Scanner(System.in);
        System.out.println("Pembagian Bilangan");
        System.out.print("Masukkan Bilangan 1 :");
        int bil1 = a.nextInt();
        System.out.print("Masukkan Bilangan 2 :");
        int bil2 = a.nextInt();//Masukkan angka 0
        
        try{
            //masukkan menggunakan angka
            double hasil = bil1/bil2;
            
        }
        catch(ArithmeticException e){
            System.out.println("Inputan tidak valid, masukkan angka selain 0");
        }
        finally{
            System.out.println("Operasi pembagian selesai");
        }
        
    }
    
}
