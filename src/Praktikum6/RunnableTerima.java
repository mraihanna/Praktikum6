/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Praktikum6;

/**
 *
 * @author ASUS
 */
public class RunnableTerima extends Thread{
    public void run () {
        int count = 0;
        System.out.println ("Ganjil");
         for (;;){
            System.out.print(count + " ");
            count = count + 2;
            try{
                Thread.sleep(500);
            } catch (InterruptedException ie) {
            }
        }
    }
    
    public static void main(String args[]) throws java.io.IOException{
        // Create and start counting thread
        Thread counter = new RunnableKirim ();
        counter.start ();
        System.out.println ("Press any enter to stop the thread counting");
        System.in.read();
        counter.stop();
    }
}