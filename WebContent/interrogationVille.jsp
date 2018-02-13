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
	</head>
	<body>		
		<jsp:include page="navBarConnecte.jsp"></jsp:include>
<canvas id="myChart" width="" height=""></canvas>
<script>
var ctx = document.getElementById("myChart").getContext('2d');
var date = new Date();
var jours = ["Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche"];
var labels = [jours[date.getDay() - 1], jours[date.getDay()], 
		jours[date.getDay() + 1], 
		jours[date.getDay() + 2], 
		jours[date.getDay() + 3], 
		jours[date.getDay() + 4]];
var temperatures = [12, 19, 3, 5, 2, 3];
var myChart = new Chart(ctx, {
    type: 'line',
    data: {
        labels: labels,
        datasets: [{
            label: 'Jours de la semaine',
            data: temperatures,
            backgroundColor: [
                'rgba(25, 99, 132, 0.2)',
                'rgba(54, 162, 235, 0.2)',
                'rgba(255, 206, 86, 0.2)',
                'rgba(75, 192, 192, 0.2)',
                'rgba(153, 102, 255, 0.2)',
                'rgba(255, 159, 64, 0.2)'
            ],
            borderColor: [
                'rgba(255,99,132,1)',
                'rgba(54, 162, 235, 1)',
                'rgba(255, 206, 86, 1)',
                'rgba(75, 192, 192, 1)',
                'rgba(153, 102, 255, 1)',
                'rgba(255, 159, 64, 1)'
            ],
            borderWidth: 1
        }]
    },
    options: {
        scales: {
            yAxes: [{
                ticks: {
                    beginAtZero:true
                }
            }]
        }
    }
});
</script>
	</body>
</html>