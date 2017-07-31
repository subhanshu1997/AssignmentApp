/*
 * AdminHome.java
 *
 * Created on __DATE__, __TIME__
 */

package com.example.ui;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.example.dao.FacultyDao;
import com.example.dao.StudentDao;
import com.example.model.Faculty;
import com.example.model.Student;
import com.example.util.Util;

/**
 *
 * @author  __USER__
 */
public class AdminHome extends javax.swing.JFrame {
	JPanel facultyPanel;
	JPanel studentPanel;

	/** Creates new form AdminHome */
	public AdminHome() {
		initComponents();
		setLocationRelativeTo(null);
		addTabData();
		setDefaultData();
	}

	String[] Faccolumns = new String[] { "Id", "Name", "Salary", "Mobile",
			"Address" };
	String[] Stdcolumns = new String[] { "Roll", "Name", "Marks", "Mobile",
			"Address" };

	private void addTabData() {
		facultyPanel = new JPanel();
		facultyPanel.setBackground(Color.red);
		jTabbedPane1.addTab("Faculty Panel", facultyPanel);

		JTable t = new JTable(new String[][] {
				{ "1", "deep", "45678", "Delhi", "345678" },
				{ "1", "deep", "45678", "Delhi", "345678" } }, Faccolumns);
		facultyPanel.add(new JScrollPane(t));

		studentPanel = new JPanel();
		studentPanel.setBackground(Color.green);
		jTabbedPane1.addTab("Student Panel", studentPanel);

		JTable t1 = new JTable(new String[][] {
				{ "1", "deep", "45678", "Delhi", "345678" },
				{ "1", "deep", "45678", "Delhi", "345678" } }, Stdcolumns);
		studentPanel.add(new JScrollPane(t1));
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jTabbedPane1 = new javax.swing.JTabbedPane();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jTextField4 = new javax.swing.JTextField();
		jTextField3 = new javax.swing.JTextField();
		jTextField2 = new javax.swing.JTextField();
		jTextField1 = new javax.swing.JTextField();
		jLabel7 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jComboBox2 = new javax.swing.JComboBox();
		jTextField5 = new javax.swing.JTextField();
		jComboBox1 = new javax.swing.JComboBox();
		jButton4 = new javax.swing.JButton();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setBackground(new java.awt.Color(153, 153, 255));

		jPanel1.setBackground(new java.awt.Color(153, 153, 255));

		jTabbedPane1.setBorder(new javax.swing.border.LineBorder(
				new java.awt.Color(0, 0, 0), 1, true));

		jLabel1.setText("Enter Name");

		jLabel2.setText("Enter Address");

		jLabel3.setText("Enter Mobile");

		jLabel6.setText("Enter Roll");

		jLabel7.setText("Enter Salary");

		jLabel5.setText("Select Course");

		jLabel4.setText("Select Role");

		jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"Select Course", "IT", "CS", "EC", "ME", "CIVIL" }));

		jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"Select Role", "Student", "Faculty" }));
		jComboBox1.addItemListener(new java.awt.event.ItemListener() {
			public void itemStateChanged(java.awt.event.ItemEvent evt) {
				jComboBox1ItemStateChanged(evt);
			}
		});
		jComboBox1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jComboBox1ActionPerformed(evt);
			}
		});

		jButton4.setBackground(new java.awt.Color(204, 204, 255));
		jButton4.setText("RETRIVE");

		jButton1.setBackground(new java.awt.Color(204, 204, 255));
		jButton1.setText("ADD");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setBackground(new java.awt.Color(204, 204, 255));
		jButton2.setText("DELETE");

		jButton3.setBackground(new java.awt.Color(204, 204, 255));
		jButton3.setText("UPDATE");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																false)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				22,
																				22,
																				22)
																		.addComponent(
																				jButton4)
																		.addGap(
																				32,
																				32,
																				32)
																		.addComponent(
																				jButton1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				88,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(
																				jButton2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				88,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(
																				18,
																				18,
																				18)
																		.addComponent(
																				jButton3,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				88,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								false)
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								jPanel1Layout
																										.createSequentialGroup()
																										.addGroup(
																												jPanel1Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addComponent(
																																jLabel1)
																														.addComponent(
																																jLabel2)
																														.addComponent(
																																jLabel3)
																														.addComponent(
																																jLabel6))
																										.addGap(
																												25,
																												25,
																												25)
																										.addGroup(
																												jPanel1Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addComponent(
																																jTextField4,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																146,
																																javax.swing.GroupLayout.PREFERRED_SIZE)
																														.addComponent(
																																jTextField3,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																146,
																																javax.swing.GroupLayout.PREFERRED_SIZE)
																														.addComponent(
																																jTextField2,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																146,
																																javax.swing.GroupLayout.PREFERRED_SIZE)
																														.addComponent(
																																jTextField1,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																146,
																																javax.swing.GroupLayout.PREFERRED_SIZE)))
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								jPanel1Layout
																										.createSequentialGroup()
																										.addGroup(
																												jPanel1Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addComponent(
																																jLabel7)
																														.addComponent(
																																jLabel5)
																														.addComponent(
																																jLabel4))
																										.addGap(
																												26,
																												26,
																												26)
																										.addGroup(
																												jPanel1Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addComponent(
																																jComboBox1,
																																0,
																																146,
																																Short.MAX_VALUE)
																														.addComponent(
																																jComboBox2,
																																0,
																																146,
																																Short.MAX_VALUE)
																														.addComponent(
																																jTextField5,
																																javax.swing.GroupLayout.Alignment.TRAILING,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																146,
																																Short.MAX_VALUE))))
																		.addGap(
																				95,
																				95,
																				95)))
										.addGap(48, 48, 48))
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(
												jTabbedPane1,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												458, Short.MAX_VALUE).addGap(
												36, 36, 36)));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel1)
														.addComponent(
																jTextField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel2)
														.addComponent(
																jTextField2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel3)
														.addComponent(
																jTextField3,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(11, 11, 11)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jTextField4,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel6))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jTextField5,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel7))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel5)
														.addComponent(
																jComboBox2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel4)
														.addComponent(
																jComboBox1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(40, 40, 40)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton1)
														.addComponent(jButton3)
														.addComponent(jButton2)
														.addComponent(jButton4))
										.addGap(18, 18, 18)
										.addComponent(
												jTabbedPane1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												195,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(25, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.Alignment.TRAILING,
				javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

		if (valid()) {
			if (role.equalsIgnoreCase("student")) {
				//student data add here
				Student s = new Student();
				s.setAddress(address);
				s.setCourse(course);
				s.setMarks(marks_salary);
				s.setMobile(mobile);
				s.setName(name);
				s.setRoll(id_roll);
				StudentDao sd = StudentDao.getStudentDao();
				int i = sd.insert(s);
				if (i > 0) {
					Util.show(this, "Successfully Registered");
					clear();
				} else {
					Util.show(this, "Registration Failed");

				}
			} else {
				Faculty s = new Faculty();
				s.setAddress(address);
				s.setCourse(course);
				s.setId(id_roll);
				s.setMobile(mobile);
				s.setName(name);
				s.setSalary(marks_salary);
				FacultyDao fd = FacultyDao.getFacultyDao();
				int i = fd.insert(s);
				if (i > 0) {
					Util.show(this, "Successfully Registered");
					clear();
				} else {
					Util.show(this, "Registration Failed");

				}
			}
		}
	}

	private void clear() {
		jTextField1.setText("");
		jTextField2.setText("");
		jTextField3.setText("");
		jTextField4.setText("");
		jTextField5.setText("");
		jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"Select Role", "Student", "Faculty" }));
		jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"Select Course", "IT", "CS", "EC", "ME", "CIVIL" }));
	}

	String name, address, mobile, course, id_roll, marks_salary, role;

	private boolean valid() {
		name = jTextField1.getText();
		address = jTextField2.getText();
		mobile = jTextField3.getText();
		id_roll = jTextField4.getText();
		marks_salary = jTextField5.getText();
		course = jComboBox2.getSelectedItem().toString();
		role = jComboBox1.getSelectedItem().toString();
		if (name.equals("")) {
			Util.showWarning(this, "Please Enter Name");
			jTextField1.requestFocus();
			return false;
		} else if (address.equals("")) {
			Util.showWarning(this, "Please Enter Address");
			jTextField2.requestFocus();
			return false;
		} else if (mobile.equals("")) {
			Util.showWarning(this, "Please Enter Mobile");
			jTextField3.requestFocus();
			return false;
		} else if (course.equalsIgnoreCase("Select Course")) {
			Util.showWarning(this, "Please Select Course");
			jComboBox2.requestFocus();
			return false;
		} else if (role.equalsIgnoreCase("select role")) {
			Util.showWarning(this, "Please Select Role");
			jComboBox1.requestFocus();
			return false;
		} else if (id_roll.equals("")) {
			Util.showWarning(this, "Please Enter Id/Roll");
			jTextField4.requestFocus();
			return false;
		} else if (marks_salary.equals("")) {
			Util.showWarning(this, "Please Enter Marks/Salary");
			jTextField5.requestFocus();
			return false;
		} else {
			return true;
		}
	}

	private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {
		// TODO add your handling code here:
	}

	private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {
		String data = jComboBox1.getSelectedItem().toString();
		if (!data.equalsIgnoreCase("Select role")) {

			if (data.equalsIgnoreCase("student")) {
				jLabel6.setText("Enter Roll");
				jLabel7.setText("Enter Marks");
				jTextField4.setVisible(true);
				jTextField5.setVisible(true);
			} else {
				jLabel6.setText("Enter Id");
				jLabel7.setText("Enter Salary");
				jTextField4.setVisible(true);
				jTextField5.setVisible(true);
			}

		} else {
			setDefaultData();
		}
	}

	private void setDefaultData() {
		jLabel6.setText("");
		jLabel7.setText("");
		jTextField4.setVisible(false);
		jTextField5.setVisible(false);
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new AdminHome().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JComboBox jComboBox1;
	private javax.swing.JComboBox jComboBox2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JTabbedPane jTabbedPane1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	private javax.swing.JTextField jTextField5;
	// End of variables declaration//GEN-END:variables

}