package com.smict.struts.data;
import java.util.*;
import java.sql.*;

import com.smict.struts.form.IndexForm;
import com.smict.struts.form.MainForm;
public class checklogin {
	public IndexForm chklogin (String username , String password) throws ClassNotFoundException, SQLException{
		
		dbconnect dbcon = new dbconnect();
		Connection con = dbcon.DBconn_mysql();
		String sqlQuery = "select * from employee where username = '"+username+"' and password = '"+password+"'";
		Statement stmt = con.createStatement();
		ResultSet rs= stmt.executeQuery(sqlQuery);
		List check = new ArrayList();
		//String name ="",lastname="",address="";
		MainForm mf = new MainForm();
		IndexForm idf = new IndexForm(); 
		if(rs.next()){
			//username = rs.getString("username");
			//password = rs.getString("password");
			//name = rs.getString("name");
			//lastname = rs.getString("lastname");
			//address = rs.getString("address");
			//check.add(new IndexForm(username,password,name,lastname,address));
			//mf.setUsername(rs.getString("username"));
			//mf.setPassword(rs.getString("password"));
			//mf.setName(rs.getString("name"));
			//mf.setLastname(rs.getString("lastname"));
			//mf.setAddress(rs.getString("address"));
			idf.setUser(rs.getString("username"));
			idf.setPass(rs.getString("password"));
			idf.setName(rs.getString("name"));
			idf.setLastname(rs.getString("lastname"));
			idf.setAddress(rs.getString("address"));
			idf.setIstrue(true);
		}
		con.close();
		stmt.close();
		rs.close();
		return idf;
	}
public MainForm chklogin1 (String username , String password) throws ClassNotFoundException, SQLException{
		
		dbconnect dbcon = new dbconnect();
		Connection con = dbcon.DBconn_mysql();
		String sqlQuery = "select * from employee where username = '"+username+"' and password = '"+password+"'";
		Statement stmt = con.createStatement();
		ResultSet rs= stmt.executeQuery(sqlQuery);
		List check = new ArrayList();
		//String name ="",lastname="",address="";
		MainForm mf = new MainForm();
		IndexForm idf = new IndexForm(); 
		if(rs.next()){
			//username = rs.getString("username");
			//password = rs.getString("password");
			//name = rs.getString("name");
			//lastname = rs.getString("lastname");
			//address = rs.getString("address");
			//check.add(new IndexForm(username,password,name,lastname,address));
			mf.setUsername(rs.getString("username"));
			mf.setPassword(rs.getString("password"));
			mf.setName(rs.getString("name"));
			mf.setLastname(rs.getString("lastname"));
			mf.setAddress(rs.getString("address"));
			
		}
		con.close();
		stmt.close();
		rs.close();
		return mf;
	}
}
