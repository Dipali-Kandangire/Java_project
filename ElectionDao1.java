package com.tka.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ElectionDao1 {
	
	public ArrayList<String> getCandidateState()
	{
		ArrayList<String> arrayList=new ArrayList<String>();
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");//load JDBC driver
	
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/election", "root", "12345");
		//connection of DB
		System.out.println("Connected");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from states");
		while(rs.next()) //Iterates through each row of the result set.
		{
		
		 arrayList.add(rs.getString("stnm"));
			//Fetches the value of the stnm (state name) column and adds it to the list.
		}
		
		}
		catch (SQLException |ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return arrayList;
	}

}
