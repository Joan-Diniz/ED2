/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.buscasequencialmultiplaschaves;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joanp
 */
public class BuscaSequencialMultiplasChaves {
    
    public static List<Integer> buscaSequencial(int[] vetor, int chave){
        List<Integer> posicoes = new ArrayList<>();
        for(int i=0; i< vetor.length; i++){
            if(vetor[i] == chave){
                posicoes.add(i);//adiciona a posicao onde a chave foi encontrada
            }
        }
        return posicoes;
    }

    public static void main(String[] args) {
        int[] vetor = {10, 30, 20, 30, 40, 30};
        int chave = 30;
        List<Integer> resultado = buscaSequencial(vetor, chave);
        
        if(!resultado.isEmpty()){
            System.out.println("Chave encontrada nas posicoes: " + resultado);
        }else{
            System.out.println("Chave nao encontrada");
        }
    }
}
