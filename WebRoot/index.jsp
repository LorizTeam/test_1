<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ page import ="com.smict.struts.data.*"%>
<%@ page import ="com.smict.struts.form.*"%>
<%@ page import ="java.util.*" %>
<%@ page import ="java.sql.*" %>
<html> 
	<head>
		<title>kkokokoko3</title>
	</head>
	
	//5555
	<body>
		<html:form action="index1">
			<%	if(request.getAttribute("lrtd") != null){
					List lrtd = (List)request.getAttribute("lrtd");
					for(Iterator iteritem = lrtd.iterator();iteritem.hasNext();){
					
						IndexForm idf = (IndexForm) iteritem.next();
			%>
				<ul>
				<li><%=idf.getTb1() %></li>
				<li><%=idf.getTb2() %></li>
				<li><%=idf.getTb3() %></li>
				<li><%=idf.getTb4() %></li>
				<li><%=idf.getTb5() %></li>
				</ul>
			 <html:text property="tb1" value="<%=idf.getTb1() %>"/>
			 <html:text property="tb2" value="<%=idf.getTb2() %>"/>
			 <html:text property="tb3" value="<%=idf.getTb3() %>"/>
			 <html:text property="tb4" value="<%=idf.getTb4() %>"/>
			 <html:text property="tb5" value="<%=idf.getTb5() %>"/>
			<%
					}
				}
			 %>
			 <br/><br/>
			 <%=request.getAttribute("username") %>
			 <% String usern= (String)request.getAttribute("username"); 
			 %>
		<br/><br/>Username : <html:text property="user" value="<%=usern %>"/> 
		<br/><br/>Password : <html:text property="pass" />
		<br/><br/>name : <html:text property="name" />
		<br/><br/>lastname : <html:text property="lastname" />
		<br/><br/>address : <html:text property="address" />
		<br/><br/>Show Username : <html:text property="showuser" />
		<br/><br/>Show Username : <html:text property="showpass" />
		<br/><br/><html:submit property = "btnsubmit" value="btnsubmit"/>
		<%=request.getAttribute("user_name") %>
		<%String show_usern = (String)request.getAttribute("user_name"); %>
		<br/><br/>show user after : <html:text property="show_usern" value="" />
		<br/><br/><html:submit property = "btnsubmit1" value="btnsubmit1"/>
		
		<br/><br/><html:submit property = "beforelogin" value="beforelogin"/>
		</html:form>
	</body>
</html>

