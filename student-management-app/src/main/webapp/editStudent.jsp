<html>
<body>
<form action="update-student">
Rollno : <input type="text" name="rollno" readonly value="${student.rollno}" /> <br />
Name : <input type="text" name="name" value="${student.name}" /> <br />
Email : <input type="text" name="email" value="${student.email}" /> <br />
City : <input type="text" name="city" value="${student.city}" /> <br />
<button type="submit">Update</button>
</form>
</body>
</html>