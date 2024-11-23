/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.avrabbss;

/**
 *
Faça um programa que verifica se duas árvores binárias de busca (ABB)
* são IGUAIS. Duas ABBs são iguais se as duas árvores são vazias ou 
* possuem exatamente os mesmo nós distribuídos da mesma forma.
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
public class AvrABBSS {
    
    public static boolean Saoiguais(No a, No b){
    
        if (a == null && b == null){
        return true;//as duas estao vazias
}
        if (a == null || b == null){
            return false;// so uma esta vazia 
        }
        if(a.valor != b.valor){
            return false;//os valores dos nos sao diferentes
        }
        //verifica as arvores de forma recursiva
        return Saoiguais(a.esquerdo, b.esquerdo)&& Saoiguais(a.direito, b.direito);
        
    }

    public static void main(String[] args) {
        //construcao da primeira arvore binaria
        No raiz1 = new No(3);
        raiz1.esquerdo = new No(0);
        raiz1.direito = new No(8);
        
        //construcao da segunda arvore binaria
        No raiz2 = new No(3);
        raiz2.esquerdo = new No(0);
        raiz2.direito = new No(8);
        
        //verificando se sao iguais
        boolean resultado = Saoiguais(raiz1, raiz2);
        System.out.println("As arvores sao iguais ? " + resultado);
    }
}
