package com.mycompany.exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ExercicioOptimal {

    public static void main(String[] args) {
         List<String> nomes = new ArrayList<>();
         
        nomes.add("Lucca");
        nomes.add(null);
        nomes.add("Gustavo");
        nomes.add(null);
        nomes.add("Mateus");
        
        for(String nome:nomes){
            
            Optional<String>opt = Optional.ofNullable(nome);
            
            opt.ifPresent(System.out::println);
            
        }
    }
}
