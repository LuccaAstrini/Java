package model;

import java.util.Objects;

public class Produto {
    private String codigo;
    private String desc;
    private double valor;
    private int quantEstoque;

    public Produto() {
    }

    public Produto(String codigo, String desc, double valor, int quantEstoque) {
        this.codigo = codigo;
        this.desc = desc;
        this.valor = valor;
        this.quantEstoque = quantEstoque;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantEstoque() {
        return quantEstoque;
    }

    public void setQuantEstoque(int quantEstoque) {
        this.quantEstoque = quantEstoque;
    }

    @Override
    public String toString() {
        return "produto{" + "codigo=" + codigo + ", desc=" + desc + ", valor=" + valor + ", quantEstoque=" + quantEstoque + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + Objects.hashCode(this.codigo);
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
        final Produto other = (Produto) obj;
        return Objects.equals(this.codigo, other.codigo);
    }
    
    
    
}
