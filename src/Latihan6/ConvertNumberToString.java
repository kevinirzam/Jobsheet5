/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan6;

/**
 *
 * @author WINDOWS 10
 */
public class ConvertNumberToString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            //initial error
            String s = "Lima";
            int i = Integer.parseInt(s);
            
            //this line of code will never be reached
            System.out.println("int value = "+i);
        }catch(NumberFormatException nfe){
            nfe.printStackTrace();
        }
    }
    
}
