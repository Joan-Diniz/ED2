/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.questao10;

/**
 *
 * @author joanp
 */
public class TabelaHashAberta {
    private Aluno[] tabela;
    private int tamanho;
    private double fatordecarga;
    private static final Aluno APAGADO = new Aluno(-1, "ÄPAGDO");

    public TabelaHashAberta(int capacidadeInicial, double fatordecarga) {
        this.tabela = new Aluno[capacidadeInicial];
        this.tamanho = 0;
        this.fatordecarga = fatordecarga;
        
    }
    
    private int hash(int chave){
        return chave % tabela.length;
    }
    
    private void resize(){
        Aluno[] tabelaAntiga = this.tabela;
        this.tabela = new Aluno[tabelaAntiga.length * 2];
        this.tamanho = 0;
        
        for(Aluno aluno : tabelaAntiga){
            if(aluno != null && aluno != APAGADO){
                inserir(aluno);
            }
        }
    }
    
    public void inserir(Aluno aluno){
        if((double) tamanho / tabela.length >= fatordecarga){
            resize();
        }
        
        int hash = hash(aluno.getMatricula());
        int sondagem = 0;
        
        while (tabela[(hash + sondagem) % tabela.length] != null &&
                tabela[(hash + sondagem)% tabela.length] != APAGADO &&
                tabela[(hash + sondagem) & tabela.length].getMatricula() != aluno.getMatricula()){
            sondagem++;
        }
        
        tabela[(hash + sondagem) % tabela.length] = aluno;
        tamanho++;
        imprimirTabela();
    }
    
    public Aluno buscar(int matricula){
        int hash = hash(matricula);
        int sondagem = 0;
        
        while (tabela[(hash + sondagem) % tabela.length] != null){
            if(tabela[(hash + sondagem) % tabela.length].getMatricula() == matricula){
                return tabela[(hash + sondagem) % tabela.length];
            }
            sondagem++;
        }
        return null;
    }
    public void remover(int matricula){
        int hash = hash(matricula);
        int sondagem = 0;
        
        while (tabela[(hash + sondagem) % tabela.length] != null ){
            if(tabela[(hash + sondagem) % tabela.length].getMatricula() == matricula){
                tabela[(hash + sondagem) % tabela.length] = APAGADO;
                tamanho--;
                break;
            }
            sondagem++;
        }
        imprimirTabela();
    }
    
    public void imprimirTabela(){
        System.out.println("Tabela Hash: ");
        for(int i =0; i<tabela.length; i++){
            if(tabela[i] == null){
                System.out.println(": null");
            }else if(tabela[i] == APAGADO){
                System.out.println(": APAGADO");
            }else{
                System.out.println(i +" :" + tabela[i]);
            }
        }
        System.out.println();
    }
}
