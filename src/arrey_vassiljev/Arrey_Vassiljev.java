/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrey_vassiljev;

import java.util.Arrays;
import java.util.Random;



public class Arrey_Vassiljev {

    public static void main(String[] args) {
       int[] a = new int[20];
       Random random = new Random();
       int sum=0;
       for(int i=0;i <a.length;i++){
          a[i] = random.nextInt(100);
         
        }
       for (int i=0;i<a.length;i++){
           a[i]=(a[i]*2)%100;
           
       }
        Arrays.sort(a);
        //for (int i = 0; i < a.length; i++) {
            //System.out.println(a[i]);
            
        //}
        for (int i = 0; i < a.length; ++i){
            sum += a[i];
        }sss
        //System.out.println(sum);
        sum = (sum -(a[0]+a[19]))/20;
        System.out.println("Среднее арифметическое элементов массива без учета минимального и максимального элемента: "+sum);
            
        }
        
       }

    

    
     

