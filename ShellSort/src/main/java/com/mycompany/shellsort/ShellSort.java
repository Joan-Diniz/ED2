/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.shellsort;

/**
 *
 * @author joanp
 */
import java.util.*;

public class ShellSort {
    public static void shellSort(int[] arr){
        int n = arr.length;
        for(int gap = n / 2; gap > 0; gap /= 2){
            for(int i = gap; i < n; i++){
                int temp = arr[i];
                int j;
                for(j = i; j >= gap && arr[j - gap] > temp; j -= gap){
                    arr[j] = arr[ j - gap];
                }
                arr[j] = temp;
            }
            System.out.println("Gap " + gap + ": " + Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        int [] arr = {3, 4, 9, 2, 5, 8, 1};
        System.out.println("Inicial " + Arrays.toString(arr));
        shellSort(arr);
    }
}
