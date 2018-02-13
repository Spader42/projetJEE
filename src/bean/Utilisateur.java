package bean;

import java.util.Random;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import dao.Dao;

@Entity
@Table(name = "user")
public class Utilisateur {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id = null;


	@NotEmpty(message="Le nom ne peut pas être vide")
	private String nom = null;

	@NotEmpty(message="Le prénom ne peut pas être vide")
	private String prenom = null;
	
	@Size(min = 3, max = 15, message = "Le pseudo doit contenir entre 3 et 15 caractères")
	@NotEmpty(message="Le pseudo ne peut pas être vide")
	private String pseudo = null;

	@Size(min = 5, max = 15, message = "Le mot de passe doit contenir entre 5 et 15 caractères")
	@NotEmpty(message="Le password ne peut pas être vide")
	private String password = null;

	@NotEmpty(message="Le mail ne peut pas être vide")
	private String mail = null;
	
	private String sel = null;
	
	public Utilisateur() {
		//Définition des valeurs possibles pour le sel.
		char possibleSel[] =
			{	'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
				'0','1','2','3','4','5','6','7','8','9'
			};
		
		//Sélection aléatoire d'une valeur parmi celles possibles.
		Random rand = new Random();
		int index = rand.nextInt(possibleSel.length - 0 + 1) + 0;
		
		//Définition du sel par cette valeur précédemment choisi.
		this.sel = String.valueOf(possibleSel[index]);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = Dao.md5(this.sel + password);
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getSel() {
		return sel;
	}

	public void setSel(String sel) {
		this.sel = sel;
	}
}