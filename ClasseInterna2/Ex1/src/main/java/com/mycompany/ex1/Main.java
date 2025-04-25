/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex1;

/**
 *
 * @author android
 */
public class Main {

    // Definição da interface
    interface Calculadora {

        int operar(int a, int b);
    }

    public static void main(String[] args) {
        // Classe anônima que implementa a interface Calculadora e realiza a soma
        Calculadora soma = new Calculadora() {
            @Override
            public int operar(int a, int b) {
                return a + b;
            }
        };

        // Testando a soma
        int resultado = soma.operar(10, 5);
        System.out.println("Resultado da soma: " + resultado);
    }
}
