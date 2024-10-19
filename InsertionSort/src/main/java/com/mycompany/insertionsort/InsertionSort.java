/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.insertionsort;

/**
 *
 * @author joanp
 */
import java.util.*;

public class InsertionSort {
    public static void insertionSort(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n; i++){
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                 j=j -1;
            }
            arr[j + 1] = key;
            System.out.println("Passo " + i + ": " + Arrays.toString(arr));
        }
        
    }

    public static void main(String[] args) {
        int [] arr = {3, 4, 9, 2, 5, 8, 1}; 
        System.out.println("Inicial: " + Arrays.toString(arr));
        insertionSort(arr);
    
    
    }
}
