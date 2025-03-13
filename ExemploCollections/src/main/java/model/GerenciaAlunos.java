/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author cimam
 */
public class GerenciaAlunos {

    //Exemplos de Collections
    Collection colecao = null;
    Map associacao = null;

    public GerenciaAlunos() {
        //Se a colecao for List ou Set
        //Caso escolha List: opte por ArrayList, 
        //                  LinkedList ou Vector
        //Caso escolha Set: opte por HashSet ou TreeSet
        // colecao = new TreeSet();
        //associacao = new TreeMap<Aluno, Curso>();
        associacao = new TreeMap<Curso, List<Aluno>>();
    }

    public boolean cadastraAluno(Aluno aluno) {

        return colecao.add(aluno);

    }

    public boolean cadastraAluno(Aluno aluno, Curso curso) {
        return (associacao.put(aluno, curso) != null);
    }
    
    public boolean cadastraAluno(Curso curso, List<Aluno> alunos) {
        return (associacao.put(curso, alunos) != null);
    }

    public Collection getAlunos() {
        return colecao;
    }

    public Map getAssoc() {
        return associacao;
    }

    // Apenas para fins de teste e exemplificação
    public static void main(String[] args) {
        GerenciaAlunos gerencia = new GerenciaAlunos();
        Curso curso1 = new Curso("Eng de Soft", 4, "noturno");
        Curso curso2 = new Curso("Eng Mec", 5, "noturno");
        List<Aluno> aluno1 = new ArrayList<>();
        aluno1.add(new Aluno("João", 123));
        aluno1.add(new Aluno("Maria", 123));
        aluno1.add(new Aluno("João", 345));
        
        List<Aluno> aluno2 = new ArrayList<>();
        aluno2.add(new Aluno("Felisberto", 001));
        aluno2.add(new Aluno("Felicia", 002));
        aluno2.add(new Aluno("Josefina", 003));
        aluno2.add(new Aluno("Margarida", 004));
        gerencia.cadastraAluno(curso1, aluno1);
        gerencia.cadastraAluno(curso2, aluno2);
        
        /*gerencia.cadastraAluno(new Aluno("João", 123), curso);
        gerencia.cadastraAluno(new Aluno("Maria", 123), curso);
        gerencia.cadastraAluno(new Aluno("João", 345), curso);
        */

        System.out.println("Alunos cadastrados:"
                + gerencia.getAssoc());
    }

}
