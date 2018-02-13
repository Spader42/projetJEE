package bean;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class Utilisateur {

	@Size(min=5, message="Le pseudo doit avoir au moins 5 caractères")
	String login;

	@Size(min=5, max=15, message="Le mot de passe doit faire entre 5 et 15 caractères")
	String motDePasse;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
}