package com.mycompany.exemplojpa;

public class ExemploJPA {

    public static void main(String[] args) {
        PessoaDAO dao = new PessoaDAO();
        dao.salvar(new Pessoa("Lucca"));
        Pessoa p = dao.buscar(1L);
        System.out.println("Pessoa: "+ p.getNome());
    }
}
