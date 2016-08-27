<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<html>
<body>
	<%-- <s:actionmessage/> --%>
	<s:form action="s_Employee">
		<s:property value="errorMessage" />
		<s:textfield name="id" key="Id"></s:textfield>
		<s:textfield name="name" key="Name"></s:textfield>
		<s:textfield name="city" key="City"></s:textfield>
		<s:textfield name="state" key="State"></s:textfield>
		<s:submit name="operation" key="Add"></s:submit>
		<s:submit name="operation" key="Update"></s:submit>
		<s:submit name="operation" key="Delete"></s:submit>
		<s:submit name="operation" key="Get"></s:submit>
	</s:form>
	<s:a href="Employee?request_locale=en">English</s:a>
	<s:a href="Employee?request_locale=hi">Hindi</s:a>

</body>
</html>