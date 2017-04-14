<!doctype html>
<html>
<head>
	<title>Contact Page</title>
	<link rel="stylesheet" href="styles/main.css" type ="text/css">
</head>
<body>
	<h1>This is my contact page!</h1>
	<p>To connect with me, enter your name and email address below.</p>
	<p>To learn more about me, visit my <a href="bio.html">Bio Page</a>.</p>
	<p>You can go back to my <a href="index.jsp">home page.</a>
	
	<p id='message'><em>${message}</em></p>
	
	<form action="connect" method="post">
		<label for ="firstName">First name:</label>
		<input name="firstName" value ="${user.firstName}"><br>
		
		<label for ="lastName">Last name:</label>
		<input name="lastName" value ="${user.lastName}"><br>
		
		<label for ="email">email:</label>
		<input name="email" value ="${user.email}"><br>
		
		<input type="submit" value="Connect!">
	</form>
</body>
</html>