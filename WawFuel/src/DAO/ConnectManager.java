package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectManager {

	
	    private static final String JDBC_LOADER = "com.mysql.cj.jdbc.Driver";
	    private static final String URL = System.getenv("DB_URL");
	    private static final String LOGIN = System.getenv("DB_USERNAME");
	    private static final String PASSWORD = System.getenv("DB_PASSWORD");

	    private Connection connection;

	    public ConnectManager() throws ClassNotFoundException, SQLException{
	        Class.forName(JDBC_LOADER);
	        connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
	    }

	    public Connection getConnection() throws SQLException{
	        return connection;
	    }
	    
	   
	    
	}
	
	

