package com.ogtime.clinicplus.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ogtime.clinicplus.metier.implement.MedecinMetier;

@Controller
@RequestMapping(value="/medecin")
public class MedecinController {
	
	@Autowired
	private MedecinMetier medecinMetier;
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public ModelAndView ajouterMedecin() {
		ModelAndView modelAndView = new ModelAndView("index");
		modelAndView.addObject("medecin", new MedecinMetier());
		return modelAndView;
	}

}
