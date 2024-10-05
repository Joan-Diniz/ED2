/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.questao10;

/**
 *
 * @author joanp
 */
public class Questao10 {

    public static void main(String[] args) {
        TabelaHashAberta tabela = new TabelaHashAberta(8, 0.75);
        tabela.inserir(new Aluno(52, "Aluno 52"));
        tabela.inserir(new Aluno(45, "Aluno 45"));
        tabela.inserir(new Aluno(64, "Aluno 64"));
        tabela.inserir(new Aluno(34, "Aluno 34"));
        tabela.inserir(new Aluno(69, "Aluno 69"));
        tabela.inserir(new Aluno(11, "Aluno 11"));
        tabela.inserir(new Aluno(10, "Aluno 10"));
        tabela.inserir(new Aluno(3, "Aluno 3"));
        tabela.inserir(new Aluno(6, "Aluno 6"));
        tabela.inserir(new Aluno(2, "Aluno 2"));
        
        System.out.println("buscando o aluno 45");
        Aluno aluno45 = tabela.buscar(45);
        System.out.println(aluno45 != null ? aluno45 : "aluno com a matricula 45 nao encontrado");
        System.out.println();
        
        System.out.println("buscando o aluno 45");
        Aluno aluno75 = tabela.buscar(75);
        System.out.println(aluno75 != null ? aluno45 : "aluno com a matricula 75 nao encontrado");
        System.out.println();
        
        System.out.println("REmovendo o aluno 11");
        tabela.remover(11);
    }
}
