package com.adt.task7;

//-------------------------6 steps of jdbc connectivity-----------------
//(1) Import Package
//(2) Load & Register Driver
//(3) Opening Database Connection to MYSQL Server
//(4) Getting Statement object to execute query
//(5) Executing Query
//(6) Close Connection

//----------------------------------------------------------------------------

//step 1
import java.util.*;
import java.sql.*;

public class JdbcConnUserInput {

	public static void main(String[] args) throws SQLException {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee ID Number:- ");
		String s1=sc.next();
		
		System.out.println("Enter Employee Name:- ");
		String s2=sc.next();
		
		Statement st=null;
		Connection con=null;
		
		try
		{
			//step 2
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step 3
			String db_url="jdbc:mysql://localhost:3306/alphadot?useSSL=false";
			String db_uname="root";
			String db_upass="root";

			con=DriverManager.getConnection(db_url,db_uname,db_upass);

			//step 4
			st=con.createStatement();
			
			//step 5
			String q="insert into alphadot.employee values ('"+s1+"','"+s2+"')";

			int execute = st.executeUpdate(q);
			System.out.println(execute);
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
