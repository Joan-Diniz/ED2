/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.comparacao;

/**
 *
 * @author joanp
 */

import java.util.*;

public class Comparacao {

    public static void main(String[] args) {
        final int SIZE = 100000;
        final int MAX_VALUE = 100000;
        final int REPETITIONS = 10;
        
        long[][] results = new long[REPETITIONS][6];//armazenamento de tempo
        
        for(int i =0; i < REPETITIONS; i++){
            int[] arr = generateRandomArray(SIZE, MAX_VALUE);
            
            //bubble
            int [] bubbleArray = arr.clone();
            long startTime = System.currentTimeMillis();
            bubbleSort(bubbleArray);
            long endTime = System.currentTimeMillis();
            results[i][0] = endTime - startTime;
            
            //insertion
            
            int [] insertionArray = arr.clone();
            startTime = System.currentTimeMillis();
            insertionSort(insertionArray);
            endTime = System.currentTimeMillis();
            results[i][1] = endTime - startTime;
            
            //selection
            
            int[] selectionArray = arr.clone();
            startTime = System.currentTimeMillis();
            selectionSort(selectionArray);
            endTime = System.currentTimeMillis();
            results[i][2] = endTime - startTime;
            
            //shell
            
            int[] shellArray = arr.clone();
            startTime = System.currentTimeMillis();
            shellSort(shellArray);
            endTime = System.currentTimeMillis();
            results[i][3] = endTime - startTime;
            
            //Merge
            
            int [] mergeArray = arr.clone();
            startTime = System.currentTimeMillis();
            mergeSort(mergeArray, 0, mergeArray.length -1);
            endTime = System.currentTimeMillis();
            results[i][4] = endTime - startTime;
            
            //quick
            
            int[] quickArray = arr.clone();
            startTime = System.currentTimeMillis();
            quickSort(quickArray, 0, quickArray.length -1);
            endTime = System.currentTimeMillis();
            results[i][5] = endTime - startTime;
        }
        
        System.out.println("Resultados em mililesssengundos: ");
        System.out.println("Execucao | bubble | insertion | selection | shell | merge | quick");
        for ( int i = 0; i < REPETITIONS; i++){
            System.out.printf("   %2d  |   %5d  |   %5d  |   %5d  |   %5d  |   %5d  |  %5d  \n",
                    (i + 1), results[0], results[1], results[2], results[3], results[4], results[5]);
        
    }
            
    }
    
    public static int[] generateRandomArray(int size, int maxValue){
        Random rand =  new Random();
        int[] arr = new int [size];
        for(int i = 0; i < size; i++){
            arr[i] = rand.nextInt(maxValue);
        }
        return arr;
    }
    //blubble
    
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        boolean swapped;
        for(int i = 0; i < n - 1; i++){
            swapped = false;
            for(int j = 0; j < n -i -1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
    }
    //insertion
    public static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i = 1; i < n; i++){
            int key = arr[i];
            int j = i -1;
            while(j >= 0 && arr[j] > key){
                arr[j +1] = arr[j];
                j = j -1;
            }
            arr[j + 1] = key;
        }
    }
    
    //selection
    
    public static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n -1; i++){
            int minIndex = i;
            for(int j = i + 1; j < n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    
    //shell
    
    public static void shellSort(int [] arr){
        int n = arr.length;
        for(int gap = n/2; gap > 0; gap/=2){
            for(int i = gap; i < n; i++){
                int temp = arr[i];
                int j;
                for(j = i; j >= gap && arr[j - gap] > temp; j -= gap){
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
            }
        }
    }
    //merge
    
    public static void mergeSort(int[] arr, int left, int right){
        if(left < right){
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid +1, right);
            merge(arr, left, mid, right);
        }
    }
    
    public static void merge(int[] arr, int left, int mid, int right){
        int n1 = mid - left + 1;
        int n2 = right - mid;
        
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];
        
        for(int i = 0; i < n1; i++)
            leftArr[i] = arr[left + i];
        for(int j =0; j < n2; j++)
            rightArr[j] = arr[mid + 1 + j];
        
        int i = 0, j = 0, k = left;
        
        while(i < n1 && j < n2){
            if(leftArr[i] <= rightArr[j]){
                arr[k] = leftArr[i];
                i++;
            }else{
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }
        
        while (i < n1){
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        
        while (j < n2){
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
    
    //quick
    
    public static void quickSort(int [] arr, int low, int high){
        if (low < high){
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi -1 );
            quickSort(arr, pi + 1, high);
            
        }
    } 
    
    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = (low -1);
        for (int j = low; j < high; j++){
            if(arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        
        return i + 1;
    }
}
