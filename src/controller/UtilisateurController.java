package controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import bean.Utilisateur;
import bean.UtilisateurInscription;
import dao.Dao;

@Controller
public class UtilisateurController {

	//@Autowired
	//DaoUtilisateur daoUtilisateur;
	
	public UtilisateurController() {
		
	}

	@RequestMapping(value="/listerUtilisateurs",method=RequestMethod.GET)
	public @ResponseBody List<UtilisateurInscription> listerUtilisateurs() {		
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
	public @ResponseBody Resultat ajouterUtilisateur(
			@ModelAttribute @Valid UtilisateurInscription u, BindingResult bres) {
		Resultat res = new Resultat();
		
		if(bres.hasErrors()) {
			res.setRes(false);
			for (FieldError fe : bres.getFieldErrors()) {
				res.getErr().add(fe.getDefaultMessage());
			}
			return res;
		}
		
		/*boolean presence = daoUtilisateur.verifierPresenceUtilisateur(u);
		
		if(presence) {
			res.setRes(false);
			res.getErr().put("Pseudo", "Ce pseudo existe déjà");
		}
		*/
		
		res.setRes(true);	
		
		return res;
	}
}
