package bean;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "vent")
public class Vent extends Donnee {
	private String Direction;

	public String getDirection() {
		return Direction;
	}

	public void setDirection(String direction) {
		Direction = direction;
	}
}
