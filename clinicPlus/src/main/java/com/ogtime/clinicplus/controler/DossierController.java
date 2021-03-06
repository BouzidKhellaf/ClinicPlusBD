package com.ogtime.clinicplus.controler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ogtime.clinicplus.metier.implement.DossierMetier;

@Controller
@RequestMapping(value="/dossier")
public class DossierController {

	@SuppressWarnings("unused")
	private DossierMetier dossierMetier;
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public ModelAndView ajouterDossier() {
		ModelAndView modelAndView = new ModelAndView("index");
		modelAndView.addObject("dossier", new DossierMetier());
		return modelAndView;
	}

}
