package com.mycompany.streamjava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamJava {

    public static void main(String[] args) {
        
        List<Aluno> alunos = new ArrayList<>();
        
        Aluno a = new Aluno("Lucca", "1234");
        Aluno b = new Aluno("Igo", "321");
        Aluno c = new Aluno("GuConti", "5431312");
        
        Stream<Aluno> stream = alunos.stream();
        
        alunos.add(a);
        alunos.add(b);
        alunos.add(c);
        
        stream.sorted((aluno1,aluno2) -> aluno1.getNome().compareTo(aluno2.getNome())).forEach(aluno -> {
            System.out.println(aluno.getNome());
        });
        
        
        
 
    }
}
