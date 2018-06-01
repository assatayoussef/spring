<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="saveLoc" method="post">
<pre>
id:<input type="text"  name="id"/>
name:<input type="text" name="name"/>
code:<input type="text"  name="code"/>

type: Urban <input type="radio" name="type" value="urabn"/>
	  Rural <input type="radio" name="type" value="rural"/>
	  <input type="submit" value="save"/>
	  </pre>
</form>
${msg }
<a href="DisplayLocations">show</a>

</body>
</html>