/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.avrf;

/**
 *
 * Faca uma funcao recursiva que 
 * conta a quantidade de nos-folha de uma arvore.
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
public class AvrF {
    
    //funcao recursiva para contar os nos folhas
    public static int contarFolhas(No raiz){
        //se for nulo nao a folhas
        if(raiz ==null){
            return 0;
        }
        //se o no atual nao tem filhos , ele e uma folha 
        if(raiz.esquerdo == null && raiz.direito == null){
            return 1;
        }
        //soma as folhas da esquerda e direita
        return contarFolhas(raiz.esquerdo) + contarFolhas(raiz.direito);
        
    }

    public static void main(String[] args) {
// ex de arvore
        No raiz = new No(0);
        raiz.esquerdo = new No(3);
        raiz.direito = new No(5);
        raiz.esquerdo.esquerdo = new No(7);
        raiz.esquerdo.direito = new No(8);
        
        // Chamando a função para contar folhas
        int totalFolhas = contarFolhas(raiz);
        System.out.println("Total de folhas: " + totalFolhas);
    }
    }

