<!doctype html>
<html>
<head>
	<title>Error Page</title>
	<link rel="sylesheet" href="styles/main.css" type ="text/css">
</head>
<body>
	<h1>Error!</h1>
	<p>Houston we have a problem.</p>
	
	<h2>Error Details</h2>
	<p>Type: ${pageContext.exception["class"]}</p>
	<p>Message: ${pageContext.exception.message}</p>
</body>
</html>