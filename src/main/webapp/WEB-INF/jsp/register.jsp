<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Page</title>

<script type="text/javascript">
	function showLoginPage() {
		var form=document.getElementById('userform');
		form.action = "${pageContext.request.contextPath}/login.htm";
		form.submit();
	}
</script>

</head>
<body>
	Welcome To Register Page ..............
	<c:url var="saveUser" value="/user/saveuser.htm" />
	<form:form modelAttribute="userModel" method="POST" action="${saveUser}" id="userform">
		<table>
				<tr>
					<td>User Registration</td>
				</tr>
				<tr>
					<td>
						<form:label path="userName">User Name:</form:label>
						<form:input path="userName"	/>
					</td>
				</tr>
				
				<tr>
					<td>
						<form:label path="password" >Password:</form:label>
						<form:password path="password"	/>
					</td>
				</tr>
				
				<tr>
					<td>
						<form:label path="city">City:</form:label>
						<form:input path="city"	/>
					</td>
				</tr>
				
				<tr>
					<td>
						<form:label path="country">Country :</form:label>
						<form:input path="country" />
					</td>
				</tr>
				<tr>
					<td>
						<input type="submit" value="Save" /> 
						<input type="button" value="Cancel" onclick="showLoginPage();" />
					</td>
				</tr>
			</table>
	</form:form>
	
</body>
</html>