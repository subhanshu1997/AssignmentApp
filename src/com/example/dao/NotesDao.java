package com.example.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.example.model.Faculty;
import com.example.model.Note;

public class NotesDao {
private static NotesDao fd=new NotesDao();
	
	private NotesDao(){}
	
	public static NotesDao getNotesDao(){
		return fd;
	}
	
	public int insert(Note f){
		int i=0;
		try{
			PreparedStatement ps=Dao.getConnection().prepareStatement("insert into notes values(?,?,?)");
			ps.setString(1,f.getName());
			ps.setString(2,f.getLocation());
			ps.setString(3,f.getDate());
			
			i=ps.executeUpdate();
		}catch (Exception e) {
		System.out.println(e);
		}
		return i;
	}
	public List<Note> getAllNotes(){
		List<Note> list=new ArrayList<Note>(); 
		try{
			PreparedStatement ps=Dao.getConnection().prepareStatement("select * from notes");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Note n=new Note();
				n.setName(rs.getString(1));
				n.setLocation(rs.getString(2));
				n.setDate(rs.getString(3));
				list.add(n);
			}
		}catch (Exception e) {
		System.out.println(e);
		}	
		return list;
	}
	
}





