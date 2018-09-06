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
public class TestThrow {

    /**
     * @param args the command line arguments
     */
    public static void lempar(int n)throws NullPointerException{
        if(n==0){
            throw new NullPointerException(
                    "Error : bernilai null");
        } else {
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner a = new Scanner(System.in);
        System.out.println("Masukkan nilai kosong");
        int n = a.nextInt();
        try{
            lempar(n);
        }
        catch(Exception e){
            System.out.println("Problem dalam inputan");
            System.out.println(e.getMessage());
        }
    }
    
}
