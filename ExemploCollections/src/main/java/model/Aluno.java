/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author cimam
 */
public class Aluno implements Comparable{
     private String nome;
     private int ra;

    public Aluno(String nome, int ra) {
        this.nome = nome;
        this.ra = ra;
    }

    public Aluno() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    @Override
    public String toString() {
        return "\nnome=" + nome + ", ra=" + ra ;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + this.ra;
        hash = 31 * hash + this.nome.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        return (this.ra == other.ra) && 
                (this.nome.equalsIgnoreCase(other.nome));
    }

    @Override
    public int compareTo(Object o) {
        //A comparação seguidrá primeiro o critério de ra;
        //Caso seja igual seguirá o critério de nome
        
        int compRa = this.ra -((Aluno)o).ra;
        if(compRa!=0){
            return compRa;
        }
        return this.nome.compareToIgnoreCase(((Aluno)o).nome);
    }
    
     
    
}
