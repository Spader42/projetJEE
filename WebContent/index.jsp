<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<script src="Scripts/js/Chart.min.js"></script><script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
		<link rel="stylesheet" type="text/css" href="Styles/css/Bootstrap/bootstrap.css">
		<title>Météo Bretagne</title>
		<script>
			function connect() {
				swal("Login :", {
					  content: "input"
					})
					.then((value) => {
						swal("Password",  {
							  content: {
							    element: "input",
							    attributes: {
							      type: "password",
							    },
							  },
							});
					});
			}
		</script>
	</head>
	<body>		
		<jsp:include page="navBar.jsp"></jsp:include>
		<jsp:include page="carousel.jsp"></jsp:include>
		<jsp:include page="inscription.jsp"></jsp:include>
		<jsp:include page="footer.jsp"></jsp:include>
	</body>
</html>