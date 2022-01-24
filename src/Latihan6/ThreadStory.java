/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Latihan6;

/**
 *
 * @author USER
 */
public class ThreadStory extends Thread {
    int threadNumber;
	
	public ThreadStory (int num) {
            threadNumber = num;
	}
	
	public void run() {
            System.out.println("Dokter 1 menangani pasien-"+ threadNumber);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println(threadNumber + "Selesai");
            }
            for (int i=1; i<=5;i++);{

            //System.out.println("perawat2");
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println(threadNumber + "Selesai");
            }
            System.out.println("Pasien ke-"+threadNumber+" membayar dikasir 1");

            }

    public static void main(String args[]) {
        System.out.println("Cerita: ");
	Thread t1= new ThreadStory(1);
	Thread t2= new ThreadStory(2);
	Thread t3= new ThreadStory(3);
	Thread t4= new ThreadStory(4);
	Thread t5= new ThreadStory(5);
	Thread t6= new ThreadStory(6);
	Thread t7= new ThreadStory(7);
	Thread t8= new ThreadStory(8);
	Thread t9= new ThreadStory(9);
	Thread t10= new ThreadStory(10);
	Thread t11= new ThreadPerawat(1);
	Thread t12= new ThreadPerawat(2);
	Thread t13= new ThreadPerawat(3);
	Thread t14= new ThreadPerawat(4);
	Thread t15= new ThreadPerawat(5);
	Thread t16= new ThreadPerawat(6);
	Thread t17= new ThreadPerawat(7);
	Thread t18= new ThreadPerawat(8);
	Thread t19= new ThreadPerawat(9);
	Thread t20= new ThreadPerawat(10);

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
	t11.start();
	t12.start();
	t13.start();
	t14.start();
	t15.start();
	t16.start();
	t17.start();
	t18.start();
	t19.start();
	t20.start();

    }
}
