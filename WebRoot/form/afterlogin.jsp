<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
 
<html> 
	<head>
		<title>JSP for AfterloginForm form</title>
	</head>
	<body>
		<html:form action="/afterlogin">
			username : <html:text property="username"/><html:errors property="username"/><br/>
			address : <html:text property="address"/><html:errors property="address"/><br/>
			name : <html:text property="name"/><html:errors property="name"/><br/>
			lastname : <html:text property="lastname"/><html:errors property="lastname"/><br/>
			password : <html:text property="password"/><html:errors property="password"/><br/>
			<html:submit/><html:cancel/>
		</html:form>
	</body>
</html>

