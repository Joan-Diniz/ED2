/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.questao9;

/**
 *
 * @author joanp
 */

import java.util.LinkedList;

public class TabelaHashEncadeada {
    
    private LinkedList<Aluno>[] tabela;
    private int tamanho;

    public TabelaHashEncadeada(int tamanho) {
        this.tamanho = tamanho;
        tabela = new LinkedList[tamanho];
        for(int i =0; i < tamanho; i++){
            tabela[i] = new LinkedList<>();
        }

    }
    
    private int hash(int chave){
        return chave % tamanho;
    }
    
    public void inserir(Aluno aluno){
        int posicao = hash(aluno.getMatricula());
        tabela[posicao].add(aluno);
        imprimirTabela();
    }
    public Aluno buscar(int matricula){
        int posicao = hash(matricula);
        for(Aluno aluno : tabela[posicao]){
            if(aluno.getMatricula() == matricula){
                return aluno;
            }
        }
        return null;
    }
    
    public void remover(int matricula){
        int posicao = hash(matricula);
        tabela[posicao].removeIf(aluno -> aluno.getMatricula() == matricula);
        imprimirTabela();
    }
    
    public void imprimirTabela(){
        System.out.println("Tabela Hash");
        for (int i =0; i < tamanho; i++){
            System.out.println(i + ": ");
            for(Aluno aluno : tabela[i]){
                System.out.println(aluno + " -> ");
            }
            System.out.println("null");
        }
        System.out.println();
    }
    
    public LinkedList<Aluno>[] getTabela() {
        return tabela;
    }

    public void setTabela(LinkedList<Aluno>[] tabela) {
        this.tabela = tabela;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
    
    
}
