<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Gestion Electronique de Documents </title>
</head>
<body>
<s:form action="verify">
 
<s:textfield name="name" label="Enter Username" /><br>
<s:password name="password" label="Enter Password" /><br>
<s:submit value="Connecter" align="center" />
 
</s:form>

</body>
</html>