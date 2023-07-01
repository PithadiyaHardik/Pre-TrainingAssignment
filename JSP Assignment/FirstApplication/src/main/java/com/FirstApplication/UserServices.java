package com.FirstApplication;
import java.sql.*;

public class UserServices {
	
	private static String driver="com.mysql.cj.jdbc.Driver";
	private static String username="root";
	private static String password="";
	private static String url="jdbc:mysql://localhost:3306/Users";
	private PreparedStatement ps;
	Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName(driver);
		return DriverManager.getConnection(url,username,password);
	}
	
	boolean login(String username,String password) throws ClassNotFoundException, SQLException {
		Connection c=getConnection();
		ps=c.prepareStatement("select * from users where username=? and password=?");
		ps.setString(1, username);
		ps.setString(2, password);
		ResultSet rs=ps.executeQuery();
		
		if(rs.next())
		{
			return true;
		}
		else {
			return false;
		}
	}
	
	boolean Register(String name,String email,String username,String password) throws ClassNotFoundException, SQLException
	{
		Connection c=getConnection();
		ps=c.prepareStatement("insert into users(name,email,username,password) values(?,?,?,?)");
		ps.setString(1,name);
		ps.setString(2,email);
		ps.setString(3, username);
		ps.setString(4,password);
		int res=ps.executeUpdate();
		if(res>0)
		{
			return true;
		}
		else {
			return false;
		}
	}
	

}
