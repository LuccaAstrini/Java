package com.mycompany.trabalhosql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SqlUpdateSchemas {
    
    public PreparedStatement queryUpdateResidencia(Connection connection) throws SQLException {
        return connection.prepareStatement("???");
    }

    public PreparedStatement queryUpdatePessoa(Connection connection) throws SQLException {
        return connection.prepareStatement("???");
    }
}
