<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
@import url(style.css);
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>GED PAGE D'ajoute des user</title>
</head>
<body>
<s:form action="adduser" >
	<s:textfield name="username" label="User Name"/>
	<s:password name="pwd" label="User Password "></s:password>
	<s:textfield name="cniuser" label="User CNI"/>
	<s:textfield name="nationuser" label="User Nationality"/>
	<s:textfield name="profitionuser" label="User Profession"/>
	<s:date name="brithdayuser" label="User BirthDay"/>
	<s:textfield name="email" label="User Email"></s:textfield>



</s:form>

</body>
</html>