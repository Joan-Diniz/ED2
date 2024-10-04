/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.buscabinariamultiplaschaves;

import java.util.*;
/**
 *
 * @author joanp
 */
public class BuscaBinariaMultiplasChaves {
    
    public static List<Integer> buscaBinaria(int[] vetor, int chave){
        List<Integer> posicoes = new ArrayList<>();
        int inicio = 0;
        int fim = vetor.length -1;
        
        while (inicio <= fim){
            int meio = (inicio + fim) /2;
            if(vetor[meio] == chave){
                //encontra todas as ocorrencias a esquerda
                int i = meio;
                while(i >= 0 && vetor[i] == chave){
                    posicoes.add(i);
                    i++;
                }
                break;
            }else if(vetor[meio] < chave){
                inicio = meio +1;
            }else{
                fim = meio -1;
            }
        }
        return posicoes;
    }

    public static void main(String[] args) {
        
        int[] vetor = {10, 20, 30, 30, 30, 40, 50};
        int chave = 30;
        List<Integer> resultado = buscaBinaria(vetor, chave);
        
        if(!resultado.isEmpty()){
            System.out.println("Chave encontrada nas posicoes: " + resultado);
        }else{
            System.out.println("Chave nao encontrada");
        }
    }
}
