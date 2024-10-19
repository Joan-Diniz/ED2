/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.selectionsort;

/**
 *
 * @author joanp
 */
import java.util.*;
public class SelectionSort {
    public static void selectionSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n -1; i++){
            int minIndex = i;
            for (int j = i + 1; j < n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
            System.out.println("Passo " + (i + 1) + ": " + Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        int [] arr = {3, 4, 9, 2, 5, 8, 1};
        System.out.println("Inicial: " + Arrays.toString(arr));
        selectionSort(arr);
    }
}
