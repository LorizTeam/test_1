package com.smict.struts.data;
import java.util.*;
import java.sql.*;

import com.smict.struts.form.IndexForm;

public class retrivedata {
	public List retrive () throws ClassNotFoundException, SQLException{
		List retrive_data = new ArrayList ();
		dbconnect dbcon = new dbconnect();
		Connection con = dbcon.DBconn_mysql();
		String sqlQuery = "select * from employee";
		Statement stmt = con.createStatement();
		String username="",password="",name="",lastname="",address="";
		ResultSet rs = stmt.executeQuery(sqlQuery);
		while(rs.next()){
			username = rs.getString("username");
			password= rs.getString("password");
			name = rs.getString("name");
			lastname= rs.getString("lastname");
			address = rs.getString("address");
			retrive_data.add(new IndexForm(username,password,name,lastname,address));
		}
		rs.close();
		stmt.close();
		con.close();
		return retrive_data;
	}
}
