/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.IOException;
import java.sql.SQLException;
import model.Produto;
import model.ProdutoDAO;

/**
 *
 * @author cimam
 */
public class ProdutoController {
    
    public void grava(String cod, String desc, double preco,
            int estoque) throws IOException, SQLException{
        //instanciar Produto
        Produto produto = new Produto(cod,desc,preco,estoque);
        new ProdutoDAO("produtos.txt").grava(produto);
        new ProdutoDAO().gravaEmBanco(produto);
    }
    
}
