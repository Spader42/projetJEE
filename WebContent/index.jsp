<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<script src="Scripts/js/Chart.min.js"></script><script src="Scripts/js/sweetalert2.all.js"></script>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
		<link rel="stylesheet" type="text/css" href="Styles/css/Bootstrap/bootstrap.css">
		<title>Météo Bretagne</title>
		<script>		
			function UtilisateurInscription(login, password, nom, prenom, email, sel) {
				this.login = login;
				this.motDePasse = password;
				this.nom = nom;
				this.prenom = prenom;
				this.email = email;
				this.sel = sel;
			}
			
			function Utilisateur(login, password) {
				this.login = login;
				this.motDePasse = password;
			}
		
			function inscription() {
				let login = document.getElementById("pseudo").value;
				let motDePasse = document.getElementById("motDePasse").value;
				let nom = document.getElementById("nom").value;
				let prenom = document.getElementById("prenom").value;
				let email = document.getElementById("email").value;
				let sel = null;
				let u = new UtilisateurInscription(login, motDePasse, nom, prenom, email, sel);				
	
				console.log(u);
				
				$.ajax({
					method : "get",
					url : "ajouterUtilisateur.htm",
					data : u,
					dataType : "json",
					success : function(data) {
						if (!data.res) {
							let errorMessage = "";
							data.err.forEach(function(message) {
								errorMessage += "</br>	"
								errorMessage += message;
							})
							swal('Désolé', errorMessage, 'error');
						}
						else {
							swal('Bienvenue ' + login, 'Veuillez entrer vos identifiants pour vous connecter', 'success').then(function() { connect(); });
						}						
					}
				});
			}
			
			async function connect() {	
				const {value: pseudo} = await swal({
				  title: 'Pseudo',
				  input: 'text',
				  inputPlaceholder: 'Pseudo...',
				})
	
				if (!pseudo) {
					return;
				}
				
				const {value: password} = await swal({
				  title: 'Mot de passe',
				  input: 'password',
				  inputPlaceholder: 'Mot de passe...',
				})

				if (password) {
					let u = new Utilisateur(pseudo, password);
					console.log(u);
					$.ajax({
						method : "get",
						url : "verifierUtilisateur.htm",
						data : u,
						dataType : "json",
						success : function(data) {
							if (data) {								
								swal('Bonjour ' + pseudo, '', 'success');
							}
							else {
								swal('Erreur', 'Login ou mot de passe incorrect', 'error');
							}
							
						}
					});
				}
			}
			
			function connected() {
				$.ajax({
					method : "get",
					url : "indexConnection.htm",
					success : function(data) {
						if (data) {								
							swal('Bonjour ' + pseudo, '', 'success');
						}
						else {
							swal('Erreur', 'Login ou mot de passe incorrect', 'error');
						}
						
					}
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