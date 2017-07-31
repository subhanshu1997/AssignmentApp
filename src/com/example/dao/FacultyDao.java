package com.example.dao;

import java.sql.PreparedStatement;

import com.example.model.Faculty;

public class FacultyDao {

	private static FacultyDao fd=new FacultyDao();
	
	private FacultyDao(){}
	
	public static FacultyDao getFacultyDao(){
		return fd;
	}
	
	public int insert(Faculty f){
		int i=0;
		try{
			PreparedStatement ps=Dao.getConnection().prepareStatement("insert into faculty values(?,?,?,?,?,?)");
			ps.setString(1,f.getName());
			ps.setString(2,f.getId());
			ps.setString(3,f.getAddress());
			ps.setString(4,f.getCourse());
			ps.setString(5,f.getSalary());
			ps.setString(6,f.getMobile());
			i=ps.executeUpdate();
		}catch (Exception e) {
		System.out.println(e);
		}
		return i;
	}
	
}
