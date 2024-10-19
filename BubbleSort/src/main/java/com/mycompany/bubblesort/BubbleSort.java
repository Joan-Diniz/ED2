/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bubblesort;

/**
 *
 * @author joanp
 */

import java.util.*;

public class BubbleSort {
    
    public static void bubblesort(int[] arr){
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n -i -1; j++){
                if (arr[j] > arr[j + 1]){
                    
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[+1] = temp;
                    swapped = true;
                }
            }
            System.out.println("Passo " + (i + 1) + ": " + Arrays.toString(arr));
            if (!swapped) break;//se n tiver troca e pq ja ta ordenada 
        }
    }

    public static void main(String[] args) {
        int [] arr = {3, 4, 9, 2, 5, 8, 1};
        System.out.println("Inicial: " + Arrays.toString(arr));
        bubblesort(arr);
    }
}
