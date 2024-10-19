/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dualpivotquicksort;

/**
 *
 * @author joanp
 */
import java.util.*;

public class DualpivotQuickSort {

    public static void main(String[] args) {
        final int SIZE = 100000;
        final int  MAX_VALUE = 100000;
        
        int[] arr = generateRandomArray(SIZE, MAX_VALUE);
        int[] arrToSort = arr.clone();
        
        long startTime = System.currentTimeMillis();
        dualPivotQuickSort(arrToSort, 0, arrToSort.length - 1);
        long endTime = System.currentTimeMillis();
        
        System.out.println("Tempo de exec. : " + (endTime - startTime) + " ms");
        
      
        }
      public static int[] generateRandomArray(int size, int maxvalue){
            Random rand = new Random();
            int[] arr = new int[size];
            for(int i =0; i < size; i++){
                arr[i] = rand.nextInt(maxvalue);
            }
            return arr;
    }
      
      
      public static void dualPivotQuickSort(int[] arr, int low, int high){
          if(low < high){
              
              int[] pivots = partition(arr, low, high);
              int p1 = pivots[0];
              int p2 = pivots[1];
              
              //recursividade
              dualPivotQuickSort(arr, low, p1 -1);   //elementos menor q p1
              dualPivotQuickSort(arr,p1 + 1, p2 -1); //elementos entre p1 e p2
              dualPivotQuickSort(arr, p2 +1, high);  // elementos mior q p2
          }
      }
      
      public static int[] partition(int[]arr, int low, int high ){
          if (arr[low] > arr[high]){
              swap(arr, low, high); //pra p1 ser menor q p2
              
          }
          int p1 = arr[low];
          int p2 = arr[high];
          
          int lt = low +1; //regiao para elementos menor q o p1
          int gt = high -1;// regiao para os elementos maiores q p2
          int i = low +1;  //regiao para os que ficarem no meio 
          
          //particionamento
          while (i <= gt){
              if(arr[i] < p1){
                  swap(arr,i,lt);
                  lt++;
              }else if(arr[i] > p2){
                  swap(arr,i,gt);
                  gt--;
                  i--;
              }
              i++;
          }
          
          swap(arr, low, lt -1); //colocando p1 e p2 no lugar certo
          swap(arr, low, gt +1);

          return new int[]{lt -1, gt +1};
      }
      
      public static void swap(int[]arr, int i, int j){
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
      }
}
