/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author cimam
 */
public class ProdutoDAO {

    private String nomeArq = null;

    private Connection con = null;

    public ProdutoDAO() throws SQLException {
        if (con == null) {
            String url = "jdbc:mysql://localhost:3306/POO3";
            String usr = "root";
            String senha = "1234";
            con = DriverManager.getConnection(url, usr, senha);
        }
    }

    public ProdutoDAO(String nomeArq) {
        this.nomeArq = nomeArq;

    }

    public void gravaEmBanco(Produto prod) throws SQLException {
        //Primeiro Passo: obter a conexão
        if (con != null) {
            //Segundo Passo: preparar o comando SQL
            String sql = "Insert into Produto"
                    + "(codigo,descricao, valor, quantEstoque) values"
                    + "(?,?,?,?)";
            //Terceiro passo, passar o comando SQL para o Java
            PreparedStatement comando = con.prepareStatement(sql);
            comando.setString(1, prod.getCodigo());
            comando.setString(2, prod.getDesc());
            comando.setDouble(3, prod.getValor());
            comando.setInt(4, prod.getQuantEstoque());
            comando.executeUpdate();
        }
    }

    public void grava(Produto produto) throws IOException {
        FileWriter arquivoSaida; //objeto para o arquivo
        //onde a escrita será realizada
        PrintWriter out; //objeto para escrever 

        //instanciar as classes
        arquivoSaida = new FileWriter(nomeArq, true); //abertura 
        //do arquivo
        out = new PrintWriter(arquivoSaida);

        //gravar os dados no arquivo
        out.println(produto);

        //fechar o arquivo
        out.close();
        arquivoSaida.close();

    }

    public void gravaTodos(Collection<Produto> produtos) throws IOException {
        FileWriter file;

        PrintWriter out;

        file = new FileWriter("funcionarios.txt");

        out = new PrintWriter(file);

        for (Produto tempFuncionario : produtos) {
            out.println(tempFuncionario.getCodigo());
            out.println(tempFuncionario.getDesc());
            out.println(tempFuncionario.getValor());
        }

    }

    public Produto recuperaEmBanco(String codigo) throws SQLException {
        //Avalirar se a conexão está ativa
        if (con != null) {
            String sql = "select codProd,descricao, valor, quantEstoque, "
                    + "codigo from produto where codigo =?";
            //Construir o comando sql com seus parâmetros
            PreparedStatement comando = con.prepareStatement(sql);
            comando.setString(1, codigo);

            //executar o comando sql para obter os resultados
            ResultSet resultado = comando.executeQuery();

            //Observar se há tupla retornada
            if (resultado.next()) {
                Produto prod = new Produto();
                prod.setCodProd(resultado.getInt("codProd"));
                prod.setCodigo(resultado.getString("codigo"));
                prod.setDesc(resultado.getString("descricao"));
                prod.setValor(resultado.getDouble("Valor"));
                prod.setQuantEstoque(resultado.getInt("QuantEstoque"));
                return prod;
            }
        }
        return null;
    }

    public Produto recupera(String codigo)
            throws FileNotFoundException {
        FileReader arquivoIn = new FileReader("produtos.txt");
        Scanner leitor = new Scanner(arquivoIn);

        //Procurar o código do produto através da leitura
        //enquanto houver dados lidos
        while (leitor.hasNext()) {
            String cod = leitor.nextLine();
            String desc = leitor.nextLine();
            String preco = leitor.nextLine();
            int quant = leitor.nextInt();

            if (cod.equalsIgnoreCase(codigo)) {
                return new Produto(cod, desc,
                        Double.parseDouble(preco), quant);
            }
        }
        return null;

    }

    public Collection<Produto> recuperaTodos() {
        return null;
    }

    //método para encerra a conexão
    public void fechaConexao() throws SQLException {
        con.close();
    }

    public static void main(String[] args) {
        try {
            /*try {
            ProdutoDAO dao = new ProdutoDAO("produtos.txt");
            //teste rapido
            Produto prod = dao.recupera("30");
            
            JOptionPane.showMessageDialog(null,
            prod==null?"codigo inexistente":
            prod);
            
            } catch (FileNotFoundException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,
            "Houve erro na leitura :"+ex.getMessage());
            
            }*/

            //selecionar um produto
            Produto prod = new ProdutoDAO().recuperaEmBanco("10");

            JOptionPane.showMessageDialog(null,
                    prod == null ? "não há produto com esse codigo" : prod);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,
                    "Reveja os parâmetros da conexão"
                    + "\n" + ex.getMessage());

            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
