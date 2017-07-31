package com.example.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {
	Connection con;
	Test(){
		try{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/deep","root","root");	
		}catch (Exception e) {
			// TODO: handle exception
		}
		}
	
	void showWithStatement(){
		try{
		
			Statement smt=con.createStatement();
			//smt.execute("create table student (name varchar(10),roll int primary key)");
	        //smt.executeUpdate("insert into student values('sonu',3)");
	       //smt.executeUpdate("update student set name='raju' where roll=1");
			//smt.executeUpdate("delete from student where roll=1");
			ResultSet rs=smt.executeQuery("select * from student");
			while(rs.next()){
				System.out.println(rs.getString(1)+"\t"+rs.getInt(2));
			}
			
			con.close();
	System.out.println("success");
		}catch (Exception e) {
			System.out.println(e);
		}
	}
	
	void showWithPrepareStatement(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/deep","root","root");
			PreparedStatement ps=con.prepareStatement("select * from student");
			//smt.execute("create table student (name varchar(10),roll int primary key)");
	        //smt.executeUpdate("insert into student values('sonu',3)");
	       //smt.executeUpdate("update student set name='raju' where roll=1");
			//smt.executeUpdate("delete from student where roll=1");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				System.out.println(rs.getString(1)+"\t"+rs.getInt(2));
			}
			
			con.close();
	System.out.println("success");
		}catch (Exception e) {
			System.out.println(e);
		}
	}
	
public static void main(String[] args) {
	new Test().showWithPrepareStatement();
}
}
