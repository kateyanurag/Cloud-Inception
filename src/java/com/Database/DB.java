package com.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
    private static final String DRIVER_CLASS_NAME =
        "oracle.jdbc.driver.OracleDriver";
    private static final String DATABASE_URL =
        "jdbc:oracle:thin:@localhost:1521:orcl";
    private static final String USERNAME = "scott";
    private static final String PASSWORD = "tiger";

    public static Connection getConnection() 
                throws SQLException {
        try {
            Class.forName(DRIVER_CLASS_NAME);
        } catch(ClassNotFoundException e) {
            System.out.println(e);
            System.exit(1);
        }
        
        Connection connection = DriverManager.getConnection(DATABASE_URL,
                USERNAME,PASSWORD);
        return(connection);
    }
}
