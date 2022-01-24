/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum6;

/**
 *
 * @author ASUS
 */
public class Terima {
    public static void main(String args[]) throws java.io.IOException{
        int count = 0;
        System.out.println ("Bilangan Genap");
         for (int i = 0; i < 10; i++){
            System.out.print(count + " ");
            count = count + 2;
            try{
                Thread.sleep(500);
            } catch (InterruptedException ie){
            }
        }
    }
}
