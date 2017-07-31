package com.example.dao;

import java.sql.PreparedStatement;

import com.example.model.Student;

public class StudentDao {
	private static StudentDao sd=new StudentDao();

	public static StudentDao getStudentDao(){
		return sd;
	}
	
	private StudentDao(){}
	
	
	public int insert(Student std){
		int i=0;
		try{
			PreparedStatement ps=Dao.getConnection().prepareStatement("insert into student values(?,?,?,?,?,?)");
			ps.setString(1,std.getName());
			ps.setString(2,std.getRoll());
			ps.setString(3,std.getAddress());
			ps.setString(4,std.getCourse());
			ps.setString(5,std.getMarks());
			ps.setString(6,std.getMobile());
			i=ps.executeUpdate();
		}catch (Exception e) {
		System.out.println(e);
		}
		return i;
	}
	
}
