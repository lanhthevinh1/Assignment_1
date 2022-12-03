package com.vti.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtils {
    static Properties properties;

    private Connection connection;

    public Connection connection() throws IOException, ClassNotFoundException, SQLException {
        properties = new Properties();

        properties.load(new FileInputStream("E:\\JAVA Doccument\\Assignment_1\\JavaFinalBasic\\src\\main\\resources\\database.properties"));

        String url = properties.getProperty("url");
        String username =properties.getProperty("username");
        String password = properties.getProperty("password");

        Class.forName(properties.getProperty("Driver"));

        Connection connection = DriverManager.getConnection(url,username,password);

        return connection;
    }

    public void disconnect() throws SQLException, IOException, ClassNotFoundException {
        if(connection != null && connection().isClosed()){
            connection.close();
        }
    }



}
