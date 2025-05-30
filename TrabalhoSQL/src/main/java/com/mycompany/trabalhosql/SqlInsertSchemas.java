package com.mycompany.trabalhosql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SqlInsertSchemas {
    
    public PreparedStatement queryInsertResidencia(Connection connection) throws SQLException {
        return connection.prepareStatement("???");
    }

    public PreparedStatement queryInsertPessoa(Connection connection) throws SQLException {
        return connection.prepareStatement("???");
    }
}
