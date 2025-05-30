package com.mycompany.trabalhosql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SqlSelectSchemas {
    
    public PreparedStatement querySelectResidenciaPrepared(Connection connection) throws SQLException {
        return connection.prepareStatement("");
    }

    public ResultSet querySelectResidenciaResult(Connection connection) throws SQLException {
        PreparedStatement PS = querySelectResidenciaPrepared(connection);
        return PS.executeQuery();
    }

    public PreparedStatement querySelectPessoaPrepared(Connection connection) throws SQLException {
        return connection.prepareStatement("???");
    }

    public ResultSet querySelectPessoaResult(Connection connection) throws SQLException {
        PreparedStatement PS = querySelectPessoaPrepared(connection);
        return PS.executeQuery();
    }

    public PreparedStatement querySelectPessoasPrepared(Connection connection) throws SQLException {
        return connection.prepareStatement("???");
    }

    public ResultSet querySelectPessoasResult(Connection connection) throws SQLException {
        PreparedStatement PS = querySelectPessoasPrepared(connection);
        return PS.executeQuery();
    }
}
