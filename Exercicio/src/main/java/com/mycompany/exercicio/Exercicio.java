package com.mycompany.exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Exercicio {

    public static void main(String[] args) {
         List<String> nomes = new ArrayList<>();
         
        nome.add("Lucca", null, "Gustavo", null, "Umzeae", null);
        
        for(String nome:nomes){
            
            Optional<String>opt = Optional.ofNullable(nome);
            
            opt.ifPresent(System.out::println);
            
        }
    }
}
