package com.mycompany.exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ExercicioOptimal {

    public static void main(String[] args) {
        //exercicio 1
        List<String> nomes = new ArrayList<>();

        nomes.add("Lucca");
        nomes.add(null);
        nomes.add("Gustavo");
        nomes.add(null);
        nomes.add("Mateus");

        for (String nome : nomes) {

            Optional<String> opt = Optional.ofNullable(nome);

            opt.ifPresent(System.out::println);
        }
         
        //exercicio 2
        List<Aluno> alunos = new ArrayList<>();

        alunos.add(new Aluno("Ana"));
        alunos.add(null);
        alunos.add(new Aluno("Carlos"));
        alunos.add(null);
        alunos.add(new Aluno("Beatriz"));

        for (Aluno aluno : alunos) {
            Optional<Aluno> optAluno = Optional.ofNullable(aluno);
            optAluno.ifPresent(System.out::println);
        }
        
        //exercicio 3
        //nomes
        nomes.stream()
             .map(Optional::ofNullable)
             .forEach(opt -> opt.ifPresent(System.out::println));
        
        //Alunos
        alunos.stream()
             .map(Optional::ofNullable)
             .forEach(opt -> opt.ifPresent(System.out::println));
    }
}
