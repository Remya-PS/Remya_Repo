<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="/WEB-INF/mytag.tld" prefix="vi" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>


<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Details</title>
<style type="text/css">
.errMsg{
	color: red;
	font-size: 14px;
	font-weight: bold;
}

</style>


<link rel="stylesheet" type="text/css" href="css/mystyles.css">
<link rel="stylesheet" type="text/css" href="css/jquery-ui-1.9.2.custom.css">
<link rel="stylesheet" type="text/css" href="css/jquery-ui-1.9.2.custom.min.css">
<script type="text/javascript" src="script/jquery-1.8.3.js"></script>
<script type="text/javascript" src="script/jquery-ui-1.9.2.custom.js"></script>
<script type="text/javascript" src="script/jquery-ui-1.9.2.custom.min.js"></script> 
<script type="text/javascript" src="script/myScript.js"></script> 

<script type="text/javascript" src="script/datepicker.js"></script>


</head>
<body>
<h1 align="center">Employee Details</h1>
<div style="width: 600px; float: left; margin-left: 200px;">
<c:if test="${empSearch == null}">
<form:form method="post" action="showEmployee" commandName="emp">
	<table id="myForm">
		<%-- <tr>
			<td>Employee Id</td>
			<td><form:input path="empId"/></td>
			<td><form:errors path=""></form:errors></td>
		</tr> --%>
	
		<tr>
			<td style="width: 200px;">Employee FirstName:</td>
			<td style="width: 200px;"><form:input path="firstName"/></td>
			<td style="width: 200px;"><form:errors path="firstName" cssClass="errMsg"></form:errors>
			</td>
		</tr>
		
		<tr>
			<td>Employee LastName:</td>
			<td><form:input path="lastName"/></td>
			<td></td>
		</tr>
		
		<tr>
			<td>Employee Salary:</td>
			<td><form:input path="salary"/></td>
		<td><form:errors path="salary" cssClass="errMsg"></form:errors></td>
		
		</tr>
		
		<tr>
			<td>Employee Age:</td>
			<td><form:input path="age"/></td>
				<td><form:errors path="age" cssClass="errMsg"></form:errors></td>
		
		</tr>
	
		<tr>
			<td>Date of Birth:</td>
			<td><form:input path="empDob" id="dateSelection"/></td>
			<td><form:errors path="empDob" cssClass="errMsg" style="width: 200px;"></form:errors></td>
		
		</tr>
		
		<tr>
			<td>Date of Joining:</td>
			<td><form:input path="empDoj" id="dateSelection1"/></td>
				<td><form:errors path="empDoj" cssClass="errMsg" style="width: 200px;"></form:errors></td>
		
		</tr>
	
		<tr>
			<td>Email Id:</td>
			<td><form:input path="email"/></td>
				<td><form:errors path="email" cssClass="errMsg"></form:errors></td>
		
		</tr>
	
		<tr>
		<td></td>
		<td>
		
			<input type="submit" value="Save">
			
		</td>
		</tr>
	
	</table>

</form:form>

</c:if>
<%-- <c:out value="${empSearch.empId}"></c:out> --%>


<c:if test="${empSearch != null }">

<form:form method="post" action="updateEmployee"  commandName="emp">
	<table>
		 <tr style="visibility: hidden;"> 
			<td style="width: 200px;">Employee Id</td>
			<td><form:input path="empId" value="${emp.empId }"/></td>
			<td style="width: 200px;"><form:errors path=""></form:errors></td>
		</tr>
	
		<tr>
			<td>Employee FirstName:</td>
			<td><form:input path="firstName" value="${emp.firstName}"/></td>
			<td><form:errors path="firstName" cssClass="errMsg"></form:errors></td>
		</tr>
		
		<tr>
			<td>Employee LastName:</td>
			<td><form:input path="lastName" value="${emp.lastName}"/></td>
			<td></td>
		</tr>
		
		<tr>
			<td>Employee Salary:</td>
			<td><form:input path="salary" value="${emp.salary}"/></td>
		<td><form:errors path="salary" cssClass="errMsg" ></form:errors></td>
		
		</tr>
		
		<tr>
			<td>Employee Age:</td>
			<td><form:input path="age" value="${emp.age}"/></td>
				<td><form:errors path="age" cssClass="errMsg" ></form:errors></td>
		
		</tr>
	
		<tr>
			<td>Date of Birth:</td>
			<td><form:input path="empDob" value="${edob}"   id="dateSelection"/></td>
				<td><form:errors path="empDob" cssClass="errMsg" ></form:errors></td>
		
		</tr>
		
		<tr>
			<td>Date of Joining:</td>
			<td><form:input path="empDoj" value="${edoj}" id="dateSelection1"/></td>
				<td><form:errors path="empDoj" cssClass="errMsg" ></form:errors></td>
		
		</tr>
	
		<tr>
			<td>Email Id:</td>
			<td><form:input path="email" value="${emp.email}"/></td>
				<td><form:errors path="email" cssClass="errMsg" ></form:errors></td>
		
		</tr>
	
		<tr>
		<td></td>
		<td>
			<input type="submit" value="Update">
		</td>
		</tr>
	
	</table>

</form:form>

</c:if>


</div>
<div style="float:left; width: 300px; height: 200px;">
	<img alt="Micky" src="images/micky2.jpg">
</div>
<br>
<div style=" width: 900px;">
<c:if test="${!empty emps }">
	<table>
		<tr>
			<th>EmployeeId</th>
			<th>FirstName</th>
			<th>LastNAme</th>
			<th>Salary</th>
			<th>Age</th>
			<th>Date of Birth</th>
			<th>Date of Joining</th>
			<th>Email</th>
			<th>Edit</th>
		</tr>
		<c:forEach items="${emps}" var="employee">
			<tr>
			<td>${ employee.empId}</td>
			<td>${ employee.firstName}</td>
			<td>${ employee.lastName}</td>
			<td>${ employee.salary}</td>
			<td>${ employee.age}</td>
			<td><vi:myDateFormat>${ employee.empDob}</vi:myDateFormat> </td>
			<td><vi:myDateFormat>${ employee.empDoj}</vi:myDateFormat></td>
			<td>${ employee.email}</td>
			
			<td><a href="deleteEmployee/${ employee.empId}">Delete</a>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<a href="updateEmployee/${ employee.empId}">Update</a>
			</td>
	</tr>
		</c:forEach>
	
	</table>


</c:if>
</div>


</body>
</html>