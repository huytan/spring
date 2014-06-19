<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<body>
<center>
<h2>Employee search form</h2>
<form:form id="seach" name="seach" action="searchemployee.htm"
	method="post" commandName="search">
	<table>
		<tr>
			<td>Id :</td>
			<td><form:input path="id" /></td>
		</tr>
		<tr>
			<td>Name :</td>
			<td><form:input path="name" /></td>
		</tr>
		<tr>
			<td>Salary</td>
			<td><form:input path="salary" /></td>
		</tr>
		<tr>
			<td><input type="submit" value="Search" /></td>
		</tr>
	</table>
</form:form>
</center>
</body>
</html>
