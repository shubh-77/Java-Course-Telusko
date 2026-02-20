package com.shubham;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class DemoJdbc {

	public static void main(String[] args) throws Exception {



		String url="jdbc:postgresql://localhost:5432/demo";
		String uname="postgres";
		String pass="password";


		System.out.println(Class.forName("org.postgresql.Driver"));

		Connection con= DriverManager.getConnection(url,uname,pass);
		System.out.println("Connection established");
		//Insert query
		
		String sql = "insert into public.student values (?,?,?)";

			
		
		
		int id=10,marks=48;
		String name="Max";
		
		  PreparedStatement prepareStatement = con.prepareStatement(sql);
		prepareStatement.setInt(1, id);
		prepareStatement.setString(2, name);
		prepareStatement.setInt(3, marks);
		
		if(prepareStatement.execute()) {
			System.out.println("Statment executed");
		}

		
		
		
		
		
//		if(st.execute(sql)) {
//			System.out.println("Data Inserted");
//		}
//		 

//		Statement st = con.createStatement();
		
		
//		String sql="delete from student where sid=6;";
//		
//		if(st.execute(sql)) {
//			System.out.println("Data deleted");
//		}
		
		
		
		
//		Update operation
//		String sql ="Update public.student set sname='Max' where sid= 6;";
//		if(st.execute(sql)) {
//			System.out.println("Data updated");
//		}
		
		
		
	
		
		
		
		
		
		
		
		
//      Read Operation

//		String sql = "SELECT * FROM public.student";

//		ResultSet rs = createStatement.executeQuery(sql);
		
		//skips the row before 1st row
		//		rs.next();
		//		
		//		String name=rs.getString("sname");
		//				System.out.println("Name of student is:"+name);
			
//		while(rs.next()) {
//			
//			System.out.print("sid - "+rs.getString(1));
//			System.out.print(",sname - "+rs.getString(2));
//			System.out.println(",marks - "+rs.getString(3));
//
//
//		}
		
		
		con.close();
		System.out.println("Connection closed");
		
		

		


	}
}
