/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.questao4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author joanp
 */
public class Questao4 {
    
    public static int BuscaBinaria(int[] vetor, int chave){
        int inicio = 0;
        int fim = vetor.length -1;
        
        while (inicio <= fim){
            int meio = (inicio + fim) / 2;
            if (vetor[meio] == chave){
                return meio;//returna onde a chave estava
            }else if(vetor[meio] < chave){
                inicio = meio + 1;
            }else{
                fim = meio -1;
            }
        }
        return -1; //para caso n achar a chave
    }

    public static void main(String[] args) {
        
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int [] vetor = new int [100000];
        
        for(int i =0;i < vetor.length; i++){
            vetor[i] = random.nextInt(10001);
        }
        System.out.println("Informe o valor para busca: ");
        int chave = scanner.nextInt();
        
        //busca sem ordenar o vetor
        long inicio = System.nanoTime();
        int resultado = BuscaBinaria(vetor, chave);
        long fim = System.nanoTime();
        long duracao = fim - inicio;
        
        if(resultado != -1){
            System.out.println("Valor encontrado na posicao sem ta ordenado: " + resultado);
            
        }else{
            System.out.println("Valor nao encontrado");
        }
        System.out.println("Tempo de execucao da busca binaria: "+duracao+" nanosegundos");
        
        Arrays.sort(vetor);// ordena o vetor 
        
        //busca com vetor ordenado
        inicio = System.nanoTime();
        resultado = BuscaBinaria(vetor, chave);
        fim = System.nanoTime();
        long duracaoOrdenada = fim - inicio;
        
        if(resultado != -1){
            System.out.println("Valor encontrado na posicao do vetor ordenado: " + resultado);
            
        }else{
            System.out.println("Valor nao encontrado");
        }
        System.out.println("Tempo de execucao da busca binaria com vetor ordenado: "+duracaoOrdenada+" nanosegundos");
        
    }
}
