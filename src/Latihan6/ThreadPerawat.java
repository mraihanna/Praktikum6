/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Latihan6;

/**
 *
 * @author USER
 */
public class ThreadPerawat extends Thread {

  int threadNumber;
	
	public ThreadPerawat (int num) {
		threadNumber = num;
	}
	
	public void run() {
		System.out.println("Perawat 1 menangani pasien-"+ threadNumber);

		System.out.println("Perawat 2 menangani pasien-"+ threadNumber);
		
		}
    public static void main(String args[]) {
        System.out.println("Cerita: \n");
	Thread t1= new ThreadPerawat(1);
	Thread t2= new ThreadPerawat(2);
	Thread t3= new ThreadPerawat(3);
	Thread t4= new ThreadPerawat(4);
	Thread t5= new ThreadPerawat(5);
	Thread t6= new ThreadPerawat(6);
	Thread t7= new ThreadPerawat(7);
	Thread t8= new ThreadPerawat(8);
	Thread t9= new ThreadPerawat(9);
	Thread t10= new ThreadPerawat(10);
        //mulai
	t1.start();
	t2.start();
	t3.start();
	t4.start();
	t5.start();
	t6.start();
	t7.start();
	t8.start();
	t9.start();
	t10.start();
    }
}
