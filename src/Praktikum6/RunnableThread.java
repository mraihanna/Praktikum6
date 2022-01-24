/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum6;

    public class RunnableThread implements Runnable{
   // Run method is executed when thread first started
    public void run () {
        System.out.println("I am an instance of the java.lang. Runnable interface");
    }
    
    public static void main (String args []) {
    System.out.println ("Creating runnable object");
    
    Runnable run = (Runnable) new RunnableThread();
    
    System.out.println("Creating First Thread");
    Thread t1 = new Thread (run);
    
    System.out.println("Creating Second Thread");
    Thread t2 = new Thread (run);
    
    System.out.println("Starting Both Threads");
    t1.start();
    t2.start();
    }
}