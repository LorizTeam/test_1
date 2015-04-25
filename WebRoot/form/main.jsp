<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
 
<html> 
	<head>
		<title>JSP for MainForm form</title>
	</head>
	<body>
		<html:form action="/main">
			<%request.getAttribute("showuser"); %>
			<%String showuser = (String)request.getAttribute("showuser"); %>
			<%=showuser %><br/>
			username : <html:text property="username"  /><br/>
			password : <html:text property="password" value = "<%=showuser %>"/><br/>
			name : <html:text property="name"/><br/>
			lastname : <html:text property="lastname"/><br/>
			address : <html:text property="address"/><br/>
			<html:submit/><html:cancel/>
		</html:form>
	</body>
</html>

