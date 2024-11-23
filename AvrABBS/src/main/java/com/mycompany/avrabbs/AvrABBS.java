/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.avrabbs;
/**
 *
 * Faça um programa que verifica se duas árvores binárias 
 * de busca (ABB) são SIMILARES. Duas ABBs são similares se as duas árvores são 
 * vazias ou possuem a mesma distribuição dos nós que as compõem, 
 * mesmo que os valores sejam diferentes.
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

public class AvrABBS {
    
    //verifica se sao similares ou nao 
    public static boolean Saosimilares(No a, No b){
    
        if (a == null && b == null){
        return true;//as duas estao vazias
}
    if(a == null || b == null){
    return false; //so uma esta vazia
}
    return Saosimilares(a.esquerdo, b.esquerdo)&& Saosimilares(a.direito, b.direito);

}

    public static void main(String[] args) {
        
        //arvore 1
        No raiz1 = new No(3);
        raiz1.esquerdo = new No(5);
        raiz1.direito = new No(7);
        
        //arvore 2
        No raiz2 = new No(30);
        raiz2.esquerdo = new No(50);
        raiz2.direito = new No(70);
        
        //verifica se e similar 
        boolean resultado = Saosimilares(raiz1, raiz2);
        System.out.println("Sao similares ? " + resultado);
        
          
    }
}
