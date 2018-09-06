/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;

/**
 *
 * @author WINDOWS 10
 */
public class ArrayIndexOutOfBoundsException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nums[] ={1,2,3};
        nums[2]=4;
        System.out.print("Nilai pada indeks adalah : "+nums[4]);
    }
    
}
