package dao;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Dao {
	public static EntityManager em;
	private static UserDao userDao = null;
	
	public static UserDao getUserDao() {
		if(Dao.userDao == null)
			Dao.userDao = new UserDao();
		return Dao.userDao;
	}

	public static void setUserDao(UserDao userDao) {
		Dao.userDao = userDao;
	}
	
	public static String md5(String password) {
		byte[] uniqueKey = password.getBytes() ;
		byte[] hash = null ;
		try {
			hash = MessageDigest.getInstance("MD5").digest(uniqueKey) ;
		} catch (NoSuchAlgorithmException e) {
			return null;
		}
		StringBuffer hashString = new StringBuffer() ;
		for ( int i = 0 ; i < hash.length ; ++i ) {
			String hex = Integer.toHexString(hash[i]) ;
			if ( hex.length() == 1 ) {
			hashString.append(0) ;
			hashString.append(hex.charAt(hex.length()-1)) ;
			} else {
			hashString.append(hex.substring(hex.length()-2)) ;
			}
		}
		return hashString.toString() ;
	}
	
	public static void ouvrir()
	{
		String name = "persistence.xml";
		//Session hibernate.
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(name); //Nom indiqué dans le fichier XML "persistence.xml".
		Dao.em = emf.createEntityManager();
	}
	
	public static void fermer()
	{
		if(Dao.em != null) Dao.em.close();
	}
}
