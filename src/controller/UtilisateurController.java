package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import dao.Dao;

@Controller
public class UtilisateurController {

	public UtilisateurController() {
		
	}
	
	@RequestMapping(value="/listerUtilisateurs",method=RequestMethod.GET)
	public @ResponseBody String listerUtilisateurs() {		
		System.out.println("UtilisateurController: listerUtilisateurs");
		return "listerUtilisateurs";
	}
}
