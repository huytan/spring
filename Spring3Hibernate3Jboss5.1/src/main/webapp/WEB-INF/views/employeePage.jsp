<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<h2 align="center">Employee Registration</h2>
<body>
<center>
<form:form action="displayemployee.htm" method="POST"
	commandName="employeeForm">
	<table>
		<form:hidden path="id" />
		<tr>
			<td>Employee Name :</td>
			<td><form:input path="name" /></td>
			<td><form:errors path="name" /></td>
		</tr>
		<tr>
			<td>Address :</td>
			<td><form:textarea path="address"></form:textarea> <form:errors
				path="address"></form:errors></td>
		</tr>
		<tr>
			<td>Salary :</td>
			<td><form:input path="salary"></form:input> <form:errors
				path="salary" /></td>
		</tr>
		<tr>
			<td><input type="submit" value="Submit"></td>
		</tr>
	</table>
</form:form>
</center>
</body>
</html>