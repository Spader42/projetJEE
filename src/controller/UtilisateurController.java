package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import bean.Utilisateur;
import dao.Dao;

@Controller
public class UtilisateurController {

	public UtilisateurController() {
		
	}

	@RequestMapping(value="/listerUtilisateurs",method=RequestMethod.GET)
	public @ResponseBody List<Utilisateur> listerUtilisateurs() {		
		System.out.println("UtilisateurController: listerUtilisateurs");
		return null;
	}
	
	@RequestMapping(value="/verifierUtilisateur",method=RequestMethod.GET)
	public @ResponseBody boolean verifierUtilisateur() {		
		System.out.println("UtilisateurController: verifierUtilisateur");
		return false;
	}
	
	@RequestMapping(value="/ajouterUtilisateur",method=RequestMethod.GET)
	public @ResponseBody void ajouterUtilisateur() {		
		System.out.println("UtilisateurController: ajouterUtilisateur");
	}
}
