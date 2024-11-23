/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/**
 *
 * 1- Faça uma função recursiva que 
 * conta a quantidade de nós de uma árvore binária.
 * 
 */
package com.mycompany.avr;
//classe para mos nos da arvore
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
public class Avr {
    
    //contando os nos de forma recursiva
    public static int contarNos(No raiz){
        if(raiz == null){
            return 0;
        }
        //soma o no atual + nos da subárvore esquerda + nos da subarvore direita
        return 1 + contarNos(raiz.esquerdo) + contarNos(raiz.direito);
    }

    public static void main(String[] args) {

// ex de arvore
        No raiz = new No(0);
        raiz.esquerdo = new No(3);
        raiz.direito = new No(5);
        raiz.esquerdo.esquerdo = new No(7);
        raiz.esquerdo.direito = new No(8);
        
        //chamando a funcao de contar os nos 
        int totalNos = contarNos(raiz);
        System.out.println("Total de nos: " + totalNos);
        
    }
}
