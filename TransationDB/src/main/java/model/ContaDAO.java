package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ContaDAO {

    private Connection con = null;

    public void conecta() throws SQLException {
        con = DriverManager.getConnection("jdbc:mysql:/?localhost:3306/POO3", "root", "1234");
    }

    void transferencia(int idOrigem, int idDestino, double valor) throws SQLException {
        //Inicia a transação
        con.setAutoCommit(false);
        try {
            String sql = "Update Conta set saldo = saldo +? "
                    + "where idConta = ?";
            PreparedStatement comando
                    = con.prepareStatement(sql);
            comando.setDouble(1, (-1) * valor);
            comando.setInt(2, idOrigem);
            comando.executeUpdate();

            comando.setDouble(1, valor);
            comando.setInt(2, idDestino);
            comando.executeUpdate();
            con.commit();
        } catch (SQLException ex) {
            con.rollback();
        } finally {
            con.setAutoCommit(true);
        }
    }

}
