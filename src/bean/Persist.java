package bean;

import dao.Dao;

public class Persist {
	public static void main(String [] args) {	
		Dao.ouvrir();
		
		Utilisateur user = new Utilisateur();
		user.setPseudo("Romain");
		user.setMail("romain@jee.com");
		user.setPassword("1234");
			
		Dao.getUserDao().registerUser(user);

		Dao.fermer();
	}

}
