/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Collection;
import java.util.TreeSet;

/**
 *
 * @author cimam
 */
public class GerenciaAlunos {
    
    //Exemplos de Collections
    Collection colecao = null;
    
    public GerenciaAlunos(){
       //Se a colecao for List ou Set
       //Caso escolha List: opte por ArrayList, 
       //                  LinkedList ou Vector
       //Caso escolha Set: opte por HashSet ou TreeSet
       colecao = new TreeSet();
    }
    public boolean cadastraAluno(Aluno aluno){
     
        return colecao.add(aluno);
       
    } 
    
    public Collection getAlunos(){
        return colecao;
    }
    
    // Apenas para fins de teste e exemplificação
    public static void main(String[] args) {
        GerenciaAlunos gerencia = new GerenciaAlunos();
        gerencia.cadastraAluno(new Aluno("João",123));
        gerencia.cadastraAluno(new Aluno("Maria",123));
        gerencia.cadastraAluno(new Aluno("João",345));
        
        System.out.println("Alunos cadastrados:"+
                gerencia.getAlunos());
    }
    
}