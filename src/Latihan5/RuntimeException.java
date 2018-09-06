/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan5;

/**
 *
 * @author WINDOWS 10
 */
public class RuntimeException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 35;
        int b=5;
        try{
            int x = a/b;
            System.out.println("Hasil : "+x);
            int angka[]={1,2,3,4,5};
            angka[27]=72;
        }
        catch(Exception e){
            System.out.println("Salah");
            System.out.println(e);
        }
        System.out.println("Selesai");
    }
    
}
