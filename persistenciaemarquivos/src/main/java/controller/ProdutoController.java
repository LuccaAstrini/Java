package controller;

import java.io.IOException;
import model.Produto;
import model.ProdutoDAO;

public class ProdutoController {
    
    public void grava(String cod, String desc, double preco, int estoque) throws IOException{
        //Instanciar Produto
        Produto produto = new Produto(cod, desc, preco, estoque);
        new ProdutoDAO("produtos.txt").grava(produto);
    }
}
