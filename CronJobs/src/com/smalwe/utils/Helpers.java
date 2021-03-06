package com.smalwe.utils;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

// Notice, do not import com.mysql.jdbc.*
// or you will have problems!

public class Helpers {
	
	
    public static void main(String[] args) {
    	
    	
    	
        try {
            // The newInstance() call is a work around for some
            // broken Java implementations

            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = getConnection();
            System.out.println("COnnection success!!");
            conn.close();
        } catch (Exception ex) {
            // handle the error
        	ex.printStackTrace();
        }
    }
    
    public static Connection getConnection() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException, IOException {
    	  Properties prop;
    	  prop = getProp();
    	  String url = prop.getProperty("db_url");
    	  String dbName = prop.getProperty("dbName");
    	  String driver = prop.getProperty("jdbcDriver");
    	  String userName = prop.getProperty("username");
    	  String password = prop.getProperty("pass");
		  Connection conn = null;
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
	        conn = DriverManager.getConnection(url+dbName,userName,password);
		}
		  catch (Exception e) {
			  e.printStackTrace();
		  }
    	return conn;
    }
    
    public static Properties getProp() throws IOException {
		
    	Properties prop = new Properties();
		File file = new File("config.properties");
		FileInputStream input = new FileInputStream(file);
		prop.load(input);
		input.close();
		return prop;	
		
	}
    
    
}