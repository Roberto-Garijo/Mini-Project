/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spdvi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import spdvi.dataaccess.DataAccess;

/**
 *
 * @author Alumne
 */
public class DataAcces {
    
    private Connection getConnection() {
        Connection connection = null;
        Properties properties = new Properties();
        
        try {
            properties.load(DataAccess.class.getClassLoader().getResourceAsStream("application.properties"));
            connection = DriverManager.getConnection(properties.getProperty("url"), properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}
