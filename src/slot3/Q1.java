/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slot3;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Q1 {
     public static void max(int[]arr){
         int max = arr[0];
         int i;
         for(i = 0;i < arr.length;i++){
             if(max < arr[i]){
               max = arr[i];
             }
         }
         System.out.println(max);
     }
     public static void main(String[] args) {
        int[]arr = { 3,53,210,28};
        max(arr);
    }
    
}
