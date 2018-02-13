package dao;

import java.util.List;

import javax.persistence.EntityTransaction;

import bean.Utilisateur;

public class UserDao {
	//Enregistrer un nouvel utilisateur.
	public void registerUser(Utilisateur user)
	{
		EntityTransaction tx = Dao.em.getTransaction();
		tx.begin(); //Connection à la base.
		Dao.em.persist(user); //Envoyer l'objet à hibernate.
		tx.commit(); //Appiquer le changement sur la base.
	}
	
	//Supprimer un utilisateur.
	public void deleteUser(Utilisateur user)
	{
		EntityTransaction tx = Dao.em.getTransaction();
		tx.begin(); //Connection à la base.
		Dao.em.remove(user); //Envoyer l'objet à hibernate.
		tx.commit(); //Appliquer le changement sur la base.
	}
	
	//Modifier un utilisateur.
	public void updateUser(Utilisateur user)
	{
		EntityTransaction tx = Dao.em.getTransaction();
		tx.begin(); //Connection à la base.
		Dao.em.merge(user); //Envoyer l'objet à hibernate.
		tx.commit(); //Appliquer le changement sur la base.
	}
	
	//Authentification d'un utilisateur.
	@SuppressWarnings("unchecked")
	public boolean userAuthentication(String pseudo, String password)
	{
		EntityTransaction tx = Dao.em.getTransaction();
		tx.begin(); //Connection à la base.
		List<Utilisateur> userList = Dao.em.createQuery("select u from User where c.pseudo = :param").setParameter("param", pseudo).getResultList();
		tx.commit(); //Appiquer le changement sur la base.
		
		//Il ne doit y avoir qu'un seul utilisateur avec ce nom.
		if(userList.isEmpty() || userList.size() > 1)
			return false;
		
		//Récupération de l'utilisateur ayant ce nom.
		Utilisateur user = userList.get(0);
		
		//Cryptage en MDP5 du password passé en paramètre.
		String cryptedPassword = Dao.md5(user.getSel() + password);
		
		//Vérification de la validité du mot de passe entré par l'utilisateur.
		return user.getPassword().equals(cryptedPassword);
	}
}
