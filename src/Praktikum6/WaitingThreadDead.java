/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum6;

/**
 *
 * @author ASUS
 */
public class WaitingThreadDead extends Thread {
   // Run method is executed when thread first started
    public void run () {
        System.out.println ("This thread feels a little ill....");
        // Sleep for five seconds
        try {
            Thread.sleep (5000) ;
        } catch (InterruptedException ie) {
        }
    }
    
    public static void main(String args[]) throws java.lang.InterruptedException {
        // Create and start dying thread
        Thread dying = new WaitingThreadDead ();
        dying.start ();
        // Prompt user and wait for input
        System.out.println ("Waiting for thread death");
        // Wait till death
        dying.join ();
        System.out.println("Thread has died");
    }
}