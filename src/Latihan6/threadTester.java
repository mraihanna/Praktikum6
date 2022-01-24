/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan6;

/**
 *
 * @author ALDO DWIE RIZKY
 */
public class threadTester {
    public static void main(String[] args){
        int[] arr1 = {6,9,1,2,3,5};
        int[] arr2 = {7,11,6,4,3,1};
        int[] arr3 = {5,4,3,2,1,12};
        for (int h = 0;h < arr1.length; h++){
            System.out.printf("sum[%d] = %d\n",h, arr1[h] + arr2[h] + arr3[h]);
        }
        
         for (int i=0; i < arr1.length ; i++){
             simpleThread st = new simpleThread("Thread "+i);
             st.setNum(arr1[i], arr2[i], arr3[i]); st.start();
         }
    }
}
