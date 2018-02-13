package bean;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public abstract class Donnee {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id = null;
	
	@Enumerated(EnumType.STRING)
	@Column(name="type")
	private DonneeType type = null;
	
	private String nom = null;
	private String unite = null;
	private Object valeur = null;
	
	public Donnee() {
		
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public DonneeType getType() {
		return type;
	}
	
	public void setType(DonneeType type) {
		this.type = type;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getUnite() {
		return unite;
	}
	
	public void setUnite(String unite) {
		this.unite = unite;
	}
	
	public Object getValeur() {
		return valeur;
	}
	
	public void setValeur(Object valeur) {
		this.valeur = valeur;
	}
	
}
