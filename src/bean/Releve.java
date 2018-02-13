package bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "releve")
public class Releve {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id = null;
	private Integer donneeId = null;
	private Date date = null;
	private Localisation localisation = null;
	
	public Releve(Integer donneeId, Localisation localisation) {
		this.donneeId = donneeId;
		this.localisation = localisation;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDonneeId() {
		return donneeId;
	}

	public void setDonneeId(Integer donneeId) {
		this.donneeId = donneeId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Localisation getLocalisation() {
		return localisation;
	}

	public void setLocalisation(Localisation localisation) {
		this.localisation = localisation;
	}	
}
