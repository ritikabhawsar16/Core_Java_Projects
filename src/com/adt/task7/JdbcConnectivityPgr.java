package com.adt.task7;

//step 1
import java.sql.*;

//-------------------------6 steps of jdbc connectivity-----------------
// (1) Import Package
// (2) Load & Register Driver
// (3) Opening Database Connection to MYSQL Server
// (4) Getting Statement object to execute query
// (5) Executing Query
// (6) Close Connection

//----------------------------------------------------------------------------

public class JdbcConnectivityPgr {

	public static void main(String[] args) throws SQLException  
	{
		
		//alphadot=database name 
		//employee=table name
		// TODO Auto-generated method stub
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
			String q="insert into employee values (113,'Jiya')";

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
