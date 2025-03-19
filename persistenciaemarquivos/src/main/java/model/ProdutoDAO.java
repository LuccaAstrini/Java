package model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

public class ProdutoDAO {
    
    
    private String nomeArq = null;
    
    public ProdutoDAO(String nomeArq){
        this.nomeArq = nomeArq;
    }            
            
    public void grava(Produto produto) throws IOException{  
        FileWriter arquivoSaida; //objeto para o arquivo onde a escrita será realizada
        
        PrintWriter out; //objeto para escrever
        //Instanciar as classes
        arquivoSaida = new FileWriter(nomeArq); //abertura do arquivo
        
        out = new PrintWriter(arquivoSaida);
        
        //gravar os dados no arquivo
        out.println(produto);
        
        //fechar o arquivo
        out.close();
        arquivoSaida.close();
    }
    
    public void gravaTodos(Collection <Produto> produtos){
        
    }
    
    public Produto recupera(String codigo){
        return null;
    }
    public Collection<Produto> recuperaTodos(){
        return null;
    }
    
}
