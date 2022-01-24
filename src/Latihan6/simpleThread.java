/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan6;

/**
 *
 * @author ALDO DWIE RIZKY
 */
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class simpleThread extends Thread{
    
    private String threadName;
    private int sum;
    private int num1, num2, num3;
    
    public simpleThread(String name){ 
        super();
        threadName = name;
    }
    
    public void setNum(int n1, int n2, int n3){
        num1 = n1;
        num2 = n2;
        num3 = n3;
    }
    
     public void run(){
         try{
             sum = num1 + num2 + num3;
             System.out.printf("%s calculate %d+%d+%d = %d \n", threadName,num1,num2,num3,sum);
             Thread.sleep(100);
         } catch (InterruptedException ex) {
            Logger.getLogger(simpleThread.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
  }  
