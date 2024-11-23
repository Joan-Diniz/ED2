/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.avrabbsr;

/**
 *
 * Reescreva a função de inserir um elemento 
 * em uma árvore binária de busca sem usar recursividade
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
public class AvrABBSR {
    
    //primeiro se insere os elementos
    public static void inserir(No raiz, int valor){
        No novo = new No(valor);
        No atual = raiz;
        No pai = null;
        
        //percorre a arvore ate encontrar o localcorreto para insercao
        while(atual != null){
            pai = atual;
            if(valor< atual.valor){
                atual = atual.esquerdo;
            }else{
                atual = atual.direito;
            }
        }
        //insere o novo no na posicao correta
        if(valor < pai.valor){
            pai.esquerdo = novo;
        }else{
            pai.direito = novo;
        }
    }

    public static void main(String[] args) {
//ex de arvore abb
        No raiz = new No(0);
        inserir(raiz, 3);
        inserir(raiz, 5);
        inserir(raiz, 7);
        inserir(raiz, 8);
       
    }
}
