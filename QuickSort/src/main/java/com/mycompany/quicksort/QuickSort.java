/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quicksort;

/**
 *
 * @author joanp
 */

import java.util.*;

public class QuickSort {
    public static void quickSort(int[] arr, int low, int high){
        if(low < high){
            int pi = partition(arr, low, high);
            System.out.println("Pivot " + arr[pi] + ": " + Arrays.toString(arr));
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    
    public static int partition (int[] arr, int low, int high){
        int pivot = arr[high];
        int i = (low -1);
    
    
    for (int j = low; j < high; j++){
    if (arr[j] < pivot){
        i++;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
    int temp = arr[i +1];
    arr[i+1] = arr[high];
    arr[high] = temp;
    return i +1;
    
    }

    public static void main(String[] args) {
        int [] arr = {3, 4, 9, 2, 5, 8, 1};
        System.out.println("inicial: " + Arrays.toString(arr));
        quickSort(arr, 0, arr.length -1);
    }
}
