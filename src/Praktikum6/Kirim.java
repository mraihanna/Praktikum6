/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum6;

/**
 *
 * @author ASUS
 */
public class Kirim extends Thread{    
    public static void main(String args[]) throws java.io.IOException{
        int count = 1;
        System.out.println ("Bilangan Ganjil");
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
