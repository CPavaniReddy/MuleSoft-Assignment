package net.codejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLiteDemo1 {

	public static void main(String[] args) {
		String jdbcUrl="jdbc:sqlite:/C:\\Users\\Pavani\\OneDrive\\Desktop\\MuleSoft\\sqlite-tools-win32-x86-3390000\\mulesoftdb.db";
		try {
			Connection connect=DriverManager.getConnection(jdbcUrl);
			String sql="SELECT rowid,* FROM movies";
			Statement stmt=connect.createStatement();
			ResultSet res=stmt.executeQuery(sql);
			while(res.next())
			{
				Integer id=res.getInt("rowid");
				String name=res.getString("name");
			    String hero_name=res.getString("hero_name");
			    String heroine_name=res.getString("heroine_name");
			    String director_name=res.getString("director_name");
			    Integer year_o_r=res.getInt("year_o_r");
			    
			    System.out.println(id+" | "+name+" | "+hero_name+" | "+heroine_name+" | "+director_name+" | "+year_o_r);
			}
			
		} catch (SQLException e) 
		{
		   System.out.println("Error connecting to SQLite database");
		   e.printStackTrace();
		}

	}


}
