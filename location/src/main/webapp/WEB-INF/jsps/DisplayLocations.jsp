<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
 <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<th>id</th>
<th>name</th>
<th> code</th>
<th> type</th>
</tr>

<c:forEach items="${locations}"  var="locations">
<tr>
<td>${locations.id}</td>
<td>${locations.name}l</td>
<td>${ locations.code} </td>
<td> ${locations.type }</td>
<td><a href="DeleteLocation?id=${locations.id}"> delete</a></td>
<td><a href="EditLocation?id=${locations.id}"> edit</a></td>
</tr>
</c:forEach>
</table>
<a href="ShowCreate"> add location</a>
</body>
</html>