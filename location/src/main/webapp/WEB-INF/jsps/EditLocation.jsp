<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="updateLoc" method="post">
<pre>
id:<input type="text"  name="id" value="${location.id}" readonly="true" />
name:<input type="text" name="name" value="${location.name}" />
code:<input type="text"  name="code" value="${location.code}"/>

type: Urban <input type="radio" name="type" value="urabn" ${location.type=='urban'?'checked':''}/>
	  Rural <input type="radio" name="type" value="rural"${location.type=='rural'?'checked':''}/>
	  <input type="submit" value="save"/>
	  </pre>
</form>
</body>
</html>