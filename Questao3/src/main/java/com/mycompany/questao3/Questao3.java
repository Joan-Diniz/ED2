/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.questao3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author joanp
 */
public class Questao3 {
    
    public static int BuscaSequencial(int[] vetor, int chave){
        for(int i =0; i<vetor.length;i++){
            if(vetor[i] == chave){
                return i;// retorna o onde a chave foi encontrada
            }
        }
        return -1; //retorna -1 se a chave nao for encontrada
    }

    public static void main(String[] args) {
        
        
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[100000];
        
        for(int i = 0; i < vetor.length; i++){ //preenche o vetor
            vetor[i] = random.nextInt(10001);//rnadon entre 0 e 10000
        }
        System.out.println("Informe o valor para busca: ");
        int chave = scanner.nextInt();
        
        long inicio = System.nanoTime();//inicio da contagem de tempo
        int resultado = BuscaSequencial(vetor, chave);
        long fim = System.nanoTime();//fim da contagem de tempo
        
        if(resultado != -1){
            System.out.println("Valor encontrado na posicao: " + resultado);
        }else{
            System.out.println("Valor nao encontrado");
        }
        
        long duracao = fim - inicio;
        System.out.println("Tempo de execucao da busca sequencial: " + duracao + " nanosegundos");
    }
}
