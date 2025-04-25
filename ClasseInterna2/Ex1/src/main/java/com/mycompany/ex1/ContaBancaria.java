/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex1;

/**
 *
 * @author android
 */
public class ContaBancaria {

    public static class Banco {

        private static final String NOME_BANCO = "Bradesco";

        public void imprimirNomeBanco() {
            System.out.println("Nome do banco: " + NOME_BANCO);
        }
    }

    public static void main(String[] args) {
        ContaBancaria.Banco banco = new ContaBancaria.Banco();
        banco.imprimirNomeBanco();
    }
}
