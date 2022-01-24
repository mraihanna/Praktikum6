/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum6;

/**
 *
 * @author ASUS
 */
public class SuspendingThread extends Thread {
   // Run method is executed when thread first started
   public void run () {
       int count = 1;
       System.out.println ("I can count. Watch me go!");
       for (;;) {
          System.out.print (count++ + " ");
          try {
            Thread.sleep (500);
           } catch (InterruptedException ie) {
           }
       }
   }
   
   public static void main(String args[]) throws java.io.IOException {
        Thread counter = new SuspendingThread ();
        counter.start();
        System.out.println ("Press any enter to SUSPEND the thread counting");
        System.in.read();
        
        counter.suspend ();
        System.out.println ("Press any enter to RESUME the thread counting");
        System.in.read();
        counter.resume ();
        
        System.out.println ("Press any enter to STOP the thread counting");
        System.in.read();
        counter.stop ();
   }
}