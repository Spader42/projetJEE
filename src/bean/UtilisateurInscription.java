package bean;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class UtilisateurInscription extends Utilisateur{

	@NotEmpty(message="Le nom ne peut pas être vide")
	String nom;

	@NotEmpty(message="Le prénom ne peut pas être vide")
	String prenom;

	@NotEmpty(message="L'adresse mail ne peut pas être vide")
	String email;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSel() {
		return sel;
	}
	public void setSel(String sel) {
		this.sel = sel;
	}
	String sel;
}