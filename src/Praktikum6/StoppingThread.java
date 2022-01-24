/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum6;

public class StoppingThread extends Thread {
   
        // Run method is executed when thread first started
    public void run () {
        int count = 1;
        System.out.println ("I can count. Watch me go!");
         for (;;){
            // Print count and increment it
            System.out.print(count++ + " ");
            // Sleep for half a second
            try{
                Thread.sleep(500);
            } catch (InterruptedException ie) {
            }
        }
    }
    
    public static void main(String args[]) throws java.io.IOException{
        // Create and start counting thread
        Thread counter = new StoppingThread ();
        counter.start ();
        // Prompt user and wait for input
        System.out.println ("Press any enter to stop the thread counting");
        System.in.read();
        // Interrupt the thread
        counter.stop();
}
}