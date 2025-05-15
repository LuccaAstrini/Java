package com.mycompany.optimal;

import java.util.Optional;

public class Pessoa {

    private String nome;
    private String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public static void main(String[] args) {

        String nome = "Carlos";
        Optional<String> opcional1 = Optional.of(nome);
        System.out.println("Optional.of: " + opcional1);

        // Pessoa pessoa = new Pessoa("Josefina", "123456");
        //String nome = pessoa.getNome();
        //System.out.println(nome.toUpperCase() + " " + pessoa.getCpf());
        
        try {
            String nomeNulo = null;
            Optional<String> opcionalErro = Optional.of(nomeNulo);
        } catch (NullPointerException e) {
            System.out.println("Erro: Optional.of(null) lança NullPointerException");
        }

        String outroNomeNulo = null;
        Optional<String> opcional2 = Optional.ofNullable(outroNomeNulo);
        System.out.println("Optional.ofNullable com null: " + opcional2);

        Optional<String> opcional3 = Optional.ofNullable("Marta");
        System.out.println("Optional.ofNullable com valor: " + opcional3);
    }
}
