package com.mycompany.mavenproject1;

interface Calcula {

    int operar(int a, int b);
}

public class Calculadora {

    public static void main(String[] args) {
        Calcula soma = new Calcula() {

            @Override
            public int operar(int a, int b) {
                return a+b;
            }
        };
       int resultado = soma.operar(10,5);
        System.out.println("Resultado da soma: " + resultado);
    }
}
