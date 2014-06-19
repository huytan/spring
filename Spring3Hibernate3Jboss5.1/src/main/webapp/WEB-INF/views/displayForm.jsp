<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<html>
<h2>Welcome</h2>
<a href="indexpage.htm">Click here for Home</a>

<h2 align="center">Employee Information</h2>
<body></body><center>
<display:table cellpadding="2" cellspacing="20" id="employee" name="employee" pagesize="10"
	export="false" requestURI="displayEmployee.htm">
	<display:column property="emp_id" title="Employee Id" sortable="true" />
	<display:column property="name" title="Employee Name"
		href="editdata.htm" paramId="id" paramProperty="emp_id"
		sortable="true" />
	<display:column property="address" title="Address" sortable="true" />
	<display:column property="salary" title="Salary" sortable="true" />
	<display:column value="Delete" href="deletedata.htm" paramId="id"
		paramProperty="emp_id" title="Delete" sortable="true" />
	<display:setProperty name="paging.banner.placement" value="bottom" />
</display:table>
</center>
</body>
</html>