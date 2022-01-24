/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum6;

/**
 *
 * @author ASUS
 */
class ThreadUtama {
  protected String title = "Thread Utama";
  public void kirim() {
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
  public void terima() {
    int count = 2;
        System.out.println ("\nBilangan Genap");
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

class Main extends ThreadUtama {
  private String random = "Praktikum Program 1";
  public static void main(String[] args) {
    Main myThreadUtama = new Main();
    
    System.out.println(myThreadUtama.title + " - " + myThreadUtama.random);
    myThreadUtama.kirim();
    myThreadUtama.terima();
  }
}

