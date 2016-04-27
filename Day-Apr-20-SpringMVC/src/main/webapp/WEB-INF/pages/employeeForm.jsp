<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Form</title>
</head>
<body>

<form:form action="showEmployee" method="post" commandName="employee">
	<table>
		<tr>
			<td>Employee Id:</td>
			<td><form:input path="empId"/></td>
		</tr>
		
		<tr>
			<td>FirstName:</td>
			<td><form:input path="firstName"/></td>
			
	
		</tr>
		
		<tr>
			<td>LastName:</td>
			<td><form:input path="lastName"/></td>
		</tr>
		
		
		<tr>
			<td>Email Id:</td>
			<td><form:input path="emailId"/></td>
		</tr>
		
		<tr>
			<td>Salary :</td>
			<td><form:input path ="salary"/></td>
		</tr>
		
		<tr>
			<td>Age :</td>
			<td><form:input path="age"/></td>
		</tr>
		
		<tr>
			<td>Date of Birth :</td>
			<td><form:input path="empDob"/></td>
		</tr>
		
		<tr>
			<td>Date of Joining :</td>
			<td><form:input path="empDoj"/></td>
		</tr>
		
		<tr>
			<td>Password :</td>
			<td><form:input path="empPassword"/></td>
		</tr>

		<tr>
			<td>Department :</td>
			<td>
			
			<%-- <form:input path="department"/> --%>
			
			<form:select path="department">
				<c:if test="${!empty departs }">
					<c:forEach items="${departs}" var="depart">
						<form:option value="${depart}">${depart}</form:option>
					</c:forEach>
				</c:if>
				
			
			</form:select>
			
			
			</td>
		</tr>
	
	<tr>
		<td></td>
		<td>
			<input type="submit" value="Show"/>
		</td>
	</tr>
	
	</table>

</form:form>


</body>
</html>