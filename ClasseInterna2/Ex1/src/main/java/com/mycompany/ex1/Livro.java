/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex1;

/**
 *
 * @author android
 */
public class Livro {

    private String titulo;
    private Autor autor;

    // Construtor da classe Livro
    public Livro(String titulo, String nomeAutor) {
        this.titulo = titulo;
        this.autor = new Autor(nomeAutor);
    }

    // Classe interna Autor
    public class Autor {

        private String nome;

        public Autor(String nome) {
            this.nome = nome;
        }

        public String getNome() {
            return nome;
        }
    }

    // Método para exibir informações
    public void exibirInfo() {
        System.out.println("Livro: " + titulo + ", Autor: " + autor.getNome());
    }
    
     public static void main(String[] args) {
        Livro livro = new Livro("Dom Casmurro", "Machado de Assis");
        livro.exibirInfo();
    }
}


