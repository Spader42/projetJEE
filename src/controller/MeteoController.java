package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import dao.Dao;

@Controller
public class MeteoController {

	@Autowired
	Dao dao;
	
	public MeteoController() {
		
	}
	
	@RequestMapping(value="/consulterMeteo",method=RequestMethod.POST)
	public @ResponseBody String consulterMeteo() {		
		return "consulterMeteo";
	}
}