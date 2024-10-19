/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.blubblesorte_v2;

/**
 *
 * @author joanp
 */
import java.util.*;

public class BlubbleSorte_V2 {

    public static void main(String[] args) {
    final int SIZE = 100000;
    final int MAX_VALUE = 100000;
    
    int[] arr = generateRandomArray(SIZE, MAX_VALUE);
    
    int[] arrToSort = arr.clone();
    
    long startTime = System.currentTimeMillis();
    bubblesortv2(arrToSort);
    long endTime = System.currentTimeMillis();
    
        System.out.println("Tempo de exec do bubble V_2: " + (endTime - startTime) + " ms");

    }
    
    public static int[] generateRandomArray(int size, int maxvalue){
        Random rand = new Random();
        int[] arr = new int[size];
        for(int i =0; i < size; i++){
            arr[i] = rand.nextInt(maxvalue);
        }
        return arr;
    }
    
    public static void bubblesortv2(int[] arr){
        int n = arr.length;
        boolean swapped;
        for(int i =0; i <n -1; i++){
            swapped = false;

        for(int j =0; j < n-1; j++){
        if(arr[j] > arr[j] +1){
            
            int temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j +1] = temp;
            swapped = true;
        }
        }
        if (!swapped){
            break;
        }
    }
    }
}
