package com.mycompany.trabalhosql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SqlDeleteSchemas {

    public PreparedStatement queryDeletePessoa(Connection connection) throws SQLException {
        return connection.prepareStatement("???");
    }

    public PreparedStatement queryDeleteResidencia(Connection connection) throws SQLException {
        return connection.prepareStatement("???");
    }
}
