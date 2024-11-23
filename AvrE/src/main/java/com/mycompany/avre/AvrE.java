/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.avre;

/**
 *
 * Escreva uma função que obtém o espelho de uma árvore
 * , ou seja, 
 * troca a subárvore direita pela sub-árvore da esquerda 
 * de todos os nós da árvore
 * 
 */
class No{
int valor;
No esquerdo;
No direito;

public No(int valor){
    this.valor = valor;
    this.esquerdo = null;
    this.direito = null;
}
}
public class AvrE {
    
    //funcao recursiva que inverrte a arvore 
    public static void espelhoavr(No raiz){
        if (raiz == null){
            return;// se for nulo nao espelha 
        }
        //troca os filhos esquerdo e direito
        No temp = raiz.esquerdo;//armazena temporariamente
        raiz.esquerdo = raiz.direito;
        raiz.direito = temp;
        
        //espelha de forma recursiva 
        espelhoavr(raiz.esquerdo);
        espelhoavr(raiz.direito);
    }
    
    public static void exibiravr(No raiz){
        if(raiz!=null){
            System.out.println(raiz.valor + "");
            exibiravr(raiz.esquerdo);
            exibiravr(raiz.direito);
        }
    }

    public static void main(String[] args) {
 //ex de arvore
 
        No raiz = new No(0);
        raiz.esquerdo = new No(3);
        raiz.direito = new No(5);
        raiz.esquerdo.esquerdo = new No(7);
        raiz.esquerdo.direito = new No(8);
        
        //arvore original
        System.out.println("Arvore original:");
        exibiravr(raiz);
        
        //espelhar
        espelhoavr(raiz);
        
        //exibir a arvore espelhada
        System.out.println("Arvore espelhada:");
        exibiravr(raiz);
    
    }
}
