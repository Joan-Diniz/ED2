/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.insercao;

/**
 *
 * @author joanp
 */

import java.util.*;


public class Insercao {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<Integer> list = new ArrayList <>();
            
            System.out.println("Quantos valores deseja colocar ?");
            int n = scanner.nextInt();
            
        for(int i =0; i< n; i++){   
            System.out.println("informe o valor " + (i + 1) + ": ");
            int value = scanner.nextInt();
            
            insertInSortedOrder(list, value);
            
            System.out.println("Lista atualizada: " + list);
        }
        
            scanner.close();
        }
    
        public static void insertInSortedOrder(ArrayList<Integer> list, int value){
            int i = 0;
    
            while ( i < list.size() && list.get(i) < value){
                i++;
            }
            list.add(i, value);
    }
}
