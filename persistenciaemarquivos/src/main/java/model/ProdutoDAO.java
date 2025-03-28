package model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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

    public void grava(Produto produto) throws IOException {
        FileWriter arquivoSaida; //objeto para o arquivo onde a escrita será realizada

        PrintWriter out; //objeto para escrever
        //Instanciar as classes
        arquivoSaida = new FileWriter(nomeArq, true); //abertura do arquivo

        out = new PrintWriter(arquivoSaida);

        //gravar os dados no arquivo
        out.println(produto);

        //fechar o arquivo
        out.close();
        arquivoSaida.close();
    }

    public void gravaTodos(Collection<Produto> produtos) {

    }

    public Produto recupera(String codigo) throws FileNotFoundException {
        FileReader arquivoIn = new FileReader("produtos.txt");
        Scanner leitor = new Scanner(arquivoIn);

        //Procurar o código do produto através da leitura enquanto houver 
        while (leitor.hasNext()) {
            String cod = leitor.nextLine();
            String desc = leitor.nextLine();
            double preco = leitor.nextDouble();
            int quant = leitor.nextInt();

            if (cod.equalsIgnoreCase(codigo)) {
                return new Produto(cod, desc, preco, quant);
            }
        }
        return null;
    }

    public Collection<Produto> recuperaTodos() {
        return null;
    }

    public static void main(String[] args) throws SQLException {
        /* try {
            ProdutoDAO dao = new ProdutoDAO("produtos.txt");
            //teste rapido
            Produto prod = dao.recupera("40");

            JOptionPane.showMessageDialog(null, prod == null ? "codigo inexistente" : prod);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Houve erro na leitura: " + ex.getMessage());
        }

    }*/
        try {
            new ProdutoDAO();
            JOptionPane.showMessageDialog(null, "Conexão efetuada");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Reveja os parâmetros da conexão" + "\n" + ex.getMessage());
        }

    }
}
