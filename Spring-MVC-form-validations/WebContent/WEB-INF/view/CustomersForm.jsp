<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.errortext{
	color:red;
}

</style>

</head>
<body>

<h1>please register your car here</h1>

<form:form action="processForm" modelAttribute="customer">


First Name:(*) <form:input path="firstName" placeholder="enter your firstName"/>
<form:errors path="firstName" cssClass="errortext" />



<br><br>
First Name:(*) <form:input path="lastName" placeholder="enter your lastName"/>
<form:errors path="lastName" cssClass="errortext" />

<br><br>

freePass:(*) <form:input path="freePass" placeholder="enter your freePass"/>
<form:errors path="freePass" cssClass="errortext" />

<br><br>




<input type="submit" value="Submit">





</form:form>
</body>
</html>