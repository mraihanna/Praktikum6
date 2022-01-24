/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum6;

public class InterruptingThread extends Thread {
    public void run () {
        System.out.println ("I feel sleepy. Wake me in eight hours");
    try {
        Thread.sleep (1000 * 60 * 60 * 8);
            System.out.println ("That was a nice nap");
        } catch (InterruptedException ie) {
            System.err.println ("Just five more minutes....");
    }
  }
    
    public static void main (String args[]) throws java.io.IOException {

    Thread sleepy = new InterruptingThread ();

     sleepy.start ();

     System.out.println ("Press enter to interrupt the thread");
     System.in.read ();

     sleepy.interrupt ();
    }
  }