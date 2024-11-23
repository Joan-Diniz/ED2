/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.avrabbeb;

/**
*
* Uma ABB é estritamente binária se todos os nós da árvore
* tem 2 filhos ou são nósfolhas. 
* Implemente uma sub-rotina que verifica se uma ABB 
* é estritamente binária 
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

public class AvrABBEB {
    
    //funcao recursiva para 
    //verificar se e estritamente binaria
    public static boolean Ettbinaria(No raiz){
        if(raiz == null){
            return true;//esta vazia 
        }
        //verifica se e no ou folha
        if(raiz.esquerdo == null && raiz.direito == null){
            return true;
        }
        //verifica se tem exatamente 2 filhos
        if(raiz.esquerdo != null && raiz.direito != null){
            return Ettbinaria(raiz.esquerdo) && Ettbinaria(raiz.direito);
            
        }
        return false;//se tiver apenas 1 filho viola a regra 
    }
    public static void main(String[] args) {
        No raiz = new No(1);
        raiz.esquerdo = new No(2);
        raiz.direito = new No(3);
        raiz.esquerdo.esquerdo = new No(4);
        raiz.esquerdo.direito = new No(5);
        raiz.direito.esquerdo = new No(6);
        raiz.direito.direito = new No(7);
        
        //verifica se e estritamente binaria
        boolean resultado = Ettbinaria(raiz);
        System.out.println("A arvera e estritamente Binaria ? " + resultado );
    }
}
