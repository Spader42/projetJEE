package bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "commentaire")
public class Commentaire {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id = null;
	private Integer releveId = null;
	private Integer userId = null;
	private String photo = null;
	private String text = null;
	
	public Commentaire(Integer releveId, Integer userId) {
		this.releveId = releveId;
		this.userId = userId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getReleveId() {
		return releveId;
	}

	public void setReleveId(Integer releveId) {
		this.releveId = releveId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
