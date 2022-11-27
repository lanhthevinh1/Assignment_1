package com.vti.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DatabaseProperties {
    public static final String RESOURCE_FOLDER_URL = "E:\\JAVA Doccument\\JDBCMavenDemo\\src\\main\\resources\\database.properties";

    private Properties properties;


    public DatabaseProperties() throws IOException {
        properties = new Properties();
        properties.load(new FileInputStream(RESOURCE_FOLDER_URL + "database.properties"));
    }
}
