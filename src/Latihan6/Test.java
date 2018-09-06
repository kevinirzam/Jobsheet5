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
public class Test {

    /**
     * @param args the command line arguments
     */
    public Test clone() throws CloneNotSupportedException{
        return (Test) super.clone();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            new Test().clone();
        }
        catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
    
}
