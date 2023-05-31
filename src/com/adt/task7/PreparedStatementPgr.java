package com.adt.task7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

//-------------------------6 steps of jdbc connectivity-----------------
//(1) Import Package
//(2) Load & Register Driver
//(3) Opening Database Connection to MYSQL Server
//(4) Getting Statement object to execute query
//(5) Executing Query
//(6) Close Connection

//----------------------------------------------------------------------------

public class PreparedStatementPgr {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		Statement st=null;
		Connection con=null;
		 
		try
		{
			//step 2
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step 3
			String db_url="jdbc:mysql://localhost:3306/alphadot?useSSL=true";
			String db_uname="root";
			String db_upass="root";
			
			con=DriverManager.getConnection(db_url,db_uname,db_upass);
			
			//step 4
			//st=con.createStatement();
			
			//step 5
			String q="insert into alphadot.employee values (?,?)";
			
			//get the PreparedStatement Object
			PreparedStatement pstmt=con.prepareStatement(q);
			
			//set the values to query
			pstmt.setInt(1, 105);
			pstmt.setString(2, "Ankit");
			
			pstmt.setInt(1, 106);
			pstmt.setString(2, "Aman");
			
			pstmt.setInt(1, 107);
			pstmt.setString(2, "Rhydam");
			
			pstmt.setInt(1, 114);
			pstmt.setString(2, "Greetyansh");
			
			pstmt.executeUpdate();
			
			System.out.println("Data Successfully Inserted");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			if(con!=null )
			{
				//step 6
				con.close();
			}
		}
		
	}

}
