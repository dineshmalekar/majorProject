<html>
<head>
</head>
<body>
<form name="userform" method="post" action="<%=request.getContextPath()%>/addusers">
<br><br><br>
<table align="center" width="300px" style="background-color:#EDF6EA;border:1px solid #000000;">
<tr><td colspan=2 style="font-weight:bold;" align="center">Add User</td></tr>
<tr><td colspan=2 align="center" height="10px"></td></tr>
	<tr>
		<td style="font-weight:bold;">First Name</td>
		<td><input type="text" name="firstname" value=""></td>
	</tr>
	<tr>
		<td style="font-weight:bold;">Last Name</td>
		<td><input type="text" name="lastname" value=""></td>
	</tr>
	<tr>
		<td style="font-weight:bold;">UserName</td>
		<td><input type="text" name="username" value=""></td>
	</tr>
	<tr>
		<td style="font-weight:bold;">Password</td>
		<td><input type="password" name="password" value=""></td>
	</tr>
	
	<tr>
		<td style="font-weight:bold;">Phone</td>
		<td><input type="text"  name="phone" rows=5 cols=25></td>
	</tr>
	<tr>
		<td style="font-weight:bold;">Email</td>
		<td><input type="text" name="email" value=""></td>
	</tr>
	
	<tr>
		<td></td>
		<td><input type="submit" name="add_user" value="Save" style="background-color:#49743D;font-weight:bold;color:#ffffff;"></td>
	</tr>
	<tr><td colspan=2 align="center" height="10px"></td></tr>
</table>
</form>


</body>
</html>


