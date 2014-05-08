package com.ogtime.clinicplus.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ogtime.clinicplus.metier.implement.HoraireMetier;

@Controller
@RequestMapping(value="/horaire")
public class HoraireController {
	
	@Autowired
	private HoraireMetier horaireMetier;
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public ModelAndView ajouterHoraire() {
		ModelAndView modelAndView = new ModelAndView("index");
		modelAndView.addObject("horaire", new HoraireMetier());
		return modelAndView;
	}

}