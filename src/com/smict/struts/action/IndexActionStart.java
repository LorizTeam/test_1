/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.smict.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.smict.struts.data.retrivedata;
import com.smict.struts.form.IndexForm;
import java.sql.*;
import java.util.*;

/** 
 * MyEclipse Struts
 * Creation date: 04-22-2015
 * 
 * XDoclet definition:
 * @struts.action path="/index" name="indexForm" input="index.jsp" scope="request" validate="true"
 */
public class IndexActionStart extends Action {
	/*
	 * Generated Methods
	 */

	/** 
	 * Method execute
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		IndexForm indexForm = (IndexForm) form;// TODO Auto-generated method stub
		
		String forwardText = "success";
		
		
		IndexForm inf = (IndexForm) form;
		String tb1 = inf.getTb1(),tb2 = inf.getTb2(),tb3 = inf.getTb3(),tb4 = inf.getTb4(),tb5 = inf.getTb5();
		retrivedata rtd = new retrivedata();
		List lrtd ;
		
		try {
			lrtd = rtd.retrive();
			request.setAttribute("lrtd", lrtd);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return mapping.findForward(forwardText);
	}
}