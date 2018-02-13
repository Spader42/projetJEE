package controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import bean.Utilisateur;
import dao.Dao;

@Controller
public class UtilisateurController {

	//@Autowired
	//DaoUtilisateur daoUtilisateur;
	
	public UtilisateurController() {
		
	}

	@RequestMapping(value="/listerUtilisateurs",method=RequestMethod.GET)
	public @ResponseBody List<Utilisateur> listerUtilisateurs() {		
		System.out.println("UtilisateurController: listerUtilisateurs");
		return null;
	}
	
	@RequestMapping(value="/verifierUtilisateur",method=RequestMethod.GET)
	public @ResponseBody boolean verifierUtilisateur(
			@ModelAttribute @Valid Utilisateur u, BindingResult bres) {
		if(bres.hasErrors())
			return false;
		// return daoUtilisateur.verifierUtilisateur(u);
		return true;
	}
	
	@RequestMapping(value="/ajouterUtilisateur",method=RequestMethod.GET)
	public @ResponseBody void ajouterUtilisateur(
			@ModelAttribute @Valid Utilisateur u, BindingResult bres) {		
		System.out.println("UtilisateurController: ajouterUtilisateur");
	}
}
