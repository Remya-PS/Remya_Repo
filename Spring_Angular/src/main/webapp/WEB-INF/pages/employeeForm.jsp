<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Form</title>
<link type="text/css" rel="stylesheet" href="../css/myStyles.css">
<script type="text/javascript" src="../script/angular.min.js"></script>
<script type="text/javascript" src="../script/myscript.js"></script>
</head>
<body>


<h1>Employee Form</h1>

<h3 class="message">${msg}</h3>


<img alt="Micky" src="../images/micky2.jpg">

<div ng-app="myApp">
 <div ng-controller="ctrl">
	<h2>{{emp.empId }}</h2>
	<h2>{{emp.firstName }}</h2>
	<h2>{{emp.lastName}}</h2>
	<h2>{{emp.salary}}</h2>
</div>


<div ng-controller="myCtrl">
	<!-- <ul>
		<li ng-repeat="dep in depart">{{dep}} </li>
	
	</ul> -->
	
	<select name="department">
		<option ng-repeat="dep in depart" value="{{dep}}">{{dep}}</option>
	</select>

</div>

</div>
<!-- <div ng-app="">
<input type="text" ng-model="userName">
<p ng-bind="userName"></p>

</div>
 -->
</body>
</html>