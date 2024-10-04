/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.buscasequencialWhile;

/**
 *
 * @author joanp
 */
    
    public class BuscaSequencialWhile {
    
    public static int buscaSequencial(int[] vetor, int chave){
        int i = 0;
        while(i < vetor.length){
            if(vetor[i] == chave){
                return i;// retorna o indice onde a chave foi encontrada
            }
            i++;
        }
        return -1;// se n achar a chave retorna -1
    }
    

    public static void main(String[] args) {
        
        int[] vetor = {10, 20, 30, 40, 50};
        int chave = 30;
        int resultado = buscaSequencial(vetor, chave);
        
        if(resultado != -1){
            System.out.println("Chave encontrada na posicao: " + resultado);
        }else{
            System.out.println("Chave nao foi encontrada");
        }

    }
}
