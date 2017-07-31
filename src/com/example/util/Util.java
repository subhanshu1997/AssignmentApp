package com.example.util;

import java.awt.Component;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public class Util {

	public static void showError(Component cmp,String msg){
    JOptionPane.showMessageDialog(cmp, msg,"ERROR-MESSAGE",JOptionPane.ERROR_MESSAGE);		
	}
	public static void showWarning(Component cmp,String msg){
	    JOptionPane.showMessageDialog(cmp, msg,"WARNING-MESSAGE",JOptionPane.ERROR_MESSAGE);		
		}
	public static void show(Component cmp,String msg){
	    JOptionPane.showMessageDialog(cmp, msg);		
		}
	public static void setUi(){
		try{
			LookAndFeelInfo l[]=UIManager.getInstalledLookAndFeels();
			UIManager.setLookAndFeel(l[1].getClassName());
		}catch (Exception e) {
			System.out.println(e);
		}
	}
	
}
