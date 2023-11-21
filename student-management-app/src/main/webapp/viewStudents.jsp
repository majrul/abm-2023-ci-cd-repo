<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<table>
	<thead>
		<tr><th>Rollno</th><th>Name</th><th>Email</th><th>City</th></tr>
	</thead>
	<tbody>
		<c:forEach items="${students}" var="s">
			<tr>
				<td>${s.rollno}</td>
				<td>${s.name}</td>
				<td>${s.email}</td>
				<td>${s.city}</td>		
				<td>
					<a href="edit-student?rollno=${s.rollno}">Edit</a> | 
					<a href="delete-student?rollno=${s.rollno}">Delete</a>
				</td>		
			</tr>
		</c:forEach>
	</tbody>
</table>
</body>
</html>
