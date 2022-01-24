/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan6;

/**
 *
 * @author ASUS
 */
public class RunningText extends Thread {
   public void run(){
    String[] strAr = {"Disuatu rumah sakit terdapat 1 dokter ", 
            "2 perawat dan 1 kasir.\n", 
            "Datanglah 10 pasien kemudian diperiksa oleh dokter ",
            "Setelah 10 Pasien diperiksa dokter, ",
            "pesawat 1 datang dan merawat 5 pasien dan perawat 2 merawat sisa pasien yang lain. \n", 
            "Setelah dirawat, pasien langsung membayar biaya dikasir"};  
        for (int i=0; i<strAr.length; i++){  
            System.out.print(strAr[i]);  
            try{
                Thread.sleep(500);
            } catch (InterruptedException ie) {
            }
       }
   }
    public static void main(String[] args) throws java.io.IOException{
        
        Thread counter = new RunningText();
        
        counter.start ();
        
        System.out.println ("Press any ENTER to pause the Story\n");
        System.in.read();
        counter.suspend();
        
        System.out.println ("Press any ENTER to resume the Story\n");
        System.in.read();
        counter.resume();
        
        System.out.println ("Press any ENTER to stop the Story\n");
        System.in.read();
        counter.stop();
    }
}
