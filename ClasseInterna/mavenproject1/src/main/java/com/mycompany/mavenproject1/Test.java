package com.mycompany.mavenproject1;

interface Mostrar {

    void executar();
}

public class Test {

    public static void main(String[] args) {
        Mostrar evento = new Mostrar() {
            public void executar() {
                System.out.println("estou em uma classe interna!");
            }
        };
        evento.executar();
    }
}
