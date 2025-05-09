package com.mycompany.streamjava;

import java.util.List;
import java.util.stream.Stream;

public class StreamJava {

    public static void main(String[] args) {

        List<String> nomes = List.of("Ana", "Carlos", "Beatriz");
        Stream<String> stream = nomes.stream();
        
        stream.filter(nome -> nome.length()>4).forEach(System.out::println);
    }
}
