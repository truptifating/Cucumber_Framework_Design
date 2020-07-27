package com.qa.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection 
{

	public static DatabaseConnection instance;
    public Connection connection;
    public static Statement s;
    public static ResultSet r;
    public String url = "Database Url;databaseName=_QA;";
    public String username = " ";
    public String password = " ";
    
    public DatabaseConnection() throws SQLException
    {
    	try 
    	{
    		 System.out.println("Start of PRAGRAM ");
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
             this.connection = DriverManager.getConnection(url, username, password);
             s=connection.createStatement();
        } 
    	catch (ClassNotFoundException ex)
    	{
            System.out.println("Database Connection Creation Failed : " + ex.getMessage());
        }
    }
    
    public Connection getConnection() 
    {
        return connection;
    }
    
    public static DatabaseConnection getInstance() throws SQLException
    {
        if (instance == null) 
        {
            instance = new DatabaseConnection();
            r=null;
      	  	System.out.println("Inside Method");	  
      	  	ResultSet r=s.executeQuery("Put SQL query here");	
      	  	System.out.println("Query contains records "+r.getFetchSize());           
        } 
        else if (instance.getConnection().isClosed()) 
        {
            instance = new DatabaseConnection();
        }
        return instance;
    }
    
}
